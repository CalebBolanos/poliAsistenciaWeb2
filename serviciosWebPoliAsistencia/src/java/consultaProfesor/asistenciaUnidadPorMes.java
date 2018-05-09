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
public class asistenciaUnidadPorMes {

    private String html = "<table class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%;\">\n"
            + "                                        <thead>\n"
            + "                                            <tr>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Boleta</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Nombre</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Dias Asistidos</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Dias Faltados</th>\n"
            + "                                            </tr>\n"
            + "                                        </thead>\n"
            + "                                        <tbody>";
    private int numeroAlumnos, totalDias, alumnoAsistido;
    private float totalAsistido, totalFaltado;
    private JSONObject alumnox;
    private JSONArray alumnos = new JSONArray();

    public asistenciaUnidadPorMes(int idUnidad, int mes) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaUnidadMes(" + idUnidad + "," + mes + ");");
            ResultSet dias = base.consulta("call spATotal(" + idUnidad + "," + mes + ");");
            if(dias.next()){
                totalDias = dias.getInt("Total");
            }
            while (resultado.next()) {
                alumnox = new JSONObject();
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("asistidos") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("Mes") + "</td>\n"
                        + "</tr>";
                alumnox.put("boleta", resultado.getString("boleta"));
                alumnox.put("nombre", resultado.getString("nombre"));
                alumnox.put("asistidos", resultado.getString("asistidos"));
                alumnox.put("faltado", resultado.getString("Mes"));
                alumnos.add(alumnox);
                alumnox = null;
                alumnoAsistido = Integer.parseInt(resultado.getString("asistidos"));
                totalAsistido += alumnoAsistido / (float)totalDias;
                numeroAlumnos++;
            }
            html += "</tbody>";
            html += "</table>";
            totalFaltado = numeroAlumnos - totalAsistido;
        } catch (Exception error) {
            html = "";
        }

    }

    public String obtenerHtml() {
        return html;
    }
    
    public float promedioAsistido(){
        return totalAsistido;
    }
    
    public float pormedioFaltado(){
        return totalFaltado;
    }
    
    public int totalDias(){
        return totalDias;
    }
    
    public float grafTotalDias(){
        return totalAsistido * (float)1.3;
    }
    
    public String obtenerinfoJSON(){
        return alumnos.toString();
    }
}
