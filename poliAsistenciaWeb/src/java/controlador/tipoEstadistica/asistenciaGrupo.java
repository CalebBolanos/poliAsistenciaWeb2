/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tipoEstadistica;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import serviciosWebGestion.Gestion_Service;

/**
 *
 * @author Caleb
 */
@WebServlet(name = "asistenciaGrupo", urlPatterns = {"/estadisticas/asistenciaGrupo"})
public class asistenciaGrupo extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/serviciosWebPoliAsistencia/gestion.wsdl")
    private Gestion_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        HttpSession usr = request.getSession();
        if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
            response.sendRedirect("../iniciarSesion");
            return;
        }
        try (PrintWriter out = response.getWriter()) {

            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                response.sendRedirect("../asistenciaIndividual");
            } else {
                if (tipoPersona == 3) {//profesor
                    response.sendRedirect("../estadisticas");
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        response.sendRedirect("../estadisticas");
                    } else {
                        if (tipoPersona == 1) {//gestion
                            response.sendRedirect("../estadisticas");
                        }
                    }
                }
            }

        } catch (Exception error) {
            response.sendRedirect("../iniciarSesion");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        HttpSession usr = request.getSession();
        if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
            response.sendRedirect("iniciarSesion");
            return;
        }
        try (PrintWriter out = response.getWriter()) {

            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                response.sendRedirect("../asistenciaIndividual");
            } else {
                if (tipoPersona == 3) {//profesor
                    response.sendRedirect("../estadisticas");
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        response.sendRedirect("../estadisticas");
                    } else {
                        if (tipoPersona == 1) {//gestion
                            String grupo = new String(request.getParameter("grupo").getBytes(), "UTF-8") != null ? new String(request.getParameter("grupo").getBytes(), "UTF-8") : "";
                            ArrayList<Object> datosGrupo = new ArrayList<>(datosGrupoEspecifico(grupo));
                            boolean valido = (boolean) datosGrupo.get(6);
                            if (!valido) {
                                response.sendRedirect("../estadisticas");
                                return;
                            }
                            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                            String numero = (String) usr.getAttribute("numero");
                            String nombre = (String) usr.getAttribute("nombre");
                            gestion.asistenciaGrupo persona = new gestion.asistenciaGrupo(idPersona, tipoPersona, numero, nombre, grupo);
                            out.print(persona.dibujarAsistenciaGrupo());
                        }
                    }
                }
            }
            out.flush();
            out.close();

        } catch (Exception error) {
            response.sendRedirect("../iniciarSesion");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private java.util.List<java.lang.Object> datosGrupoEspecifico(java.lang.String grupo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.datosGrupoEspecifico(grupo);
    }

}
