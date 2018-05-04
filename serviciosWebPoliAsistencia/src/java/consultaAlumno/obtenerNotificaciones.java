/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaAlumno;

import java.sql.ResultSet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Caleb
 */
public class obtenerNotificaciones {

    private String html = "";
    
    private JSONObject notificacionx;
    private JSONArray notificaciones = new JSONArray();

    public obtenerNotificaciones(int tipoNotificacion) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spNotificaciones(" + tipoNotificacion + ");");
            while (resultado.next()) {
                notificacionx = new JSONObject();
                if ((resultado.getString("imgN").equals(" ")) || (resultado.getString("imgN") == null)) {
                    html += "<div class=\"mdl-cell mdl-cell--8-col\" style=\"transition: all 0.3s cubic-bezier(.25,.8,.25,1); box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25); border-radius: 3px 3px;  background-color: white;\">\n"
                            + "                <div class=\"mdl-grid\">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                            + "                        <div class=\"mdl-grid\" style=\"padding: 0px\">\n"
                            + "                            <div class=\"mdl-cell mdl-cell--4-col\" style=\"width: 50px; height: 50px; border-radius: 50%; background-repeat: no-repeat; background-position: center center; background-size: cover; background-image: url('" + resultado.getString("imgP") + "'); margin: 0px; padding: 0px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\"></div>\n"
                            + "                            <div class=\"mdl-cell mdl-cell--8-col\" style=\"margin-top: 5px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; height: auto; overflow: hidden;\">\n"
                            + "                                <div style=\"font-weight: bold; font-size: 12px;\">" + resultado.getString("nombre") + "</div>\n"
                            + "                                <div style=\"color: #0091EA; font-weight: bold; font-size: 17px;\">" + resultado.getString("titulo") + "</div>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "                <div class=\"mdl-grid \">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                            + "                        " + resultado.getString("info") + "\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "                <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                        <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                            <div class=\"mdl-cell mdl-cell--4-col\" style=\"float: right;\">\n"
                            + "                                <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 100%; margin: 5px;\" onclick=\"verUrl('" + resultado.getString("url") + "')\">\n"
                            + "                                    Ver mas\n"
                            + "                                </button>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "            </div>";
                    notificacionx.put("tipoNotificacion", "3");
                    notificacionx.put("usuario", resultado.getString("nombre"));
                    notificacionx.put("imagenUsuario", resultado.getString("imgP"));
                    notificacionx.put("titulo", resultado.getString("titulo") );
                    notificacionx.put("descripcion", resultado.getString("info"));
                    notificacionx.put("imagen", "");
                    notificacionx.put("url", resultado.getString("url"));
                    notificacionx.put("borrar", "");
                    notificaciones.add(notificacionx);
                    notificacionx = null;
                } else {//" + resultado.getString("img") + "
                    html += "<div class=\"mdl-cell mdl-cell--8-col\" style=\"transition: all 0.3s cubic-bezier(.25,.8,.25,1); box-shadow: 0px 1px 2px rgba(0,0,0,0.09), 0 1px 2px rgba(0,0,0,0.25); border-radius: 3px 3px;  background-color: white;\">\n"
                            + "                <div class=\"mdl-grid\">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                            + "                        <div class=\"mdl-grid\" style=\"padding: 0px\">\n"
                            + "                            <div class=\"mdl-cell mdl-cell--4-col\" style=\"width: 50px; height: 50px; border-radius: 50%; background-repeat: no-repeat; background-position: center center; background-size: cover; background-image: url('" + resultado.getString("imgP") + "'); margin: 0px; padding: 0px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\"></div>\n"
                            + "                            <div class=\"mdl-cell mdl-cell--8-col\" style=\"margin-top: 5px; /**/position: relative; position: relative; float: left; display: flex; justify-content: center; align-content: center; flex-direction: column; height: auto; overflow: hidden;\">\n"
                            + "                                <div style=\"font-weight: bold; font-size: 12px;\">" + resultado.getString("nombre") + "</div>\n"
                            + "                                <div style=\"color: #0091EA; font-weight: bold; font-size: 17px;\">" + resultado.getString("titulo") + "</div>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "                <div class=\"mdl-grid \">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\">\n"
                            + "                        " + resultado.getString("info") + "\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "                <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\"\">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\" style=\"margin: 0px; padding: 0px; width: 100%\" \">\n"
                            + "                        <img style=\"height: auto; width: 100%;\" src=\""+resultado.getString("imgN")+"\">\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "                <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                    <div class=\"mdl-cell mdl-cell--12-col\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                        <div class=\"mdl-grid\" style=\"margin: 0px; padding: 0px\">\n"
                            + "                            <div class=\"mdl-cell mdl-cell--4-col\" style=\"float: right;\">\n"
                            + "                                <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: rgb(0, 229, 10); width: 100%; margin: 5px;\" onclick=\"verUrl('" + resultado.getString("url") + "')\">\n"
                            + "                                    Ver mas\n"
                            + "                                </button>\n"
                            + "                            </div>\n"
                            + "                        </div>\n"
                            + "                    </div>\n"
                            + "                </div>\n"
                            + "            </div>";
                    notificacionx.put("tipoNotificacion", "4");
                    notificacionx.put("usuario", resultado.getString("nombre"));
                    notificacionx.put("imagenUsuario", resultado.getString("imgP"));
                    notificacionx.put("titulo", resultado.getString("titulo") );
                    notificacionx.put("descripcion", resultado.getString("info"));
                    notificacionx.put("imagen", resultado.getString("imgN"));
                    notificacionx.put("url", resultado.getString("url"));
                    notificacionx.put("borrar", "");
                    notificaciones.add(notificacionx);
                    notificacionx = null;
                }
            }
            if (html.equals("")) {
                html = "<div style=\"color: gray; font-size:30px; padding-top: 20%\">No hay notificaciones en la bandeja de entrada</div>";
            }
        } catch (Exception error) {

        }

    }

    public String obtenerHtml() {
        return html;
    }
    
    public String obtenerJSON(){
        return notificaciones.toString();
    }
}
