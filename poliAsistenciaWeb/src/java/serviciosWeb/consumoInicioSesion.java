/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosWeb;

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

/**
 *
 * @author Caleb
 */
@WebServlet(name = "consumoInicioSesion", urlPatterns = {"/consumoInicioSesion"})
public class consumoInicioSesion extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet consumoInicioSesion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<script>window.location.href = 'http://localhost:8080/poliAsistenciaWeb';</script>");
            out.println("</body>");
            out.println("</html>");
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String usuario = new String(request.getParameter("usuario").getBytes(), "UTF-8").trim() != null ? new String(request.getParameter("usuario").getBytes(), "UTF-8").trim() : "";
            String contrasena = new String(request.getParameter("contrasena").getBytes(), "UTF-8").trim() != null ? new String(request.getParameter("contrasena").getBytes(), "UTF-8").trim() : "";
            String script = "";
            try{
                ArrayList <Object> datos = new ArrayList<>(validarUsuario(usuario, contrasena));
                String idPersona = (String) datos.get(0);
                int idTipo = Integer.parseInt((String) datos.get(1));
                if(idTipo == 2){//alumno
                    ArrayList <Object> datosAlumno = new ArrayList<>(datosAlumno(usuario, "Pol"));
                    HttpSession usr = request.getSession();
                    usr.setAttribute("idpersona", idPersona);
                    usr.setAttribute("idtipo", idTipo);
                    usr.setAttribute("nombre", datosAlumno.get(0));
                    usr.setAttribute("paterno", datosAlumno.get(1));
                    usr.setAttribute("materno", datosAlumno.get(2));
                    usr.setAttribute("genero", datosAlumno.get(3));
                    usr.setAttribute("boleta", datosAlumno.get(4));
                    usr.setAttribute("nacimiento", datosAlumno.get(5));
                    response.sendRedirect("inicio");
                }
                if(idTipo == 3){//profesor
                    ArrayList <Object> datosProfesor = new ArrayList<>(datosProfesor(usuario, "Pol"));
                    HttpSession usr = request.getSession();
                    usr.setAttribute("idpersona", idPersona);
                    usr.setAttribute("idtipo", idTipo);
                    usr.setAttribute("nombre", datosProfesor.get(0));
                    usr.setAttribute("paterno",datosProfesor.get(1));
                    usr.setAttribute("materno",datosProfesor.get(2));
                    usr.setAttribute("genero", datosProfesor.get(3));
                    usr.setAttribute("numero", datosProfesor.get(4));
                    usr.setAttribute("nacimiento", datosProfesor.get(5));
                    response.sendRedirect("inicio");
                }
                if(idTipo == 4){//jefe de academia
                    ArrayList <Object> datosJefe = new ArrayList<>(datosJefeAcademia(usuario, "Pol"));
                    HttpSession usr = request.getSession();
                    usr.setAttribute("idpersona", idPersona);
                    usr.setAttribute("idtipo", idTipo);
                    usr.setAttribute("nombre", datosJefe.get(0));
                    usr.setAttribute("paterno",datosJefe.get(1));
                    usr.setAttribute("materno",datosJefe.get(2));
                    usr.setAttribute("genero", datosJefe.get(3));
                    usr.setAttribute("numero", datosJefe.get(4));
                    usr.setAttribute("nacimiento", datosJefe.get(5));
                    response.sendRedirect("inicio");
                }
                if(idTipo == 1){//gestion
                    ArrayList <Object> datosGestion = new ArrayList<>(datosGestion(usuario, "Pol"));
                    HttpSession usr = request.getSession();
                    usr.setAttribute("idpersona", idPersona);
                    usr.setAttribute("idtipo", idTipo);
                    usr.setAttribute("nombre", datosGestion.get(0));
                    usr.setAttribute("paterno",datosGestion.get(1));
                    usr.setAttribute("materno",datosGestion.get(2));
                    usr.setAttribute("genero", datosGestion.get(3));
                    usr.setAttribute("numero", datosGestion.get(4));
                    usr.setAttribute("nacimiento", datosGestion.get(5));
                    response.sendRedirect("inicio");
                }
            }
            catch(Exception error){
                response.sendRedirect("iniciarSesion?error=:c");
            }
            
            
            
            
            
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

    private java.util.List<java.lang.Object> validarUsuario(java.lang.String numero, java.lang.String contrasena) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.validarUsuario(numero, contrasena);
    }

    private java.util.List<java.lang.Object> datosAlumno(java.lang.String boleta, java.lang.String llave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.datosAlumno(boleta, llave);
    }

    private java.util.List<java.lang.Object> datosProfesor(java.lang.String numero, java.lang.String llave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.datosProfesor(numero, llave);
    }

    private java.util.List<java.lang.Object> datosJefeAcademia(java.lang.String numero, java.lang.String llave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.datosJefeAcademia(numero, llave);
    }

    private java.util.List<java.lang.Object> datosGestion(java.lang.String numero, java.lang.String llave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.datosGestion(numero, llave);
    }

}
