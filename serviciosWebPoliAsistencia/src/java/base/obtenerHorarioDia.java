/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Caleb
 */
public class obtenerHorarioDia {

    private String html = "                           <table class=\"mdl-data-table mdl-js-data-table\" style=\"width: 90%; left: 5%\">\n"
            + "                                        <thead>\n"
            + "                                            <tr>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Unidad de Aprendizaje</th>\n"
            + "                                                <th class=\"mdl-data-table__cell--non-numeric\">Hora</th>\n"
            + "                                            </tr>\n"
            + "                                        </thead>\n"
            + "                                        <tbody>\n";
    JSONArray materias = new JSONArray();
    JSONObject materiax;

    public obtenerHorarioDia(String boleta, int diaSemana) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            int inicioHora, finHora;
            String inicio, fin, unidad;
            base.conectar();
            ResultSet resultado = base.consulta("call spHorarioAlumno('" + boleta + "');");
            while (resultado.next()) {
                if (resultado.getInt("idDia") == diaSemana) {
                    materiax = new JSONObject();
                    inicioHora = resultado.getInt("idHorarioI");
                    finHora = resultado.getInt("idHorarioF");
                    inicio = evaluarHora(inicioHora);
                    fin = evaluarHora(finHora);
                    if (!inicio.equals("Valor invalido") || !fin.equals("Valor invalido")) {
                        html += "  <tr>\n"
                                + "      <td class=\"mdl-data-table__cell--non-numeric\">" + resultado.getString("materia") + "</td>\n"
                                + "      <td class=\"mdl-data-table__cell--non-numeric\">" + inicio + " - " + fin + "</td>\n"
                                + "  </tr>\n";
                        materiax.put("Materia", resultado.getString("materia"));
                        materiax.put("Hora", inicio + " - " + fin);
                        materias.add(materiax);
                        materiax = null;
                    } else {
                        html = "Error";
                        break;
                    }

                }
            }
            html += "    </tbody>\n"
                    + "</table>\n";
        } catch (Exception error) {
            html = "Error";
        }
    }
    
    public String obtenerJSON(){
        return materias.toString();
    }

    private String evaluarHora(int valorHora) {
        String hora;
        switch (valorHora) {
            case 1:
                hora = "7:00";
                break;
            case 2:
                hora = "8:00";
                break;
            case 3:
                hora = "9:00";
                break;
            case 4:
                hora = "10:00";
                break;
            case 5:
                hora = "11:00";
                break;
            case 6:
                hora = "12:00";
                break;
            case 7:
                hora = "13:00";
                break;
            case 8:
                hora = "14:00";
                break;
            case 9:
                hora = "15:00";
                break;
            case 10:
                hora = "16:00";
                break;
            case 11:
                hora = "17:00";
                break;
            case 12:
                hora = "18:00";
                break;
            case 13:
                hora = "19:00";
                break;
            case 14:
                hora = "20:00";
                break;
            case 15:
                hora = "21:00";
                break;
            default:
                hora = "Valor invalido";
                break;

        }
        return hora;
    }

    public String obtenerHtml() {
        return html;
    }
}
