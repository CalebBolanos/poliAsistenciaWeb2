/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaAlumno;

import java.sql.ResultSet;

/**
 *
 * @author Caleb
 */
public class obtenerNotificaciones {

    private String html = "";

    public obtenerNotificaciones(int tipoNotificacion) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spNotificaciones(" + tipoNotificacion + ");");
            while (resultado.next()) {
                if ((resultado.getString("img").equals(" ")) || (resultado.getString("img") == null)) {
                    html +=   "                    <div class=\"mdl-cell mdl-cell--8-col\">\n"
                            + "                        <div class=\"tarjetas\" style=\"\">\n"
                            + "                            <div class=\"iconos \" style=\"background: linear-gradient(to right, rgb(0, 229, 10), rgb(0, 238, 11)) \">\n"
                            + "                                "+resultado.getString("titulo")+"\n"
                            + "                            </div>\n"
                            + "                            <div class=\"descripcion\" style=\"text-align: left; margin: 10px; height: auto\">\n"
                            + "                                <div style=\"\">\n"
                            + "                                    "+resultado.getString("info")+"\n"
                            + "                                </div>\n"
                            + "                                <center>\n"
                            + "                                    <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 50%; margin: 5px;\" onclick=\"verUrl('"+resultado.getString("url")+"')\">\n"
                            + "                                        Ver mas detalles\n"
                            + "                                    </button>\n"
                            + "                                </center>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n";
                } else {
                    html +=   "                    <div class=\"mdl-cell mdl-cell--8-col\">\n"
                            + "                        <div class=\"tarjetas\" style=\"\">\n"
                            + "                            <img class=\"paralaje\" style=\"color: white; font-size: 30px; height: 200px; width: 100%;\" src=\""+resultado.getString("img")+"\">\n"
                            + "                            \n"
                            + "                            <div class=\"iconos \" style=\"background: linear-gradient(to right, rgb(0, 0, 0), rgb(81, 82, 84)) \">\n"
                            + "                                "+resultado.getString("titulo")+"\n"
                            + "                            </div>\n"
                            + "                            <div class=\"descripcion\" style=\"text-align: left; height: auto;\">\n"
                            + "                                <div style=\"margin: 20px;\">\n"
                            + "                                    "+resultado.getString("info")+"\n"
                            + "                                </div>\n"
                            + "                                <center>\n"
                            + "                                    <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 50%;\" onclick=\"verUrl('"+resultado.getString("url")+"')\">\n"
                            + "                                        Ver mas detalles\n"
                            + "                                    </button>\n"
                            + "                                </center>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n";
                }
            }
            if(html.equals("")){
                html = "<div style=\"color: gray; font-size:30px; padding-top: 20%\">No hay notificaciones en la bandeja de entrada</div>";
            }
        } catch (Exception error) {

        }
        
        
    }
    
    public String obtenerHtml() {
        return html;
    }
}
