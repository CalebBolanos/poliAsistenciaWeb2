/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

/**
 *
 * @author Caleb
 */
public class configuracion {

    private int _idPersona = 0;
    private int _idTipo = 0;
    private String _nombre = "";
    private String _paterno = "";
    private String _materno = "";
    private String _genero = "";
    private String _numero = "";
    private String _nacimiento = "";
    private String _configuracion = "";

    public configuracion(int idPersona, int idTipo, String nombre, String paterno, String materno, String genero, String numero, String nacimiento) {
        _idPersona = idPersona;
        _idTipo = idTipo;
        _nombre = nombre;
        _paterno = paterno;
        _materno = materno;
        _genero = genero;
        _numero = numero;
        _nacimiento = nacimiento;
    }

    public String dibujarConfiguracion(String mensaje) {
        String script = "<script>\n"
                + "            window.onload = function () {\n"
                + "                var barrita = document.getElementById('barrita');\n"
                + "                barrita.style.visibility = 'hidden';\n"
                + "                barrita.style.opacity = '0';\n"
                + "            };\n"
                + "            \n"
                + "        </script>";
        String cargar = "<div id=\"barrita\">\n"
                + "            <div id=\"cargar\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\">Cargando...</span></center></div> \n"
                + "        </div>";
        String html = "";
        String msj = mensaje;
        if (!msj.equals("")) {
            script = "<script>\n"
                    + "            window.onload = function () {\n"
                    + "                var notification = document.querySelector('.mdl-js-snackbar');\n"
                    + "                notification.MaterialSnackbar.showSnackbar(\n"
                    + "                        {\n"
                    + "                            message: '" + mensaje + "'\n"
                    + "                        }\n"
                    + "                );\n"
                    + "            };\n"
                    + "\n"
                    + "        </script>";
            html = "<div id=\"demo-toast-example\" class=\"mdl-js-snackbar mdl-snackbar\">\n"
                    + "                    <div class=\"mdl-snackbar__text\"></div>\n"
                    + "                    <button class=\"mdl-snackbar__action\" type=\"button\"></button>\n"
                    + "                </div>";
            cargar="";
        }
        _configuracion = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <meta name=\"description\" content=\"PoliAsistencia\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                + "        <title>Configuracion</title>\n"
                + "        <link href=\"css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                + "        <link href=\"css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                + "        <link rel=\"shortcut icon\" href=\"imagenes/iconos/poliAsistIcono.ico\" />\n"
                + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                + "        <style>\n"
                + "@font-face{\n"
                + "                font-family: Calibri;\n"
                + "                src: URL(\"../fuentes/calibri.ttf\") format(\"opentype\");\n"
                + "            }"
                + "            .titulo{\n"
                + "                font-size: 35px;\n"
                + "                color: #00B0FF;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .tituloBold{\n"
                + "                font-size: 40px;\n"
                + "                color: #0091EA;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .titulob{\n"
                + "                font-size: 35px;\n"
                + "                color: white;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            .tituloBoldb{\n"
                + "                font-size: 40px;\n"
                + "                color: white;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            #tarjeta{\n"
                + "                background-color: rgba(250, 250, 250, 0.4);\n"
                + "                text-align: left;\n"
                + "                color: white;\n"
                + "                font-size: 30px;\n"
                + "                width: auto;\n"
                + "                height: 30px;\n"
                + "                position: relative;\n"
                + "                border-radius: 5px;\n"
                + "                padding-top: 5px;\n"
                + "                font-family: Calibri; \n"
                + "            }\n"
                + "            .centrado{\n"
                + "                position: absolute;\n"
                + "                width: auto;\n"
                + "                height: auto;\n"
                + "                padding-left: 35%;\n"
                + "            }\n"
                + "            .persona{\n"
                + "                background-color: rgba(250, 250, 250, 0.0);\n"
                + "                color: white;\n"
                + "                font-size: 20px;\n"
                + "                border: 2px solid rgba(250, 250, 250, 0.0);\n"
                + "                width: auto;\n"
                + "            }\n"
                + "            #cuenta, #salir{\n"
                + "                display: none;\n"
                + "            }\n"
                + "            #barrita{\n"
                + "                background-color: white;\n"
                + "                height: 100%;\n"
                + "                width: 100%;\n"
                + "                position: fixed;\n"
                + "                -webkit-transition: all 1s ease;\n"
                + "                -o-transition: all 1s ease;\n"
                + "                transition: all 1s ease;\n"
                + "                z-index: 10000;\n"
                + "\n"
                + "            }\n"
                + "            #cargar{\n"
                + "                position: absolute;\n"
                + "                top: 0;\n"
                + "                left: 0;\n"
                + "                right: 0;\n"
                + "                bottom: 0;\n"
                + "                margin: auto;\n"
                + "            }\n"
                + "            #load{\n"
                + "                background-color: rgba(0, 0, 0, 0.7);\n"
                + "                height: 100%;\n"
                + "                width: 100%;\n"
                + "                position: fixed;\n"
                + "                -webkit-transition: all 1s ease;\n"
                + "                -o-transition: all 1s ease;\n"
                + "                transition: all 1s ease;\n"
                + "                z-index: 10000; visibility: hidden;\n"
                + "                opacity: 0;"
                + "\n"
                + "            }\n"
                + "            #subirF{\n"
                + "                position: absolute;\n"
                + "                top: 0;\n"
                + "                left: 0;\n"
                + "                right: 0;\n"
                + "                bottom: 0;\n"
                + "                margin: auto;\n"
                + "            }\n"
                + "            .demo-card-wide.mdl-card {\n"
                + "                width: 700px;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__title {\n"
                + "                color: #fff;\n"
                + "                height: auto;\n"
                + "                background-color: black;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__menu {\n"
                + "                color: #fff;\n"
                + "            }\n"
                + "            .notificacion{\n"
                + "                padding-top: 15px;\n"
                + "                padding-bottom: 15px;\n"
                + "            }\n"
                + "            /* Rules for sizing the icon. */\n"
                + "            .material-icons.md-18 { font-size: 18px; }\n"
                + "            .material-icons.md-24 { font-size: 24px; }\n"
                + "            .material-icons.md-36 { font-size: 26px; }\n"
                + "            .material-icons.md-48 { font-size: 54px; }\n"
                + "\n"
                + "            /* Rules for using icons as black on a light background. */\n"
                + "            .material-icons.md-dark { color: rgba(0, 0, 0, 0.54); }\n"
                + "            .material-icons.md-dark.md-inactive { color: rgba(0, 0, 0, 0.26); }\n"
                + "\n"
                + "            /* Rules for using icons as white on a dark background. */\n"
                + "            .material-icons.md-light { color: rgba(255, 255, 255, 1); }\n"
                + "            .material-icons.md-light.md-inactive { color: rgba(255, 255, 255, 0.3); }\n"
                + "\n"
                + "            .tarjetas{\n"
                + "                background-color: white;\n"
                + "                width: auto;\n"
                + "                transition: all 0.3s cubic-bezier(.25,.8,.25,1);\n"
                + "                box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25);\n" 
                +                  "border-radius: 8px 8px;"
                + "                text-decoration: none;               \n"
                + "                height: auto;\n"
                + "                overflow: hidden;\n"
                + "            }\n"
                + "            a{\n"
                + "                text-decoration: none;\n"
                + "                color: inherit;\n"
                + "            }\n"
                + "            .tarjetas:hover{\n"
                + "                box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);\n"
                + "            }\n"
                + "            .mdl-grid.center-items {\n"
                + "                justify-content: center;\n"
                + "            }\n"
                + "            .iconos{\n"
                + "                width: 30%; height: inherit; position: relative; float: left; border-top-left-radius: 8px; border-bottom-left-radius: 8px;\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center; height: 50px;\n"
                + "            }\n"
                + "            .descripcion{\n"
                + "                width: 100%; height: inherit; position: relative; float: left; color: gray; height: 150px;\n"
                + "                font-size: 20px; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center; height: auto;\n"
                + "                overflow: hidden;\n"
                + "            }\n"
                + "            .seleccionado{\n"
                + "                background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 158, 255));\n"
                + "                color: white !important;\n"
                + "                font-size: 20px;\n"
                + "\n"
                + "            }\n"
                + "            .disponible{\n"
                + "                font-size: 20px;\n"
                + "                transition: all 0.3s;\n"
                + "            }\n"
                + "            .mdl-textfield{\n"
                + "                width:70%;\n"
                + "            }\n"
                + "\n"
                + "            @media screen and (max-width: 500px){\n"
                + "                .titulob{\n"
                + "                    font-size: 35px;\n"
                + "                    color: transparent;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 40px;\n"
                + "                    color: transparent;\n"
                + "                    font-weight: bold;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 5px;\n"
                + "                    padding-right: 5px;\n"
                + "                }\n"
                + "            }\n"
                + "\n"
                + "            @media screen and (max-width: 1024px){\n"
                + "                .titulob{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                #cuenta, #salir{\n"
                + "                    display: block;\n"
                + "                }\n"
                + "                .demo-card-wide.mdl-card {\n"
                + "                    width: auto;\n"
                + "                }\n"
                + "                .demo-card-wide > .mdl-card__title {\n"
                + "                    height: auto;\n"
                + "                }\n"
                + "                .mdl-card__supporting-text{\n"
                + "                    height: auto;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "            }\n"
                + "        </style>\n"
                + "        "+script+"\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        "+cargar+"\n"
                + "        <div id=\"load\">\n"
                + "            <div id=\"subirF\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\" style=\"color: white;\">Subiendo foto...</span></center></div> \n"
                + "        </div>\n"
                + "        <!-- Always shows a header, even in smaller screens. -->\n"
                + "        <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n"
                + "            <header class=\"mdl-layout__header\" style=\"background-color: transparent;\">\n"
                + "                <div class=\"mdl-layout__header-row\" style=\"background: linear-gradient(to right, #0091EA, #00D4FF);\">\n"
                + "                    <!-- Title -->\n"
                + "                    <div id=\"tarjeta\">&nbsp;Configuración&nbsp;</div><div class=\"centrado\"><span class=\"titulob\">&nbsp;Poli<span class=\"tituloBoldb\">Asistencia</span></span></div>\n"
                + "                    <!-- Add spacer, to align navigation to the right -->\n"
                + "                    <div class=\"mdl-layout-spacer\"></div>\n"
                + "\n"
                + "                    <!-- Navigation. We hide it in small screens. -->\n"
                + "                    <nav class=\"mdl-navigation mdl-layout--large-screen-only\">\n"
                + "\n"
                + "                    </nav>\n"
                + "                </div>\n"
                + "            </header>\n"
                + "            <div class=\"mdl-layout__drawer\">\n"
                + "                <span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span>\n"
                + "                <nav class=\"mdl-navigation\">\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"inicio\"><i class=\"material-icons md-36 md-dark\">home</i> Inicio</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"horario\" ><i class=\"material-icons md-36 md-dark\">date_range</i> Horario</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"estadisticas\"><i class=\"material-icons md-36 md-dark\">insert_chart</i> Estadisticas</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"notificaciones\"><i class=\"material-icons md-36 md-dark\">list</i> Notificaciones</a>\n"
                + "                    <a class=\"mdl-navigation__link seleccionado\" href=\"#\"><i class=\"material-icons md-36 md-light\">settings</i> Configuración</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"cerrarSesion\"><i class=\"material-icons md-36 md-dark\">exit_to_app</i> Cerrar Sesión</a>\n"
                + "\n"
                + "                </nav>\n"
                + "            </div>\n"
                + "            <main class=\"mdl-layout__content\" style=\"background-color: #F9F9F9;\">\n"
                + "                <div class=\"mdl-grid center-items\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--8-col\">\n"
                + "                        <div class=\"tarjetas\">\n"
                + "                            <div class=\"iconos\" style=\" width: 100%; height: 230px;\">\n"
                + "                                <center>\n"
                + "                                    <div style=\"width: 130px; height: 130px; border-radius: 50%; background-repeat: no-repeat; background-position: center center; background-size: cover; background-image: url('"+traerUrl(_idPersona)+"');border: 5px whitesmoke solid; margin-top: 20px; position: relative\">\n"//Aqui hacer consulta foto
                + "                                        <div style=\"height:0px; overflow:hidden\">\n"
                + "                                            <form action=\"consumoSubirImagen\" method=\"POST\" enctype=\"multipart/form-data\" id=\"subir\"><input type=\"file\" id=\"subirFoto\" name=\"subirFoto\" accept=\"image/*\"/></form>\n"
                + "                                        </div>\n"
                + "                                        <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored\" style=\"position: absolute; right: 0%; bottom: 0%\" onclick=\"subir();\">\n"
                + "                                            <i class=\"material-icons\">add_a_photo</i>\n"
                + "                                        </button>\n"
                + "                                    </div>\n"
                + "                                    <script>\n"
                + "                                        function subir() {\n"
                + "                                            document.getElementById(\"subirFoto\").click();\n"
                + "                                        }\n"
                + "                                        document.getElementById(\"subirFoto\").onchange = function () {\n"
                + "                                            document.getElementById(\"subir\").submit();\n"
                + "                                            var sub = document.getElementById('load');\n"
                + "                                            sub.style.visibility='visible';"
                + "                                            sub.style.opacity='1';"
                + "                                             "
                + "                                        };\n"
                + "                                        </script>\n"
                + "                                </center>\n"
                + "                                <p style=\"font-size: 30px; margin-top: 20px; margin-bottom: 20px; color:#00B0FF;\">\n"
                + "                                    "+_nombre+"&nbsp;"+_paterno+"&nbsp;"+_materno+"<br>\n"
                + "                                    <span style=\"font-size: 17px; color: gray\">Profesor</span>\n"
                + "                                </p>\n"
                + "                            </div>\n"
                + "                            <div class=\"mdl-grid center-items\">\n"
                +"<div class=\"mdl-cell mdl-cell--12-col\" style=\"\">\n"
                + "                                    <center>\n"
                + "                                        <form action=\"actualizarCorreo\" method=\"POST\">\n"
                + "                                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                <input class=\"mdl-textfield__input\" type=\"email\" id=\"correo\" name=\"correo\" value=\""+traerCorreo(_idPersona)+"\" >\n"
                + "                                                <label class=\"mdl-textfield__label\" for=\"correo\">Correo Electrónico</label>\n"
                + "                                            </div>\n"
                + "                                            <input type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"margin-bottom: 10px;\"  value=\"Actualizar\">\n"
                + "                                        </form>\n"
                + "                                    </center>\n"
                + "                                </div>"
                + "                                <div class=\"mdl-cell mdl-cell--8-col\">\n"
                + "                                    <div class=\"tarjetas\" style=\"box-shadow: 0 1px 2px rgba(0,0,0,0), 0 1px 2px rgba(0,0,0,0); border: 2px whitesmoke solid\">\n"
                + "                                        <div class=\"descripcion\">\n"
                + "                                            <div style=\"margin-top: 10px; margin-bottom: 10px;\">Datos generales</div>\n"
                + "                                            <center>\n"
                + "                                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"nombre\" name=\"nombre\" value=\""+_nombre+"\" disabled>\n"
                + "                                                    <label class=\"mdl-textfield__label\" for=\"nombre\">Nombre</label>\n"
                + "                                                </div>\n"
                + "                                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"paterno\" name=\"paterno\" value=\""+_paterno+"\"disabled>\n"
                + "                                                    <label class=\"mdl-textfield__label\" for=\"paterno\">Apellido Paterno</label>\n"
                + "                                                </div>\n"
                + "                                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"materno\" name=\"materno\" value=\""+_materno+"\" disabled>\n"
                + "                                                    <label class=\"mdl-textfield__label\" for=\"materno\">Apellido Materno</label>\n"
                + "                                                </div>\n"
                + "                                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"numero\" name=\"numero\" value=\""+_numero+"\" disabled>\n"
                + "                                                    <label class=\"mdl-textfield__label\" for=\"numero\">No. de Trabajador</label>\n"
                + "                                                </div>\n"
                + "                                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"nacimiento\" name=\"nacimiento\" value=\""+_nacimiento+"\" disabled>\n"
                + "                                                    <label class=\"mdl-textfield__label\" for=\"nacimiento\">Fecha de Nacimiento</label>\n"
                + "                                                </div>\n"
                + "\n"
                + "\n"
                + "\n"
                + "                                            </center>\n"
                + "                                        </div>\n"
                + "                                    </div> \n"
                + "                                </div>\n"
                + "                                <div class=\"mdl-cell mdl-cell--4-col\">\n"
                + "                                    <div class=\"tarjetas\" style=\"box-shadow: 0 1px 2px rgba(0,0,0,0), 0 1px 2px rgba(0,0,0,0); border: 2px whitesmoke solid\">\n"
                + "                                        <div class=\"descripcion\">\n"
                + "                                            <div style=\"margin-top: 10px; margin-bottom: 10px;\">Cambiar Contraseña</div>\n"
                + "                                            <center>\n"
                + "                                                <form method=\"POST\" action=\"consumoCambioContrasena\">\n"
                + "                                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                        <input class=\"mdl-textfield__input\" type=\"password\" id=\"contra\" name =\"contra\">\n"
                + "                                                        <label class=\"mdl-textfield__label\" for=\"contra\">Contraseña actual</label>   \n"
                + "                                                    </div>\n"
                + "                                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                        <input class=\"mdl-textfield__input\" type=\"password\" id=\"nueva\" name =\"nueva\">\n"
                + "                                                        <label class=\"mdl-textfield__label\" for=\"nueav\">Nueva Contraseña</label>   \n"
                + "                                                    </div>\n"
                + "                                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n"
                + "                                                        <input class=\"mdl-textfield__input\" type=\"password\" id=\"nueva2\" name =\"nueva2\">\n"
                + "                                                        <label class=\"mdl-textfield__label\" for=\"nueva2\">Vuelve a escribir tu nueva Contraseña</label>   \n"
                + "                                                    </div><br>\n"
                + "                                                    <input type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"margin-bottom: 10px;\"  value=\"Cambiar\">\n"
                + "                                                </form>\n"
                + "                                            </center>\n"
                + "                                        </div>\n"
                + "                                    </div> \n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "\n"
                + "                </div>\n"
                + " "+html+"\n"
                + "\n"
                + "            </main>\n"
                + "        </div>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return _configuracion;
    }

    private static String traerUrl(int idPer) {
        serviciosWeb.Usuario_Service service = new serviciosWeb.Usuario_Service();
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.traerUrl(idPer);
    }

    private static String traerCorreo(int idPer) {
        serviciosWeb.Usuario_Service service = new serviciosWeb.Usuario_Service();
        serviciosWeb.Usuario port = service.getUsuarioPort();
        return port.traerCorreo(idPer);
    }
}