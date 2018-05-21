/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosWeb;

import conexion.imagenes;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.activation.MimetypesFileTypeMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Caleb
 */
@WebServlet(name = "consumoSubirImagen", urlPatterns = {"/consumoSubirImagen"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, // 1 MB 
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 5 * 5)      // 25 MB
public class consumoSubirImagen extends HttpServlet {

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
        String mensaje = "";
        try (PrintWriter out = response.getWriter()) {
            HttpSession usr = request.getSession();
            if (usr.getAttribute("idpersona") == null || usr.getAttribute("idtipo") == null) {
                response.sendRedirect("iniciarSesion");
                return;
            }
            String identificador = usr.getAttribute("idpersona") + "_" + usr.getAttribute("idtipo");
            Part foto = request.getPart("subirFoto");
            String nombreArchivo = Paths.get(foto.getSubmittedFileName()).toString();
            String tipoArchivo = Paths.get(foto.getContentType()).getFileName().toString();
            if (tipoArchivo.equals("png") || tipoArchivo.equals("jpeg")) {
                //imagenes imgServ = new imagenes();
                //String direccion = imgServ.getServidor();
                File carpeta = new File("/Users/caleb/Documents/GitHub/poliAsistenciaWeb2/poliAsistenciaWeb/web/imagenes/perfil"); 
                carpeta.mkdirs();
                File archivo = File.createTempFile(identificador + "fotoPerfil" + nombreArchivo, "." + tipoArchivo, carpeta);
                String contenidoArchivo = new MimetypesFileTypeMap().getContentType(archivo);//mimetype, para saber el contenido del archivo
                String tipo = contenidoArchivo.split("/")[0];
                if(!tipo.equals("image")){
                    mensaje = "La imagen que subiste esta alterada o corrompida, intentalo de nuevo";
                    response.sendRedirect("configuracion?mensaje=" + mensaje);
                    return;
                }
                try (InputStream input = foto.getInputStream()) {
                    Files.copy(input, archivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception error) {
                    mensaje = "Error al subir la imagen";
                    response.sendRedirect("configuracion?mensaje=" + mensaje);
                    return;
                }
                String urlbase = "imagenes/perfil/" + archivo.getName();
                out.println(urlbase);
                int id = Integer.parseInt((String) usr.getAttribute("idpersona"));
                boolean guardado = guardarUrl(id, urlbase);
                if (guardado) {
                    try {
                        Thread.sleep(2 * 1000);
                    } 
                    catch (InterruptedException e) {
                    }
                    mensaje = "Imagen cambiada"; 
                    response.sendRedirect("configuracion?mensaje=" + mensaje);
                    return;

                } else {
                    mensaje = "Error";
                }

            } else {
                //response.sendRedirect("");
                mensaje = "Solo se aceptan imagenes con formato jpg y png";
                response.sendRedirect("configuracion?mensaje=" + mensaje);
                return;
            }

        } catch (Exception error) {
            mensaje = "Lo sentimos, tu archivo debe de pesar menos de 2MB";
            response.sendRedirect("configuracion?mensaje=" + mensaje);
        }
        response.sendRedirect("configuracion?mensaje=" + mensaje);

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

    private boolean guardarUrl(int idPer, java.lang.String url) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.guardarUrl(idPer, url);
    }

}
