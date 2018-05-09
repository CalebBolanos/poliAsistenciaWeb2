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
public class asistenciaUnidadPorDia {

    private String html = "<table class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%;\">\n"
            + "                                        <thead>\n"
            + "                                            <tr>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Boleta</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Nombre</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Asistió</th>\n"
            + "                                            </tr>\n"
            + "                                        </thead>\n"
            + "                                        <tbody>";
    private int asistido = 0, faltado = 0, totalDias = 0;
    private JSONObject infox;
    private JSONArray infoTabla = new JSONArray();

    public asistenciaUnidadPorDia(String idUnidad) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaUnidad(" + idUnidad + ");");
            while (resultado.next()) {
                infox = new JSONObject();
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("asistecia") + "</td>\n"
                        + "</tr>";
                if (resultado.getString("asistecia").equals("si")) {
                    asistido++;
                } else {
                    faltado++;
                }
                totalDias++;
                infox.put("boleta", resultado.getString("boleta"));
                infox.put("nombre", resultado.getString("nombre"));
                infox.put("asistecia", resultado.getString("asistecia"));
                infoTabla.add(infox);
                infox = null;
            }
            html += "</tbody>";
            html += "</table>";
        } catch (Exception error) {
            html = "";
        }

    }

    public String obtenerHtml() {
        return html;
    }
    
    public int obtenerAlumnosAsistidos() {
        return asistido;
    }

    public int obtenerAlumnosFaltados() {
        return faltado;
    }
    
    public int obtenerTotalAlumnos(){
        return totalDias;
    }

    public int obtenerTotalAlumnosGrafica() {
        return totalDias*2;
    }
    
    public String obtenerinfoJSON(){
        return infoTabla.toString();
    }
    
}
