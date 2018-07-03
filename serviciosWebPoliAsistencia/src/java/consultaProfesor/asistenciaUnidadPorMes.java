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
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">% de Asistencia</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">% de Inasistencia</th>\n"
            + "                                            </tr>\n"
            + "                                        </thead>\n"
            + "                                        <tbody>";
    private int diasHabiles = 0;
    private int falta = 0, asistencia = 0;
    private float promedioAsistenciaIndividual = 0f, promedioInasistenciaIndividual = 0f;
    private int numeroAlumnos = 0;
    private float sumaAsistencia = 0f, sumaInasistencia = 0f;
    private float promedioAsistencia = 0f, promedioInasistencia = 0f;
    private JSONObject alumnox;
    private JSONArray alumnos = new JSONArray();

    public asistenciaUnidadPorMes(int idUnidad, int mes) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaUnidadMes(" + idUnidad + "," + mes + ");");
            ResultSet resultado2 = base.consulta("call spAsistenciaUnidadMes2(" + idUnidad + "," + mes + ");");
            while (resultado.next()) {
                alumnox = new JSONObject();
                asistencia = Integer.parseInt(resultado.getString("asistidos"));
                falta = Integer.parseInt(resultado.getString("faltas"));
                diasHabiles = asistencia + falta;
                promedioInasistenciaIndividual = (falta * 100) / diasHabiles;
                promedioAsistenciaIndividual = 100 - promedioInasistenciaIndividual;
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("Asistidos") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("faltas") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioAsistenciaIndividual + "%" + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioInasistenciaIndividual + "%" + "</td>\n"
                        + "</tr>";
                numeroAlumnos++;
                sumaAsistencia += promedioAsistenciaIndividual;
                sumaInasistencia += promedioInasistenciaIndividual;
                alumnox.put("boleta", resultado.getString("boleta"));
                alumnox.put("nombre", resultado.getString("nombre"));
                alumnox.put("asistidos", resultado.getString("asistidos"));
                alumnox.put("faltado", resultado.getString("faltas"));
                alumnos.add(alumnox);
                alumnox = null;
                numeroAlumnos++;
            }
            while(resultado2.next()){
                alumnox = new JSONObject();
                asistencia = Integer.parseInt(resultado2.getString("asistidos"));
                falta = Integer.parseInt(resultado2.getString("faltas"));
                diasHabiles = asistencia + falta;
                promedioInasistenciaIndividual = (falta * 100) / diasHabiles;
                promedioAsistenciaIndividual = 100 - promedioInasistenciaIndividual;
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado2.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado2.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado2.getString("Asistidos") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado2.getString("faltas") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioAsistenciaIndividual + "%" + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioInasistenciaIndividual + "%" + "</td>\n"
                        + "</tr>";
                numeroAlumnos++;
                sumaAsistencia += promedioAsistenciaIndividual;
                sumaInasistencia += promedioInasistenciaIndividual;
                alumnox.put("boleta", resultado2.getString("boleta"));
                alumnox.put("nombre", resultado2.getString("nombre"));
                alumnox.put("asistidos", resultado2.getString("asistidos"));
                alumnox.put("faltado", resultado2.getString("faltas"));
                alumnos.add(alumnox);
                alumnox = null;
                numeroAlumnos++;
            }
            html += "</tbody>";
            html += "</table>";
            if(numeroAlumnos > 0){
                promedioAsistencia = sumaAsistencia / numeroAlumnos;
                promedioInasistencia = sumaInasistencia / numeroAlumnos;
            }
        } catch (Exception error) {
            html = "";
        }

    }

    public String obtenerHtml() {
        return html;
    }
    
    public float promedioAsistido(){
        return promedioAsistencia;
    }
    
    public float pormedioFaltado(){
        return promedioInasistencia;
    }
    
    public int totalDias(){
        return diasHabiles;
    }
    
    public float grafTotalDias(){
        if(promedioAsistencia > promedioInasistencia){
            return promedioAsistencia * (float)1.3;
        }
        else{
            return promedioInasistencia * (float)1.3;
        }
    }
    
    public String obtenerinfoJSON(){
        return alumnos.toString();
    }
}
