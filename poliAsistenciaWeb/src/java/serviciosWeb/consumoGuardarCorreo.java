/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosWeb;

import java.io.IOException;
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
@WebServlet(name = "consumoGuardarCorreo", urlPatterns = {"/actualizarCorreo"})
public class consumoGuardarCorreo extends HttpServlet {

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
            response.sendRedirect("../iniciarSesion");
            return;
        }
        try{
            String mensaje;
            int idPersona = Integer.parseInt((String) usr.getAttribute("idpersona"));
            String correo = new String(request.getParameter("correo").getBytes(), "UTF-8") != null ? new String(request.getParameter("correo").getBytes(), "UTF-8") : "";
            if (correo.matches("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})$") == false) {
                mensaje = "Algo salio mal. Verifica que tu correo electrónico sea valido";
                response.sendRedirect("configuracion?mensaje=" + mensaje);
                return;
            }
            if(guardarCorreo(idPersona, correo)){
                mensaje = "Correo actualizado";
            }
            else{
                mensaje = "Error en actualizar correo, verifica tus datos";
            }
            response.sendRedirect("configuracion?mensaje=" + mensaje);
        }
        catch(Exception error){
            response.sendRedirect("configuracion");
            return;
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

    private boolean guardarCorreo(int idPer, java.lang.String correo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.guardarCorreo(idPer, correo);
    }

}
