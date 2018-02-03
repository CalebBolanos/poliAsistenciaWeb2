/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaJefe;

import java.sql.ResultSet;

/**
 *
 * @author Caleb
 */
public class asistenciaIndividual {

    private String infohtml = "<table class=\"mdl-data-table mdl-js-data-table\" style=\"width: 100%;\">"
            + "<thead>\n"
            + "    <tr>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Asistido</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Día</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Hora de entrada</th>\n"
            + "        <th class=\"mdl-data-table__cell--non-numeric\">Hora de Salida</th>\n"
            + "    </tr>\n"
            + "</thead>";
    private int asistido = 0, faltado = 0, totalDias = 0, mes = 0;

    public asistenciaIndividual(String idPer, String mes) {
        conexion.cDatos base = new conexion.cDatos();
        this.mes = Integer.parseInt(mes);
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spConsultaA(" + idPer + "," + mes + ");");
            infohtml += "<tbody>";
            while (resultado.next()) {
                infohtml += "<tr>\n"
                        + "     <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("asistecia") + "</td>\n"
                        + "     <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("dia") + "</td>\n"
                        + "     <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("Hora de entrada") + "</td>\n"
                        + "     <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("Hora de salida") + "</td>\n"
                        + " </tr>";
                if (resultado.getString("asistecia").equals("si")) {
                    asistido++;
                } else {
                    faltado++;
                }
                totalDias++;
            }
            infohtml += "</tbody>";
            infohtml += "</table>";
        } catch (Exception error) {
            infohtml = "";
        }
    }

    public String obtenerInformacion() {
        return infohtml;
    }

    public int obtenerDiasAsistidos() {
        return asistido;
    }

    public int obtenerDiasFaltados() {
        return faltado;
    }

    public int obtenerTotalDias() {
        return totalDias*2;
    }

    public int obtenerMes() {
        return mes;
    }
}
