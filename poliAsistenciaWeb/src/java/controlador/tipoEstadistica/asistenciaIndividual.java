/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tipoEstadistica;

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
@WebServlet(name = "asistIndividual", urlPatterns = {"/estadisticas/asistenciaIndividual"})
public class asistenciaIndividual extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

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
            response.sendRedirect("iniciarSesion");
            return;
        }
        try (PrintWriter out = response.getWriter()) {

            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                response.sendRedirect("../asistenciaIndividual");
            } else {
                if (tipoPersona == 3) {//profesor
                    int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                    String numero = (String) usr.getAttribute("numero");
                    String nombre = (String) usr.getAttribute("nombre");
                    profesor.asistenciaIndividual profesor = new profesor.asistenciaIndividual(idPersona, tipoPersona, numero, nombre);
                    out.print(profesor.dibujarAsistenciaIndividual());
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                        String numero = (String) usr.getAttribute("numero");
                        String nombre = (String) usr.getAttribute("nombre");
                        jefeAcademia.asistenciaIndividual jefe = new jefeAcademia.asistenciaIndividual(idPersona, tipoPersona, numero, nombre);
                        out.print(jefe.dibujarAsistenciaIndividual());
                    } else {
                        if (tipoPersona == 1) {//gestion
                            response.sendRedirect("../estadisticas");
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
            if (tipoPersona == 1) {//gestion
                int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                String nombreAlumno = new String(request.getParameter("idPersona").getBytes(), "UTF-8") != null ? new String(request.getParameter("idPersona").getBytes(), "UTF-8") : "";
                String idAlumno = new String(request.getParameter("boleta").getBytes(), "UTF-8") != null ? new String(request.getParameter("boleta").getBytes(), "UTF-8") : "";
                String numero = (String) usr.getAttribute("numero");
                String nombre = (String) usr.getAttribute("nombre");
                gestion.asistenciaIndividual persona = new gestion.asistenciaIndividual(Integer.parseInt(idAlumno), nombreAlumno, nombre);
                out.print(persona.dibujarAsistenciaIndividual());
            }
            out.flush();
            out.close();
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

}
