/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaProfesor;

import java.sql.ResultSet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Caleb
 */
public class unidadesAprendizaje {

    private String _html = "";
    JSONArray grupos = new JSONArray();
    JSONObject grupox;

    public unidadesAprendizaje(int idPersona) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spTraeUnidades("+idPersona+");");//"+idPersona+"
            while (resultado.next()) {
                _html += " <div class=\"mdl-cell mdl-cell--4-col\" >\n"
                        + "    <div class=\"tarjetas\" style=\"height: 150px; box-shadow: 0 1px 2px rgba(0,0,0,0), 0 1px 2px rgba(0,0,0,0); border: 2px rgb(224, 224, 224) solid\">\n"
                        + "        <div class=\"iconos\" style=\"width: 100%; height: 100px; background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 178, 255))\">\n"
                        + "            <p class=\"tit\" style=\"padding-top: 20px;\">\n"
                        + "                " + resultado.getString("materia") + "<br>\n"
                        + "                <span style=\"font-size: 20px;\">" + resultado.getString("grupo") + "</span>\n"
                        + "            </p>\n"
                        + "        </div>\n"
                        + "        <div class=\"descripcion\" style=\"width: 100%; height: 50px;\">\n"
                        + "            <center>\n"
                        + "                <button class=\"mdl-button mdl-js-button mdl-button--primary\" style=\"color: #0091EA; width: 50%\" onclick=\"enviar('"+ resultado.getString("grupo") +"', '"+resultado.getString("idUnidad")+"');\">\n"
                        + "                    Ver más detalles\n"
                        + "                </button>\n"
                        + "            </center>\n"
                        + "        </div>\n"
                        + "    </div>\n"
                        + "</div>";
                grupox = new JSONObject();
                grupox.put("unidad", resultado.getString("materia"));
                grupox.put("grupo", resultado.getString("grupo"));
                grupox.put("id", resultado.getString("idUnidad"));
                grupos.add(grupox);
                grupox = null;
            }
            if (_html.equals("")) {
                _html = "<div class=\"mdl-cell mdl-cell--12-col\" >\n"
                        + "                                    <div class=\"tarjetas iconos\" style=\"height: 150px; box-shadow: 0 1px 2px rgba(0,0,0,0), 0 1px 2px rgba(0,0,0,0); border: 2px rgb(224, 224, 224) solid; font-size: 25px; color: gray; text-align: center; width: 100%\">\n"
                        + "                                        Tus grupos apareceran aquí\n"
                        + "                                    </div>\n"
                        + "                                </div>";
            }
            base.cierraConexion();
        } catch (Exception error) {

        }
    }

    public String obtenerHtml() {
        return _html;
    }
    
    public String obtenerJSON(){
        return grupos.toJSONString();
    }
}
