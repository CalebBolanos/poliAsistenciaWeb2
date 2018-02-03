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
public class asistenciaTurnoMes {
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
    String falta;
    public asistenciaTurnoMes(int mes, int turno) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaturnomes("+mes+","+turno+");");
            ResultSet dias = base.consulta("call spConsultaAXT("+turno+", "+mes+");");
            if(dias.next()){
                totalDias = dias.getInt("count(*)");
            }
            while (resultado.next()) {
                
                if(resultado.getString("faltas") == null){
                    falta = "0";
                }else{
                    falta = resultado.getString("faltados");
                }
                html += " <tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("boleta") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("nombre") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("Asistidos") + "</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">" + falta + "</td>\n"
                        + "</tr>";
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
}
