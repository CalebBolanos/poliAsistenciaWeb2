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
public class obtenerGrupos {

    private String _html = "<table id=\"grupos\" class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%;\">\n"
            + " <thead>\n"
            + "     <tr>\n"
            + "         <th class=\"mdl-data-table__cell--non-numeric\">Grupo</th>\n"
            + "         <th class=\"mdl-data-table__cell--non-numeric\">Semestre</th>\n"
            + "         <th class=\"mdl-data-table__cell--non-numeric\">Turno</th>\n"
            + "         <th class=\"mdl-data-table__cell--non-numeric\">Especialidad</th>\n"
            + "         <th class=\"mdl-data-table__cell--non-numeric\">Detalles</th>\n"
            + "     </tr>\n"
            + " </thead>\n"
            + " <tbody>\n";

    public obtenerGrupos() {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spDatosGrupo();");
            while (resultado.next()) {
                _html += "<tr>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("grupo")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("semestre")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("turmo")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\">"+resultado.getString("especialidad")+"</td>\n"
                        + "    <td class=\"mdl-data-table__cell--non-numeric\"><button class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--primary\" style=\"width: 100%\" onclick=\"enviarGrupo('"+resultado.getString("grupo")+"');\">Ver mas</button></td>\n"
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
