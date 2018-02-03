/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.edicionNotificaciones;

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
@WebServlet(name = "crearNotificaciones", urlPatterns = {"/notificaciones/crearNotificaciones"})
public class crearNotificaciones extends HttpServlet {

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
        String msj = request.getParameter("mensaje") != null ? request.getParameter("mensaje") : "";
        if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
            response.sendRedirect("iniciarSesion");
            return;
        }
        try (PrintWriter out = response.getWriter()) {

            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                String boleta = (String) usr.getAttribute("boleta");
                String nombre = (String) usr.getAttribute("nombre");
                alumno.notificaciones alumno = new alumno.notificaciones(idPersona, tipoPersona, boleta, nombre);
                out.print(alumno.dibujarNotificaciones());
            } else {
                if (tipoPersona == 3) {//profesor
                    int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                    String numero = (String) usr.getAttribute("numero");
                    String nombre = (String) usr.getAttribute("nombre");
                    profesor.notificaciones profesor = new profesor.notificaciones(idPersona, tipoPersona, numero, nombre);
                    out.print(profesor.dibujarNotificaciones());
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                        String numero = (String) usr.getAttribute("numero");
                        String nombre = (String) usr.getAttribute("nombre");
                        jefeAcademia.crearNotificaciones jefe = new jefeAcademia.crearNotificaciones(idPersona, tipoPersona, numero, nombre);
                        out.print(jefe.dibujarCreadorNotificaciones(msj));
                    } else {
                        if (tipoPersona == 1) {//gestion
                            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                            String numero = (String) usr.getAttribute("numero");
                            String nombre = (String) usr.getAttribute("nombre");
                            gestion.crearNotificaciones persona = new gestion.crearNotificaciones(idPersona, tipoPersona, numero, nombre);
                            out.print(persona.dibujarCreadorNotificaciones(msj));
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
