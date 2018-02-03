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

/**
 *
 * @author Caleb
 */
@WebServlet(name = "iniciarSesion", urlPatterns = {"/iniciarSesion"})
public class iniciarSesion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String error = request.getParameter("error") != null ? request.getParameter("error") : "";
            String mensaje = "";
            if (!error.equals("")) {
                if (error.equals(":c")) {
                    mensaje = "Usuario o contraseña incorrectas";
                }
            }
            out.println("<!DOCTYPE html>\n"
                    + "<!--\n"
                    + "To change this license header, choose License Headers in Project Properties.\n"
                    + "To change this template file, choose Tools | Templates\n"
                    + "and open the template in the editor.\n"
                    + "-->\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>PoliAsistencia</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <link href=\"css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "        <script src=\"css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                    + "        <link href=\"css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "        <link href=\"https://fonts.googleapis.com/css?family=Calibri:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                    + "        <script src=\"css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                    + "        <link rel=\"shortcut icon\" href=\"imagenes/iconos/poliAsistIcono.ico\" />\n"
                    + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                    + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n"
                    + "        <script src=\"scripts/parallax.js\" type=\"text/javascript\"></script>\n"
                    + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                    + "        <style>\n"
                    + "            html { overflow-y:hidden; }\n"
                    + "            \n"
                    +"@font-face{\n"
                    + "                font-family: Calibri;\n"
                    + "                src: URL(\"fuentes/calibri.ttf\") format(\"opentype\");\n"
                    + "            }"
                    + "            #contenedor{\n"
                    + "                background: linear-gradient(to right, #0091EA, #00D4FF);\n"
                    + "                width: 100%;\n"
                    + "                height: 100%;\n"
                    + "                float: left;\n"
                    + "                position: fixed;\n"
                    + "                overflow: scroll;\n"
                    +"margin-bottom: 30px;"
                    + "            }\n"
                    + "            .titulo{\n"
                    + "                font-size: 80px;\n"
                    + "                color: white;\n"
                    + "                font-family: Calibri;\n"
                    + "            }\n"
                    + "            .tituloBold{\n"
                    + "                font-size: 93px;\n"
                    + "                color: white;\n"
                    + "                font-weight: bold;\n"
                    + "                font-family: Calibri;\n"
                    + "            }\n"
                    + "            .subtitulo{\n"
                    + "                font-size: 50px;\n"
                    + "                color: #00B0FF;\n"
                    + "                padding-bottom: 50px;\n"
                    + "                padding-top: 50px;\n"
                    + "                font-family: Calibri;\n"
                    + "            }\n"
                    + "            #inicio{\n"
                    + "                background-color: white;\n"
                    + "                text-align: center;\n"
                    + "                width: 50%;\n"
                    + "                height: auto;\n"
                    + "                position: relative;\n"
                    + "                right: 25%;\n"
                    + "                left: 25%;\n"
                    + "                top: 60px;\n"
                    + "                margin-bottom: 22px;\n"
                    + "                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n"
                    + "                border-radius: 10px 15px;\n"
                    + "            }\n"
                    + "            #circulo{\n"
                    + "                position: fixed;\n"
                    + "                width: 70%; \n"
                    + "                height: 1000px; \n"
                    + "                background-color: #00B0FF; \n"
                    + "                text-align: left;  \n"
                    + "                box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n"
                    + "                float: right;\n"
                    + "                top: -20%;\n"
                    + "\n"
                    + "            }\n"
                    + "            #circulo2{\n"
                    + "                position: fixed;\n"
                    + "                width: 70%; \n"
                    + "                height: 1000px; \n"
                    + "                background-color: #0091EA; \n"
                    + "                text-align: right;  \n"
                    + "                box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n"
                    + "                float: right;\n"
                    + "                top: -20%;\n"
                    + "                right: -350px;\n"
                    + "\n"
                    + "            }\n"
                    + "            .mdl-textfield{\n"
                    + "                width:70%;\n"
                    + "            }\n"
                    + "            #tit{\n"
                    + "                padding-top: 50px;\n"
                    + "            }\n"
                    + "            .footerxd{\n"
                    + "                background: rgb(250, 250, 250); \n"
                    + "                position: absolute;\n"
                    + "                bottom: 0;\n"
                    + "                width: 100%;\n"
                    + "                height: 23px;\n"
                    + "                color: black;\n"
                    + "                font-size: 15px;\n"
                    + "            }\n"
                    + "            .titulob{\n"
                    + "                font-size: 20px;\n"
                    + "                color: #00B0FF;\n"
                    + "                font-family: Calibri;\n"
                    + "                padding-top: 30px;\n"
                    + "            }\n"
                    + "            .tituloBoldb{\n"
                    + "                font-size: 23px;\n"
                    + "                color: #0091EA;\n"
                    + "                font-weight: bold;\n"
                    + "                font-family: Calibri;\n"
                    + "                padding-top: 30px;\n"
                    + "            }\n"
                    + "            a:link {\n"
                    + "                text-decoration: none;\n"
                    + "            }\n"
                    + "\n"
                    + "            a:visited {\n"
                    + "                text-decoration: none;\n"
                    + "            }\n"
                    + "\n"
                    + "            a:hover {\n"
                    + "                text-decoration: none;\n"
                    + "            }\n"
                    + "\n"
                    + "            a:active {\n"
                    + "                text-decoration: none;\n"
                    + "            }\n"
                    + "            @media screen and (max-width: 600px){\n"
                    + "                .subtitulo{\n"
                    + "                    line-height: 1;\n"
                    + "                    font-size: 45px;\n"
                    + "                }\n"
                    + "                #inicio{\n"
                    + "                    width: auto;\n"
                    + "                    right: 0%;\n"
                    + "                    left: 0%;\n"
                    + "                }\n"
                    + "                .titulo{\n"
                    + "                font-size: 50px;\n"
                    + "                color: white;\n"
                    + "                font-family: Calibri;\n"
                    + "            }\n"
                    + "            .tituloBold{\n"
                    + "                font-size: 57px;\n"
                    + "                color: white;\n"
                    + "                font-weight: bold;\n"
                    + "                font-family: Calibri;\n"
                    + "            }\n"
                    + "            }\n"
                    + "        </style>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <div id=\"contenedor\">\n"
                    + "            <div id=\"tit\"><center><span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span></center></div>\n"
                    + "            <div id=\"inicio\">\n"
                    + "                <center>\n"
                    + "                    <div class=\"subtitulo\">Iniciar Sesión</div>\n"
                    + "                    <form method=\"POST\" action=\"consumoInicioSesion\" onsubmit=\"return validar();\">\n"
                    + "                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                    + "                            <input class=\"mdl-textfield__input\" type=\"text\"id=\"usuario\" name=\"usuario\">\n"
                    + "                            <label class=\"mdl-textfield__label\" for=\"usuario\">Usuario</label>\n"
                    + "                        </div>\n"
                    + "                        <br>\n"
                    + "                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                    + "                            <input class=\"mdl-textfield__input\" type=\"password\" id=\"contrasena\" name =\"contrasena\">\n"
                    + "                            <label class=\"mdl-textfield__label\" for=\"contrasena\">Contraseña</label>   \n"
                    + "                        </div>\n"
                    + "                        <br><br>\n"
                    + "                        <input type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--primary\" value=\"Ingresar\">\n"
                    + "                    </form>\n"
                    + "                    <br>\n"
                    + "                    <span style=\"color: red;\">" + mensaje + "</span>\n"
                    + "                    <br>\n"
                    + "                </center>\n"
                    + "\n"
                    + "            </div>\n"
                    + "            \n"
                    + "            \n"
                    + "        </div>\n"
                    + "        <footer>\n"
                    + "                <div class=\"footerxd\">\n"
                    + "                    <a href=\"info.html\"><center>¿Qué es<span class=\"titulob\"> Poli<span class=\"tituloBoldb\">Asistencia</span></span>?</center></a>\n"
                    + "                </div>\n"
                    + "            </footer>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
            out.flush();
            out.close();
        }
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
