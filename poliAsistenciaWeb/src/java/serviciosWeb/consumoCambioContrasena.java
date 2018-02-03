/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosWeb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Caleb
 */
@WebServlet(name = "consumoCambioContrasena", urlPatterns = {"/consumoCambioContrasena"})
public class consumoCambioContrasena extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/serviciosWebPoliAsistencia/usuario.wsdl")
    private Usuario_Service service;

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
        response.sendRedirect("configuracion");
        return;
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
        HttpSession usr = request.getSession();
        if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
            response.sendRedirect("iniciarSesion");
            return;
        }
        int idTipo = (int) usr.getAttribute("idtipo");
        String numero;
        if (idTipo == 2) {
            numero = (String) usr.getAttribute("boleta");
        } else {
            numero = (String) usr.getAttribute("numero");
        }

        String antigua = new String(request.getParameter("contra").getBytes(), "UTF-8") != null ? new String(request.getParameter("contra").getBytes(), "UTF-8") : "";
        String nueva = new String(request.getParameter("nueva").getBytes(), "UTF-8") != null ? new String(request.getParameter("nueva").getBytes(), "UTF-8") : "";
        String nueva2 = new String(request.getParameter("nueva2").getBytes(), "UTF-8") != null ? new String(request.getParameter("nueva2").getBytes(), "UTF-8") : "";
        String mensaje = "";
        if (nueva.equals(nueva2)) {
            try {
                mensaje = cambioContrasena(idTipo, numero, antigua, nueva);
                response.sendRedirect("configuracion?mensaje="+mensaje);
            } catch (Exception error) {
               response.sendRedirect("configuracion?mensaje="+mensaje);
            }
        } else {
            mensaje = "Las nuevas contraseñas no coinciden";
            response.sendRedirect("configuracion?mensaje="+mensaje);
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

    private String cambioContrasena(int idTipo, java.lang.String boleta, java.lang.String antigua, java.lang.String nueva) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.cambioContrasena(idTipo, boleta, antigua, nueva);
    }

}
