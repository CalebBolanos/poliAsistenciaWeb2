/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;

/**
 *
 * @author Caleb
 */
public class asistenciaGrupoMes {
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
    //para sacar promedios de un alumno en un mes
    //dias habiles de un mes = falta+asitencia
    private int diasHabiles = 0;
    private int falta = 0, asistencia = 0;
    private float promedioAsistenciaIndividual = 0f, promedioInasistenciaIndividual = 0f;
    //para sacar los promedios de un turno en un mes
    private int numeroAlumnos = 0;
    private float sumaAsistencia = 0f, sumaInasistencia = 0f;
    private float promedioAsistencia = 0f, promedioInasistencia = 0f;
    public asistenciaGrupoMes(int mes, String grupo) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaGrupo("+mes+",'"+grupo+"');");
            while (resultado.next()) {
                asistencia = Integer.parseInt(resultado.getString("asistidos"));
                falta = Integer.parseInt(resultado.getString("faltados"));
                diasHabiles = asistencia + falta;
                promedioInasistenciaIndividual = (falta * 100) / diasHabiles;
                promedioAsistenciaIndividual = 100 - promedioInasistenciaIndividual;
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("asistidos") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("faltados") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioAsistenciaIndividual + "%" + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + promedioInasistenciaIndividual + "%" + "</td>\n"
                        + "</tr>";
                numeroAlumnos++;
                sumaAsistencia += promedioAsistenciaIndividual;
                sumaInasistencia += promedioInasistenciaIndividual;
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
}
