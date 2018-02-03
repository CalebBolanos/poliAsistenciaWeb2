/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Caleb
 */
public class asistenciaTurnoPorDia {
    private int _asistido, _faltado;
    public asistenciaTurnoPorDia(int turno, int mes, int dia){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spConsultaAXTD("+turno+","+mes+","+dia+");");
            if(resultado.next()){
                _asistido = resultado.getInt("asistencias");
                _faltado = resultado.getInt("faltas");
            }
        }
        catch(Exception error){
            _asistido = 0;
            _faltado = 0;
        }
    }
    
    public int obtenerAsistido(){
        return _asistido;
    }
    
    public int obtenerFaltado(){
        return _faltado;
    }
    
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
    public asistenciaTurnoPorDia(String turno){
        conexion.cDatos base = new conexion.cDatos();
        try {
            Calendar calendario = new GregorianCalendar();
            int mes = calendario.get(Calendar.MONTH) + 1;
            int dia = calendario.get(Calendar.DAY_OF_MONTH);
            base.conectar();
            ResultSet resultado = base.consulta("call spAsistenciaGrupoDia("+mes+","+dia+",'"+turno+"');");
            while (resultado.next()) {
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
    
}
