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
@WebServlet(name = "estadisticas", urlPatterns = {"/estadisticas"})
public class estadisticas extends HttpServlet {

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
                response.sendRedirect("iniciarSesion");
                return;
            }
        try (PrintWriter out = response.getWriter()) {
            
            int tipoPersona = (int) usr.getAttribute("idtipo");

            if (tipoPersona == 2) {//alumno
                int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                String boleta = (String) usr.getAttribute("boleta");
                String nombre = (String) usr.getAttribute("nombre");
                alumno.inicio alumno = new alumno.inicio(idPersona, tipoPersona, boleta, nombre);
                out.print(alumno.dibujarInicio());
            } else {
                if (tipoPersona == 3) {//profesor
                    int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                    String numero = (String) usr.getAttribute("numero");
                    String nombre = (String) usr.getAttribute("nombre");
                    profesor.estadisticas profesor = new profesor.estadisticas(idPersona, tipoPersona, numero, nombre);
                    out.print(profesor.dibujarEstadisticas());
                } else {
                    if (tipoPersona == 4) {//jefe de academia
                        int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                        String numero = (String) usr.getAttribute("numero");
                        String nombre = (String) usr.getAttribute("nombre");
                        jefeAcademia.estadisticas jefe = new jefeAcademia.estadisticas(idPersona, tipoPersona, numero, nombre);
                        out.print(jefe.dibujarEstadisticas());
                    }
                    else{
                        if(tipoPersona == 1){//gestion
                            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
                            String numero = (String) usr.getAttribute("numero");
                            String nombre = (String) usr.getAttribute("nombre");
                            gestion.estadisticas persona = new gestion.estadisticas(idPersona, tipoPersona, numero, nombre);
                            out.print(persona.dibujarEstadisticas());
                        }
                    }
                }
            }
            out.flush();
            out.close();

        }catch(Exception error){
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
