/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Caleb
 */
@WebServlet(name = "configuracion", urlPatterns = {"/configuracion"})
public class configuracion extends HttpServlet {

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
        String msj = request.getParameter("mensaje") != null ? request.getParameter("mensaje") : "";
        HttpSession usr = request.getSession();
        if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
            response.sendRedirect("iniciarSesion");
            return;
        }
        try (PrintWriter out = response.getWriter()) {

            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                int idTipo = tipoPersona;
                String nombre = (String) usr.getAttribute("nombre");
                String paterno = (String) usr.getAttribute("paterno");
                String materno = (String) usr.getAttribute("materno");
                String genero = (String) usr.getAttribute("genero");
                String boleta = (String) usr.getAttribute("boleta");
                String nacimiento = (String) usr.getAttribute("nacimiento");
                alumno.configuracion alumno = new alumno.configuracion(idPersona, idTipo, nombre, paterno, materno, genero, boleta, nacimiento);
                out.println(alumno.dibujarConfiguracion(msj));
            } else {
                if (tipoPersona == 3) {//profesor
                    int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                    int idTipo = tipoPersona;
                    String nombre = (String) usr.getAttribute("nombre");
                    String paterno = (String) usr.getAttribute("paterno");
                    String materno = (String) usr.getAttribute("materno");
                    String genero = (String) usr.getAttribute("genero");
                    String numero = (String) usr.getAttribute("numero");
                    String nacimiento = (String) usr.getAttribute("nacimiento");
                    profesor.configuracion profesor = new profesor.configuracion(idPersona, idTipo, nombre, paterno, materno, genero, numero, nacimiento);
                    out.print(profesor.dibujarConfiguracion(msj));
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                        String nombre = (String) usr.getAttribute("nombre");
                        String paterno = (String) usr.getAttribute("paterno");
                        String materno = (String) usr.getAttribute("materno");
                        String genero = (String) usr.getAttribute("genero");
                        String numero = (String) usr.getAttribute("numero");
                        String nacimiento = (String) usr.getAttribute("nacimiento");
                        jefeAcademia.configuracion jefe = new jefeAcademia.configuracion(idPersona, idPersona, nombre, paterno, materno, genero, numero, nacimiento);
                        out.print(jefe.dibujarConfiguracion(msj));
                    } else {
                        if (tipoPersona == 1) {//gestion
                            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                            String nombre = (String) usr.getAttribute("nombre");
                            String paterno = (String) usr.getAttribute("paterno");
                            String materno = (String) usr.getAttribute("materno");
                            String genero = (String) usr.getAttribute("genero");
                            String numero = (String) usr.getAttribute("numero");
                            String nacimiento = (String) usr.getAttribute("nacimiento");
                            gestion.configuracion persona = new gestion.configuracion(idPersona, idPersona, nombre, paterno, materno, genero, numero, nacimiento);
                            out.println(persona.dibujarConfiguracion(msj));
                        } else {

                        }
                    }
                }
                out.flush();
                out.close();
            }

        } catch (Exception error) {
            response.sendRedirect("iniciarSesion");
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

}
