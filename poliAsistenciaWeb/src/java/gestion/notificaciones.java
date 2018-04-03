/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Caleb
 */
public class notificaciones {

    private int _idPersona = 0;
    private int _idTipo = 0;
    private String _numero = "";
    private String _nombre = "";
    private String _notificaciones = "";

    public notificaciones(int idPersona, int idTipo, String numero, String nombre) {
        _idPersona = idPersona;
        _idTipo = idTipo;
        _numero = numero;
        _nombre = nombre;
    }

    public String dibujarNotificaciones(String mensaje) {
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
        
        _notificaciones = "\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <meta name=\"description\" content=\"PoliAsistencia\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                + "        <title>Notificaciones</title>\n"
                + "        <link href=\"css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                + "        <link href=\"css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                + "        <link rel=\"shortcut icon\" href=\"imagenes/iconos/poliAsistIcono.ico\" />\n"
                + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\n"
                + "        <script src=\"scripts/parallax.js\" type=\"text/javascript\"></script>\n"
                + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                + "        <style>\n"
                + "@font-face{\n"
                + "                font-family: Calibri;\n"
                + "                src: URL(\"fuentes/calibri.ttf\") format(\"opentype\");\n"
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
                + "            .editor{\n"
                + "                background-color: #fff; width: 30%; height: auto; float: left; margin: 30px; box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19); overflow: scroll;\n"
                + "            }\n"
                + "            .notificacionEditor{\n"
                + "                margin-top: 70px; margin-left: 50px;\n"
                + "            }\n"
                + "            .mdl-textfield{\n"
                + "                width:70%;\n"
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
                + "                height: 200px;\n"
                + "                transition: all 0.3s cubic-bezier(.25,.8,.25,1);\n"
                + "                box-shadow: 0 1px 2px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n"
                + "                border-radius: 10px 15px;\n"
                + "                text-decoration: none;\n"
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
                + "                width: 100%; height: 50px; position: relative; float: left;\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "                color: white; font-size: 30px;\n"
                + "                \n"
                + "            }\n"
                + "            .descripcion{\n"
                + "                width: 100%; height: inherit; position: relative; float: left; color: gray; height: 150px;\n"
                + "                font-size: 20px; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "            }\n"
                + "            .paralaje{\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center; height: 50px;\n"
                + "                font-size: 30px; color: white;\n"
                + "                \n"
                + "            }\n"
                + "            \n"
                + "            .seleccionado{\n"
                + "                background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 158, 255));\n"
                + "                color: white !important;\n"
                + "                font-size: 20px;\n"
                + "                \n"
                + "            }\n"
                + "            .disponible{\n"
                + "                font-size: 20px;\n"
                + "                transition: all 0.3s;\n"
                + "            }\n"
                + "\n"
                + "            @media screen and (max-width: 479px){\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "            }\n"
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
                + "                .editor{\n"
                + "                    width: 100%;\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    margin-top: auto; margin-left: auto; width: 90%; left: 10%;\n"
                + "                }\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "\n"
                + "\n"
                + "\n"
                + "            }\n"
                + "            @media screen and (max-width: 839px){\n"
                + "                .mdl-grid{\n"
                + "\n"
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
                + "                .notificacion{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "                .editor{\n"
                + "\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "\n"
                + "\n"
                + "\n"
                + "            }\n"
                + "        </style>\n"
                + "        "+script+"\n"
                + "         <script>"
                + "           function borrarNotificacion(idNotificacion){\n"
                + "             if(confirm(\"¿Estas seguro de que quieres borrar esta notificación? \\n  Esta acción no se puede deshacer.\")){\n"
                + "                    document.getElementById(\"idNot\").value = idNotificacion;\n"
                + "                    document.getElementById(\"borrar\").submit();\n"
                + "                }\n"
                + "                else{\n"
                + "\n"
                + "                }\n"
                + "            }"
                +"            function verUrl(link){"
                +"                  window.open(link, '_blank');"
                +"             }"
                + "        </script>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        "+cargar+"\n"
                + "        <!-- Always shows a header, even in smaller screens. -->\n"
                + "        <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n"
                + "            <header class=\"mdl-layout__header\" style=\"background-color: transparent;\">\n"
                + "                <div class=\"mdl-layout__header-row\" style=\"background: linear-gradient(to right, #0091EA, #00D4FF);\">\n"
                + "                    <!-- Title -->\n"
                + "                    <div id=\"tarjeta\">&nbsp;Notificaciones&nbsp;</div><div class=\"centrado\"><span class=\"titulob\">&nbsp;Poli<span class=\"tituloBoldb\">Asistencia</span></span></div>\n"
                + "                    <!-- Add spacer, to align navigation to the right -->\n"
                + "                    <div class=\"mdl-layout-spacer\"></div>\n"
                + "\n"
                + "                    <!-- Navigation. We hide it in small screens. -->\n"
                + "                    <nav class=\"mdl-navigation mdl-layout--large-screen-only\">\n"
                + "                        <button id=\"demo-menu-lower-right\"\n"
                + "                                class=\"persona\">\n"
                + "                            " + _nombre + "\n"
                + "                        </button>\n"
                + "                        <ul class=\"mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect\"\n"
                + "                            for=\"demo-menu-lower-right\">\n"
                + "                            <a href=\"configuracion\"><li class=\"mdl-menu__item\">Configuración de la cuenta</li></a>\n"
                + "                            <a href=\"cerrarSesion\"><li class=\"mdl-menu__item\">Cerrar Sesión</li></a>\n"
                + "                        </ul>\n"
                + "                    </nav>\n"
                + "                </div>\n"
                + "            </header>\n"
                + "            <div class=\"mdl-layout__drawer\">\n"
                + "                <span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span>\n"
                + "                <nav class=\"mdl-navigation\">\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"inicio\"><i class=\"material-icons md-36 md-dark\">home</i> Inicio</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"horario\" ><i class=\"material-icons md-36 md-dark\">date_range</i> Horario</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"estadisticas\"><i class=\"material-icons md-36 md-dark\">insert_chart</i> Estadisticas</a>\n"
                + "                    <a class=\"mdl-navigation__link seleccionado\" href=\"#\"><i class=\"material-icons md-36 md-light\">list</i> Notificaciones</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"configuracion\"><i class=\"material-icons md-36 md-dark\">settings</i> Configuración</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"cerrarSesion\"><i class=\"material-icons md-36 md-dark\">exit_to_app</i> Cerrar Sesión</a>\n"
                + "\n"
                + "                </nav>\n"
                + "            </div>\n"
                + "            <main class=\"mdl-layout__content\" style=\"background-color: whitesmoke;\">\n"
                + "                <div class=\"mdl-grid center-items\">\n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\">\n"
                + "                        <div class=\"tarjetas\" style=\"height: 200px;\">\n"
                + "                            <div class=\"iconos\" style=\"width: 100%; height: 150px; background: linear-gradient(to right, rgb(0, 229, 10), rgb(0, 238, 11)); border-top-left-radius: 10px; border-top-right-radius: 10px; border-bottom-left-radius: 0px;\"><p style=\"font-size: 30px; color: white \">Crear nueva notificación</p></div>\n"
                + "                            <div class=\"descripcion\" style=\"width: 100%; height: 50px;\">\n"
                + "                                <center>\n"
                + "                                    <a href=\"notificaciones/crearNotificaciones\"><button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 50%\">\n"
                + "                                        Crear notificación\n"
                + "                                    </button></a>\n"
                + "                                </center>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    " + obtenerNotificaciones(2) + "      \n"
                + "                </div>\n"
                + "<div style=\"height:0px; overflow:hidden\">\n"
                + "            <form action=\"consumoBorrarNotificacion\" method=\"POST\" id=\"borrar\">\n"
                + "                <input type=\"number\" id=\"idNot\" name=\"idNot\"/>\n"
                + "            </form>\n"
                + "        </div>"
                + "\n"
                + " "+html+"\n"
                + "            </main>\n"
                + "        </div>\n"
                + "\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return _notificaciones;
    }

    private static String obtenerNotificaciones(int tipoNotificacion) {
        serviciosWebGestion.Gestion_Service service = new serviciosWebGestion.Gestion_Service();
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.obtenerNotificaciones(tipoNotificacion);
    }
}
