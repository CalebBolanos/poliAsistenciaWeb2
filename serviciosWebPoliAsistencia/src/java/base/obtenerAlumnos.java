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
public class obtenerAlumnos {

    private String _html = "<table id=\"alumnos\" class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%;\">\n"
            + "<thead>\n"
            + "    <tr>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Boleta</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Nombre</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Grupo</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Turno</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Semestre</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Especialidad</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Detalles</th>\n"
            + "    </tr>\n"
            + "</thead>\n"
            + "<tbody>";

    public obtenerAlumnos() {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spDatosAlumnos();");
            while (resultado.next()) {
                _html += "<tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("boleta")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("paterno")+" "+resultado.getString("materno")+" "+resultado.getString("nombre")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("grupo")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("grupo")+"</td>\n"//falta consultar turnooooooo
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("semestre")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("area")+"</td>\n"//y especialidad
                        + "    <td class=\"mdl-data-table__cell--non-numeric\"><button class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--primary\" style=\"width: 100%\" onclick=\"enviarAlumno('"+resultado.getString("idPersona")+"', '"+resultado.getString("paterno")+" "+resultado.getString("materno")+" "+resultado.getString("nombre")+"');\">Ver mas</button></td>\n"
                        + "</tr>";
            }
            _html += "</tbody>";
            _html += "</table>";
        } catch (Exception error) {
            _html = "";
        } 
    }
    
    public String obtenerHtml(){
        return _html;
    }
}
