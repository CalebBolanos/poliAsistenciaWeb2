/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Caleb
 */
public class asistenciaMatutino {

    private int _idPersona = 0;
    private int _idTipo = 0;
    private String _numero = "";
    private String _nombre = "";
    private String _asistenciaMatutino = "";

    public asistenciaMatutino(int idPersona, int idTipo, String numero, String nombre) {
        _idPersona = idPersona;
        _idTipo = idTipo;
        _numero = numero;
        _nombre = nombre;
    }

    public String dibujarAsistenciaMatutino() {

//=============================================================================================================================================================================
        String htmlInformacionMes = "";
        String scriptInformacionMes = "";
        String scriptGeneralMes = "";
        profesor.generadorHtml generar = new profesor.generadorHtml();

        //ciclo 1
        String htmlAgosto, promedioAsistidoAgosto = "", promedioFaltadoAgosto = "", totalClasesAgosto, totalGraficaAgosto;
        String htmlSeptiembre, promedioAsistidoSeptiembre = "", promedioFaltadoSeptiembre = "", totalClasesSeptiembre, totalGraficaSeptiembre;
        String htmlOctubre, promedioAsistidoOctubre = "", promedioFaltadoOctubre = "", totalClasesOctubre, totalGraficaOctubre;
        String htmlNoviembre, promedioAsistidoNoviembre = "", promedioFaltadoNoviembre = "", totalClasesNoviembre, totalGraficaNoviembre;
        String htmlDiciembre, promedioAsistidoDiciembre = "", promedioFaltadoDiciembre = "", totalClasesDiciembre, totalGraficaDiciembre;

        //ciclo 2
        String htmlEnero, promedioAsistidoEnero = "", promedioFaltadoEnero = "", totalClasesEnero, totalGraficaEnero;
        String htmlFebrero, promedioAsistidoFebrero = "", promedioFaltadoFebrero = "", totalClasesFebrero, totalGraficaFebrero;
        String htmlMarzo, promedioAsistidoMarzo = "", promedioFaltadoMarzo = "", totalClasesMarzo, totalGraficaMarzo;
        String htmlAbril, promedioAsistidoAbril = "", promedioFaltadoAbril = "", totalClasesAbril, totalGraficaAbril;
        String htmlMayo, promedioAsistidoMayo = "", promedioFaltadoMayo = "", totalClasesMayo, totalGraficaMayo;
        String htmlJunio, promedioAsistidoJunio = "", promedioFaltadoJunio = "", totalClasesJunio, totalGraficaJunio;
        String htmlJulio, promedioAsistidoJulio = "", promedioFaltadoJulio = "", totalClasesJulio, totalGraficaJulio;

        Calendar calendario = new GregorianCalendar();
        int mes = calendario.get(Calendar.MONTH);
        if (mes > Calendar.JULY && mes < Calendar.DECEMBER + 1) {//Ciclo 1
            if (mes > Calendar.JULY) {
                ArrayList<Object> datosAsistenciaAgosto = new ArrayList<>(asistenciaTurnoMes(8, 1));

                htmlAgosto = (String) datosAsistenciaAgosto.get(0);
                promedioAsistidoAgosto = Float.toString((float) datosAsistenciaAgosto.get(1));
                promedioFaltadoAgosto = Float.toString((float) datosAsistenciaAgosto.get(2));
                totalClasesAgosto = Integer.toString((int) datosAsistenciaAgosto.get(3));
                totalGraficaAgosto = Float.toString((float) datosAsistenciaAgosto.get(4));

                htmlInformacionMes += generar.htmlInformacionMes(Calendar.AUGUST, totalClasesAgosto, promedioAsistidoAgosto, promedioFaltadoAgosto, htmlAgosto);
                scriptInformacionMes += generar.scriptInformacionMes(Calendar.AUGUST, promedioAsistidoAgosto, promedioFaltadoAgosto, totalGraficaAgosto);

                scriptGeneralMes = ""
                        + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                        + "            var chart = new Chart(ctx, {\n"
                        + "                // The type of chart we want to create\n"
                        + "                type: 'line',\n"
                        + "\n"
                        + "                // The data for our dataset\n"
                        + "                data: {\n"
                        + "                    labels: [\"Meses\", \"Agosto\"],\n"
                        + "                    datasets: [{\n"
                        + "                            label: \"Alumnos que Faltaron\",\n"
                        + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                        + "                            borderColor: 'rgb(255, 0, 0)',\n"
                        + "                            data: [0, " + promedioFaltadoAgosto + "],\n"
                        + "                        },\n"
                        + "                        {\n"
                        + "                            label: \"Alumnos que Asistieron\",\n"
                        + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                        + "                            borderColor: 'rgb(0, 145, 234)',\n"
                        + "                            data: [0, " + promedioAsistidoAgosto + "],\n"
                        + "                        }\n"
                        + "                    ]\n"
                        + "                },\n"
                        + "\n"
                        + "                // Configuration options go here\n"
                        + "                options: {}\n"
                        + "            });\n";
            }
            if (mes > Calendar.AUGUST) {
                ArrayList<Object> datosAsistenciaSeptiembre = new ArrayList<>(asistenciaTurnoMes(9, 1));

                htmlSeptiembre = (String) datosAsistenciaSeptiembre.get(0);
                promedioAsistidoSeptiembre = Float.toString((float) datosAsistenciaSeptiembre.get(1));
                promedioFaltadoSeptiembre = Float.toString((float) datosAsistenciaSeptiembre.get(2));
                totalClasesSeptiembre = Integer.toString((int) datosAsistenciaSeptiembre.get(3));
                totalGraficaSeptiembre = Float.toString((float) datosAsistenciaSeptiembre.get(4));

                htmlInformacionMes += generar.htmlInformacionMes(Calendar.SEPTEMBER, totalClasesSeptiembre, promedioAsistidoSeptiembre, promedioFaltadoSeptiembre, htmlSeptiembre);
                scriptInformacionMes += generar.scriptInformacionMes(Calendar.SEPTEMBER, promedioAsistidoSeptiembre, promedioFaltadoSeptiembre, totalGraficaSeptiembre);

                scriptGeneralMes = ""
                        + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                        + "            var chart = new Chart(ctx, {\n"
                        + "                // The type of chart we want to create\n"
                        + "                type: 'line',\n"
                        + "\n"
                        + "                // The data for our dataset\n"
                        + "                data: {\n"
                        + "                    labels: [\"Meses\", \"Agosto\", \"Septiembre\"],\n"
                        + "                    datasets: [{\n"
                        + "                            label: \"Alumnos que Faltaron\",\n"
                        + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                        + "                            borderColor: 'rgb(255, 0, 0)',\n"
                        + "                            data: [0, " + promedioFaltadoAgosto + ", " + promedioFaltadoSeptiembre + "],\n"
                        + "                        },\n"
                        + "                        {\n"
                        + "                            label: \"Alumnos que Asistieron\",\n"
                        + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                        + "                            borderColor: 'rgb(0, 145, 234)',\n"
                        + "                            data: [0, " + promedioAsistidoAgosto + ", " + promedioAsistidoSeptiembre + "],\n"
                        + "                        }\n"
                        + "                    ]\n"
                        + "                },\n"
                        + "\n"
                        + "                // Configuration options go here\n"
                        + "                options: {}\n"
                        + "            });\n";
            }
            if (mes > Calendar.SEPTEMBER) {
                ArrayList<Object> datosAsistenciaOctubre = new ArrayList<>(asistenciaTurnoMes(10, 1));

                htmlOctubre = (String) datosAsistenciaOctubre.get(0);
                promedioAsistidoOctubre = Float.toString((float) datosAsistenciaOctubre.get(1));
                promedioFaltadoOctubre = Float.toString((float) datosAsistenciaOctubre.get(2));
                totalClasesOctubre = Integer.toString((int) datosAsistenciaOctubre.get(3));
                totalGraficaOctubre = Float.toString((float) datosAsistenciaOctubre.get(4));

                htmlInformacionMes += generar.htmlInformacionMes(Calendar.OCTOBER, totalClasesOctubre, promedioAsistidoOctubre, promedioFaltadoOctubre, htmlOctubre);
                scriptInformacionMes += generar.scriptInformacionMes(Calendar.OCTOBER, promedioAsistidoOctubre, promedioFaltadoOctubre, totalGraficaOctubre);

                scriptGeneralMes = ""
                        + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                        + "            var chart = new Chart(ctx, {\n"
                        + "                // The type of chart we want to create\n"
                        + "                type: 'line',\n"
                        + "\n"
                        + "                // The data for our dataset\n"
                        + "                data: {\n"
                        + "                    labels: [\"Meses\", \"Agosto\", \"Septiembre\", \"Octubre\"],\n"
                        + "                    datasets: [{\n"
                        + "                            label: \"Alumnos que Faltaron\",\n"
                        + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                        + "                            borderColor: 'rgb(255, 0, 0)',\n"
                        + "                            data: [0, " + promedioFaltadoAgosto + ", " + promedioFaltadoSeptiembre + ", " + promedioFaltadoOctubre + "],\n"
                        + "                        },\n"
                        + "                        {\n"
                        + "                            label: \"Alumnos que Asistieron\",\n"
                        + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                        + "                            borderColor: 'rgb(0, 145, 234)',\n"
                        + "                            data: [0, " + promedioAsistidoAgosto + ", " + promedioAsistidoSeptiembre + ", " + promedioAsistidoOctubre + "],\n"
                        + "                        }\n"
                        + "                    ]\n"
                        + "                },\n"
                        + "\n"
                        + "                // Configuration options go here\n"
                        + "                options: {}\n"
                        + "            });\n";
            }
            if (mes > Calendar.OCTOBER) {
                ArrayList<Object> datosAsistenciaNoviembre = new ArrayList<>(asistenciaTurnoMes(11, 1));
                
                htmlNoviembre = (String) datosAsistenciaNoviembre.get(0);
                promedioAsistidoNoviembre = Float.toString((float) datosAsistenciaNoviembre.get(1));
                promedioFaltadoNoviembre = Float.toString((float) datosAsistenciaNoviembre.get(2));
                totalClasesNoviembre = Integer.toString((int) datosAsistenciaNoviembre.get(3));
                totalGraficaNoviembre = Float.toString((float) datosAsistenciaNoviembre.get(4));

                htmlInformacionMes += generar.htmlInformacionMes(Calendar.NOVEMBER, totalClasesNoviembre, promedioAsistidoNoviembre, promedioFaltadoNoviembre, htmlNoviembre);
                scriptInformacionMes += generar.scriptInformacionMes(Calendar.NOVEMBER, promedioAsistidoNoviembre, promedioFaltadoNoviembre, totalGraficaNoviembre);

                scriptGeneralMes = ""
                        + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                        + "            var chart = new Chart(ctx, {\n"
                        + "                // The type of chart we want to create\n"
                        + "                type: 'line',\n"
                        + "\n"
                        + "                // The data for our dataset\n"
                        + "                data: {\n"
                        + "                    labels: [\"Meses\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\"],\n"
                        + "                    datasets: [{\n"
                        + "                            label: \"Alumnos que Faltaron\",\n"
                        + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                        + "                            borderColor: 'rgb(255, 0, 0)',\n"
                        + "                            data: [0, " + promedioFaltadoAgosto + ", " + promedioFaltadoSeptiembre + ", " + promedioFaltadoOctubre + ", " + promedioFaltadoNoviembre + "],\n"
                        + "                        },\n"
                        + "                        {\n"
                        + "                            label: \"Alumnos que Asistieron\",\n"
                        + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                        + "                            borderColor: 'rgb(0, 145, 234)',\n"
                        + "                            data: [0, " + promedioAsistidoAgosto + ", " + promedioAsistidoSeptiembre + ", " + promedioAsistidoOctubre + ", " + promedioAsistidoNoviembre + "],\n"
                        + "                        }\n"
                        + "                    ]\n"
                        + "                },\n"
                        + "\n"
                        + "                // Configuration options go here\n"
                        + "                options: {}\n"
                        + "            });\n";
            }
            if (mes > Calendar.NOVEMBER) {
                ArrayList<Object> datosAsistenciaDiciembre = new ArrayList<>(asistenciaTurnoMes(12, 1));

                htmlDiciembre = (String) datosAsistenciaDiciembre.get(0);
                promedioAsistidoDiciembre = Float.toString((float) datosAsistenciaDiciembre.get(1));
                promedioFaltadoDiciembre = Float.toString((float) datosAsistenciaDiciembre.get(2));
                totalClasesDiciembre = Integer.toString((int) datosAsistenciaDiciembre.get(3));
                totalGraficaDiciembre = Float.toString((float) datosAsistenciaDiciembre.get(4));

                htmlInformacionMes += generar.htmlInformacionMes(Calendar.DECEMBER, totalClasesDiciembre, promedioAsistidoDiciembre, promedioFaltadoDiciembre, htmlDiciembre);
                scriptInformacionMes += generar.scriptInformacionMes(Calendar.DECEMBER, promedioAsistidoDiciembre, promedioFaltadoDiciembre, totalGraficaDiciembre);

                scriptGeneralMes = ""
                        + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                        + "            var chart = new Chart(ctx, {\n"
                        + "                // The type of chart we want to create\n"
                        + "                type: 'line',\n"
                        + "\n"
                        + "                // The data for our dataset\n"
                        + "                data: {\n"
                        + "                    labels: [\"Meses\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\", \"Diciembre\"],\n"
                        + "                    datasets: [{\n"
                        + "                            label: \"Alumnos que Faltaron\",\n"
                        + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                        + "                            borderColor: 'rgb(255, 0, 0)',\n"
                        + "                            data: [0, " + promedioFaltadoAgosto + ", " + promedioFaltadoSeptiembre + ", " + promedioFaltadoOctubre + ", " + promedioFaltadoNoviembre + ", " + promedioFaltadoDiciembre + "],\n"
                        + "                        },\n"
                        + "                        {\n"
                        + "                            label: \"Alumnos que Asistieron\",\n"
                        + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                        + "                            borderColor: 'rgb(0, 145, 234)',\n"
                        + "                            data: [0, " + promedioAsistidoAgosto + ", " + promedioAsistidoSeptiembre + ", " + promedioAsistidoOctubre + ", " + promedioAsistidoNoviembre + ", " + promedioAsistidoDiciembre + "],\n"
                        + "                        }\n"
                        + "                    ]\n"
                        + "                },\n"
                        + "\n"
                        + "                // Configuration options go here\n"
                        + "                options: {}\n"
                        + "            });\n";
            }
        } else {
            if (mes > Calendar.JANUARY - 1 && mes < Calendar.AUGUST) {//Ciclo 2
                if (mes > Calendar.JANUARY - 1) {
                    ArrayList<Object> datosAsistenciaEnero = new ArrayList<>(asistenciaTurnoMes(1, 1));

                    htmlEnero = (String) datosAsistenciaEnero.get(0);
                    promedioAsistidoEnero = Float.toString((float) datosAsistenciaEnero.get(1));
                    promedioFaltadoEnero = Float.toString((float) datosAsistenciaEnero.get(2));
                    totalClasesEnero = Integer.toString((int) datosAsistenciaEnero.get(3));
                    totalGraficaEnero = Float.toString((float) datosAsistenciaEnero.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.JANUARY, totalClasesEnero, promedioAsistidoEnero, promedioFaltadoEnero, htmlEnero);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.JANUARY, promedioAsistidoEnero, promedioFaltadoEnero, totalGraficaEnero);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.JANUARY) {
                    ArrayList<Object> datosAsistenciaFebrero = new ArrayList<>(asistenciaTurnoMes(2, 1));

                    htmlFebrero = (String) datosAsistenciaFebrero.get(0);
                    promedioAsistidoFebrero = Float.toString((float) datosAsistenciaFebrero.get(1));
                    promedioFaltadoFebrero = Float.toString((float) datosAsistenciaFebrero.get(2));
                    totalClasesFebrero = Integer.toString((int) datosAsistenciaFebrero.get(3));
                    totalGraficaFebrero = Float.toString((float) datosAsistenciaFebrero.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.FEBRUARY, totalClasesFebrero, promedioAsistidoFebrero, promedioFaltadoFebrero, htmlFebrero);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.FEBRUARY, promedioAsistidoFebrero, promedioFaltadoFebrero, totalGraficaFebrero);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.FEBRUARY) {
                    ArrayList<Object> datosAsistenciaMarzo = new ArrayList<>(asistenciaTurnoMes(3, 1));

                    htmlMarzo = (String) datosAsistenciaMarzo.get(0);
                    promedioAsistidoMarzo = Float.toString((float) datosAsistenciaMarzo.get(1));
                    promedioFaltadoMarzo = Float.toString((float) datosAsistenciaMarzo.get(2));
                    totalClasesMarzo = Integer.toString((int) datosAsistenciaMarzo.get(3));
                    totalGraficaMarzo = Float.toString((float) datosAsistenciaMarzo.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.MARCH, totalClasesMarzo, promedioAsistidoMarzo, promedioFaltadoMarzo, htmlMarzo);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.MARCH, promedioAsistidoMarzo, promedioFaltadoMarzo, totalGraficaMarzo);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\", \"Marzo\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + ", " + promedioFaltadoMarzo + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + ", " + promedioAsistidoMarzo + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.MARCH) {
                    ArrayList<Object> datosAsistenciaAbril = new ArrayList<>(asistenciaTurnoMes(4, 1));

                    htmlAbril = (String) datosAsistenciaAbril.get(0);
                    promedioAsistidoAbril = Float.toString((float) datosAsistenciaAbril.get(1));
                    promedioFaltadoAbril = Float.toString((float) datosAsistenciaAbril.get(2));
                    totalClasesAbril = Integer.toString((int) datosAsistenciaAbril.get(3));
                    totalGraficaAbril = Float.toString((float) datosAsistenciaAbril.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.APRIL, totalClasesAbril, promedioAsistidoAbril, promedioFaltadoAbril, htmlAbril);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.APRIL, promedioAsistidoAbril, promedioFaltadoAbril, totalGraficaAbril);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\", \"Marzo\", \"Abril\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + ", " + promedioFaltadoMarzo + ", " + promedioFaltadoAbril + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + ", " + promedioAsistidoMarzo + ", " + promedioAsistidoAbril + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.APRIL) {
                    ArrayList<Object> datosAsistenciaMayo = new ArrayList<>(asistenciaTurnoMes(5, 1));

                    htmlMayo = (String) datosAsistenciaMayo.get(0);
                    promedioAsistidoMayo = Float.toString((float) datosAsistenciaMayo.get(1));
                    promedioFaltadoMayo = Float.toString((float) datosAsistenciaMayo.get(2));
                    totalClasesMayo = Integer.toString((int) datosAsistenciaMayo.get(3));
                    totalGraficaMayo = Float.toString((float) datosAsistenciaMayo.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.MAY, totalClasesMayo, promedioAsistidoMayo, promedioFaltadoMayo, htmlMayo);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.MAY, promedioAsistidoMayo, promedioFaltadoMayo, totalGraficaMayo);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + ", " + promedioFaltadoMarzo + ", " + promedioFaltadoAbril + ", " + promedioFaltadoMayo + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + ", " + promedioAsistidoMarzo + ", " + promedioAsistidoAbril + ", " + promedioAsistidoMayo + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.MAY) {
                    ArrayList<Object> datosAsistenciaJunio = new ArrayList<>(asistenciaTurnoMes(6, 1));

                    htmlJunio = (String) datosAsistenciaJunio.get(0);
                    promedioAsistidoJunio = Float.toString((float) datosAsistenciaJunio.get(1));
                    promedioFaltadoJunio = Float.toString((float) datosAsistenciaJunio.get(2));
                    totalClasesJunio = Integer.toString((int) datosAsistenciaJunio.get(3));
                    totalGraficaJunio = Float.toString((float) datosAsistenciaJunio.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.JUNE, totalClasesJunio, promedioAsistidoJunio, promedioFaltadoJunio, htmlJunio);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.JUNE, promedioAsistidoJunio, promedioFaltadoJunio, totalGraficaJunio);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + ", " + promedioFaltadoMarzo + ", " + promedioFaltadoAbril + ", " + promedioFaltadoMayo + ", " + promedioFaltadoJunio + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + ", " + promedioAsistidoMarzo + ", " + promedioAsistidoAbril + ", " + promedioAsistidoMayo + ", " + promedioAsistidoJunio + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
                if (mes > Calendar.JUNE) {
                    ArrayList<Object> datosAsistenciaJulio = new ArrayList<>(asistenciaTurnoMes(7, 1));

                    htmlJulio = (String) datosAsistenciaJulio.get(0);
                    promedioAsistidoJulio = Float.toString((float) datosAsistenciaJulio.get(1));
                    promedioFaltadoJulio = Float.toString((float) datosAsistenciaJulio.get(2));
                    totalClasesJulio = Integer.toString((int) datosAsistenciaJulio.get(3));
                    totalGraficaJulio = Float.toString((float) datosAsistenciaJulio.get(4));

                    htmlInformacionMes += generar.htmlInformacionMes(Calendar.JULY, totalClasesJulio, promedioAsistidoJulio, promedioFaltadoJulio, htmlJulio);
                    scriptInformacionMes += generar.scriptInformacionMes(Calendar.JULY, promedioAsistidoJulio, promedioFaltadoJulio, totalGraficaJulio);

                    scriptGeneralMes = ""
                            + "            var ctx = document.getElementById('grafica').getContext('2d');\n"
                            + "            var chart = new Chart(ctx, {\n"
                            + "                // The type of chart we want to create\n"
                            + "                type: 'line',\n"
                            + "\n"
                            + "                // The data for our dataset\n"
                            + "                data: {\n"
                            + "                    labels: [\"Meses\", \"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\", \"Julio\"],\n"
                            + "                    datasets: [{\n"
                            + "                            label: \"Alumnos que Faltaron\",\n"
                            + "                            backgroundColor: 'rgba(255, 0, 0, 0.2)',\n"
                            + "                            borderColor: 'rgb(255, 0, 0)',\n"
                            + "                            data: [0, " + promedioFaltadoEnero + ", " + promedioFaltadoFebrero + ", " + promedioFaltadoMarzo + ", " + promedioFaltadoAbril + ", " + promedioFaltadoMayo + ", " + promedioFaltadoJunio + ", " + promedioFaltadoJulio + "],\n"
                            + "                        },\n"
                            + "                        {\n"
                            + "                            label: \"Alumnos que Asistieron\",\n"
                            + "                            backgroundColor: 'rgba(0, 145, 234, 0.2)',\n"
                            + "                            borderColor: 'rgb(0, 145, 234)',\n"
                            + "                            data: [0, " + promedioAsistidoEnero + ", " + promedioAsistidoFebrero + ", " + promedioAsistidoMarzo + ", " + promedioAsistidoAbril + ", " + promedioAsistidoMayo + ", " + promedioAsistidoJunio + ", " + promedioAsistidoJulio + "],\n"
                            + "                        }\n"
                            + "                    ]\n"
                            + "                },\n"
                            + "\n"
                            + "                // Configuration options go here\n"
                            + "                options: {}\n"
                            + "            });\n";
                }
            }
        }

//==========================================================================================================================================================
        ArrayList<Object> asistenciaDia = new ArrayList<>(asistenciaTurnoPorDiaMas("1"));
        String htmlAsistenciaDia = (String) asistenciaDia.get(0);
        int totalAlumnosxDia = (int) asistenciaDia.get(3);
        int asistidosxDia = (int) asistenciaDia.get(1);
        int faltadosxDia = (int) asistenciaDia.get(2);
        _asistenciaMatutino= "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <meta name=\"description\" content=\"PoliAsistencia\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                + "        <title>Unidad de Aprendizaje</title>\n"
                + "        <link href=\"../css/mdl/material.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"../css/mdl/material.js\" type=\"text/javascript\"></script>\n"
                + "        <link href=\"../css/mdl/material.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n"
                + "        <script src=\"../css/mdl/material.min.js\" type=\"text/javascript\"></script>\n"
                + "        <link rel=\"shortcut icon\" href=\"../imagenes/iconos/poliAsistIcono.ico\" />\n"
                + "        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\n"
                + "        <meta name=\"theme-color\" content=\"#00B0FF\" />\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"HandheldFriendly\" content=\"true\">\n"
                + "        <style>\n"
                + "@font-face{\n"
                + "                font-family: Calibri;\n"
                + "                src: URL(\"../fuentes/calibri.ttf\") format(\"opentype\");\n"
                + "            }"
                + "            .titulo{\n"
                + "                font-size: 35px;\n"
                + "                color: #00B0FF;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .tituloBold{\n"
                + "                font-size: 40px;\n"
                + "                color: #0091EA;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 30px;\n"
                + "            }\n"
                + "            .titulob{\n"
                + "                font-size: 35px;\n"
                + "                color: white;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            .tituloBoldb{\n"
                + "                font-size: 40px;\n"
                + "                color: white;\n"
                + "                font-weight: bold;\n"
                + "                font-family: Calibri;\n"
                + "                padding-top: 33px;\n"
                + "            }\n"
                + "            #tarjeta{\n"
                + "                background-color: rgba(250, 250, 250, 0.4);\n"
                + "                text-align: left;\n"
                + "                color: white;\n"
                + "                font-size: 30px;\n"
                + "                width: auto;\n"
                + "                height: 30px;\n"
                + "                position: relative;\n"
                + "                border-radius: 5px;\n"
                + "                padding-top: 5px;\n"
                + "                font-family: Calibri; \n"
                + "            }\n"
                + "            .centrado{\n"
                + "                position: absolute;\n"
                + "                width: auto;\n"
                + "                height: auto;\n"
                + "                padding-left: 35%;\n"
                + "            }\n"
                + "            .persona{\n"
                + "                background-color: rgba(250, 250, 250, 0.0);\n"
                + "                color: white;\n"
                + "                font-size: 20px;\n"
                + "                border: 2px solid rgba(250, 250, 250, 0.0);\n"
                + "                width: auto;\n"
                + "            }\n"
                + "            #cuenta, #salir{\n"
                + "                display: none;\n"
                + "            }\n"
                + "            #barrita{\n"
                + "                background-color: white;\n"
                + "                height: 100%;\n"
                + "                width: 100%;\n"
                + "                position: fixed;\n"
                + "                -webkit-transition: all 1s ease;\n"
                + "                -o-transition: all 1s ease;\n"
                + "                transition: all 1s ease;\n"
                + "                z-index: 10000;\n"
                + "\n"
                + "            }\n"
                + "            #cargar{\n"
                + "                position: absolute;\n"
                + "                top: 0;\n"
                + "                left: 0;\n"
                + "                right: 0;\n"
                + "                bottom: 0;\n"
                + "                margin: auto;\n"
                + "            }\n"
                + "            .demo-card-wide.mdl-card {\n"
                + "                width: 700px;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__title {\n"
                + "                color: #fff;\n"
                + "                height: auto;\n"
                + "                background-color: black;\n"
                + "            }\n"
                + "            .demo-card-wide > .mdl-card__menu {\n"
                + "                color: #fff;\n"
                + "            }\n"
                + "            .notificacion{\n"
                + "                padding-top: 15px;\n"
                + "                padding-bottom: 15px;\n"
                + "            }\n"
                + "            .adaptador{\n"
                + "                width: 1000px; padding-top: 30px; padding-bottom: 5px;\n"
                + "            }\n"
                + "\n"
                + "            /* Rules for sizing the icon. */\n"
                + "            .material-icons.md-18 { font-size: 18px; }\n"
                + "            .material-icons.md-24 { font-size: 24px; }\n"
                + "            .material-icons.md-36 { font-size: 26px; }\n"
                + "            .material-icons.md-48 { font-size: 54px; }\n"
                + "\n"
                + "            /* Rules for using icons as black on a light background. */\n"
                + "            .material-icons.md-dark { color: rgba(0, 0, 0, 0.54); }\n"
                + "            .material-icons.md-dark.md-inactive { color: rgba(0, 0, 0, 0.26); }\n"
                + "\n"
                + "            /* Rules for using icons as white on a dark background. */\n"
                + "            .material-icons.md-light { color: rgba(255, 255, 255, 1); }\n"
                + "            .material-icons.md-light.md-inactive { color: rgba(255, 255, 255, 0.3); }\n"
                + "\n"
                + "            .seleccionado{\n"
                + "                background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 158, 255));\n"
                + "                color: white !important;\n"
                + "                font-size: 20px;\n"
                + "\n"
                + "            }\n"
                + "            .disponible{\n"
                + "                font-size: 20px;\n"
                + "                transition: all 0.3s;\n"
                + "            }\n"
                + "            .tarjetas{\n"
                + "                background-color: white;\n"
                + "                width: auto;\n"
                + "                transition: all 0.3s cubic-bezier(.25,.8,.25,1);\n"
                + "                box-shadow: 0 1px 2px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n"
                + "                border-radius: 10px 15px;\n"
                + "                text-decoration: none;               \n"
                + "                height: auto;\n"
                + "                overflow: hidden;\n"
                + "            }\n"
                + "            a{\n"
                + "                text-decoration: none;\n"
                + "                color: inherit;\n"
                + "            }\n"
                + "            .tarjetas:hover{\n"
                + "                box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);\n"
                + "            }\n"
                + "            .mdl-grid.center-items {\n"
                + "                justify-content: center;\n"
                + "            }\n"
                + "            .grafica{\n"
                + "                width: 40%;\n"
                + "            }\n"
                + "            .iconos{\n"
                + "                width: 30%; height: inherit; position: relative; float: left; border-top-left-radius: 10px; border-bottom-left-radius: 15px;\n"
                + "                display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "            }\n"
                + "            .descripcion{\n"
                + "                width: 70%; height: inherit; position: relative; float: left; color: gray;\n"
                + "                font-size: 20px; display: flex; justify-content: center; align-content: center; flex-direction: column; text-align: center;\n"
                + "            }\n"
                + "            tbody{\n"
                + "\n"
                + "            }\n"
                + "            .titulos{\n"
                + "                color: rgb(255, 80, 0); font-size: 50px; padding-top: 30px; padding-bottom: 20px;\n"
                + "            }\n"
                + "            .graf{\n"
                + "                width: 90%; left: 5%;\n"
                + "            }\n"
                + "            .tamanoMes{\n"
                + "                height: 294px;\n"
                + "            }\n"
                + "            .ajusta{\n"
                + "                width: 100%;  height: auto;\n"
                + "            }\n"
                + "            .tituloMes{\n"
                + "                color: white; font-size: 34px; text-align: center; width: 100%; height: 54px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n"
                + "            }\n"
                + "            .ajustarTabla{\n"
                + "                width: 100%; height: 240px; overflow: auto;\n"
                + "            }\n"
                + "\n"
                + "\n"
                + "@media screen and (max-width: 479px){\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "            }\n"
                + "            @media screen and (max-width: 500px){\n"
                + "                \n"
                + "                .titulob{\n"
                + "                    font-size: 35px;\n"
                + "                    color: transparent;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 40px;\n"
                + "                    color: transparent;\n"
                + "                    font-weight: bold;\n"
                + "                    font-family: Calibri;\n"
                + "                    padding-top: 33px;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 5px;\n"
                + "                    padding-right: 5px;\n"
                + "                }\n"
                + "                .editor{\n"
                + "                    width: 100%;\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    margin-top: auto; margin-left: auto; width: 90%; left: 10%;\n"
                + "                }\n"
                + "                .mdl-grid{\n"
                + "\n"
                + "                }\n"
                + "                .adapGrafica{\n"
                + "                    width: 100%; left: 0%;\n"
                + "                }\n"
                + "                .adapTarjetaGrafica{\n"
                + "                    height: auto;\n"
                + "                    overflow: hidden;\n"
                + "                }\n"
                + "                .titGrafica{\n"
                + "                    font-size: 22px;\n"
                + "                }\n"
                + "                .subGrafica{\n"
                + "                    font-size: 33px; \n"
                + "                }\n"
                + "                .titHorario{\n"
                + "                    font-size: 20px\n"
                + "                }\n"
                + "                .titOtro{\n"
                + "                    font-size: 20px;\n"
                + "                }\n"
                + "                .subOtro{\n"
                + "                    font-size: 15px;\n"
                + "                }\n"
                + ".titulos{font-size: 37px;}"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "            }\n"
                + "            @media screen and (max-width: 839px){\n"
                + "                .adapGrafica{\n"
                + "                    width: 90%; left: 5%;\n"
                + "                }\n"
                + "                .adapTarjetaGrafica{\n"
                + "                    height: auto;\n"
                + "                    overflow: hidden;\n"
                + "                }\n"
                + "                .titGrafica{\n"
                + "                    font-size: 28px;\n"
                + "                }\n"
                + "                .subGrafica{\n"
                + "                    font-size: 40px; \n"
                + "                }\n"
                + "                .tarjetaPequena{\n"
                + "                    height: auto;\n"
                + "                    overflow: hidden;\n"
                + "                }\n"
                + "                .tarjetas{\n"
                + "                    box-shadow: none;\n"
                + "                    border-radius: initial;\n"
                + "                    transform: none;\n"
                + "                    \n"
                + "                }\n"
                + "                .tarjetas:hover{\n"
                + "                    box-shadow: none;\n"
                + "                }\n"
                + "                .iconos{\n"
                + "                    border-radius: initial;\n"
                + "                }\n"
                + "            }\n"
                + "\n"
                + "            @media screen and (max-width: 1024px){\n"
                + "                .titulob{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                .tituloBoldb{\n"
                + "                    font-size: 0px;\n"
                + "                    position: absolute;\n"
                + "                    float: right;\n"
                + "                }\n"
                + "                #cuenta, #salir{\n"
                + "                    display: block;\n"
                + "                }\n"
                + "                .notificacion{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "                .editor{\n"
                + "\n"
                + "                }\n"
                + "                .notificacionEditor{\n"
                + "                    padding-left: 50px;\n"
                + "                    padding-right: 50px;\n"
                + "                }\n"
                + "\n"
                + "                body {\n"
                + "                    font-size: calc(0.75em + 1vmin);\n"
                + "                }\n"
                + "                .titGrafica{\n"
                + "                    font-size: 28px;\n"
                + "                }\n"
                + "                .subGrafica{\n"
                + "                    font-size: 50px; \n"
                + "                }\n"
                + "\n"
                + "\n"
                + "            }"
                + "        </style>\n"
                + "\n"
                + "\n"
                + "        <script>\n"
                + "            window.onload = function () {\n"
                + "                var barrita = document.getElementById('barrita');\n"
                + "                barrita.style.visibility = 'hidden';\n"
                + "                barrita.style.opacity = '0';\n"
                + "            }\n"
                + "        </script>\n"
                + "\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div id=\"barrita\">\n"
                + "            <div id=\"cargar\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"><br><center><span class=\"titulo\">Cargando...</span></center></div> \n"
                + "        </div>\n"
                + "        <!-- Always shows a header, even in smaller screens. -->\n"
                + "        <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n"
                + "            <header class=\"mdl-layout__header\" style=\"background-color: transparent;\">\n"
                + "                <div class=\"mdl-layout__header-row\" style=\"background: linear-gradient(to right, #0091EA, #00D4FF);\">\n"
                + "                    <!-- Title -->\n"
                + "                    <div id=\"tarjeta\">&nbsp;Estadísticas&nbsp;</div><div class=\"centrado\"><span class=\"titulob\">&nbsp;Poli<span class=\"tituloBoldb\">Asistencia</span></span></div>\n"
                + "                    <!-- Add spacer, to align navigation to the right -->\n"
                + "                    <div class=\"mdl-layout-spacer\"></div>\n"
                + "\n"
                + "                    <!-- Navigation. We hide it in small screens. -->\n"
                + "                    <nav class=\"mdl-navigation mdl-layout--large-screen-only\">\n"
                + "                        <button id=\"demo-menu-lower-right\"\n"
                + "                                class=\"persona\">\n"
                + "                            "+_nombre+"\n"
                + "                        </button>\n"
                + "                        <ul class=\"mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect\"\n"
                + "                            for=\"demo-menu-lower-right\">\n"
                + "                            <a href=\"../configuracion\"><li class=\"mdl-menu__item\">Configuración de la cuenta</li></a>\n"
                + "                            <a href=\"../cerrarSesion\"><li class=\"mdl-menu__item\">Cerrar Sesión</li></a>\n"
                + "                        </ul>\n"
                + "                    </nav>\n"
                + "                </div>\n"
                + "            </header>\n"
                + "            <div class=\"mdl-layout__drawer\">\n"
                + "                <span class=\"titulo\">&nbsp;Poli<span class=\"tituloBold\">Asistencia</span></span>\n"
                + "                <nav class=\"mdl-navigation\">\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../inicio\"><i class=\"material-icons md-36 md-dark\">home</i> Inicio</a>\n"
                + "                    <a class=\"mdl-navigation__link seleccionado\" href=\"../estadisticas\"><i class=\"material-icons md-36 md-light\">insert_chart</i> Estadisticas</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../notificaciones\"><i class=\"material-icons md-36 md-dark\">list</i> Notificaciones</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../configuracion\"><i class=\"material-icons md-36 md-dark\">settings</i> Configuración</a>\n"
                + "                    <a class=\"mdl-navigation__link disponible\" href=\"../cerrarSesion\"><i class=\"material-icons md-36 md-dark\">exit_to_app</i> Cerrar Sesión</a>\n"
                + "\n"
                + "                </nav>\n"
                + "            </div>\n"
                + "            <main class=\"mdl-layout__content\" style=\"background-color: whitesmoke;\">\n"
                + "                <div class=\"mdl-grid center-items\">\n"
                + "                    <span style=\"color: #0091EA;\" class=\"titulos\">Turno Matutino</span>\n"
                + "                    <div class=\"mdl-cell mdl-cell--10-col\">\n"
                + "                        <div class=\"tarjetas\" style=\"\">\n"
                + "                            <div class=\"mdl-grid center-items\">\n"
                + "                                <div class=\"mdl-cell mdl-cell--12-col\">\n"
                + "                                    <div class=\"tarjetas\" style=\"box-shadow: 0 1px 2px rgba(0,0,0,0), 0 1px 2px rgba(0,0,0,0);\">\n"
                + "\n"
                + "\n"
                + "                                        <div class=\"descripcion\" style=\"width: 100%\">\n"
                + "\n"
                + "                                            <canvas id=\"grafica\" class=\"grafica\"></canvas>\n"
                + "                                        </div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    \n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\">\n"
                + "                        <div class=\"tarjetas\" style=\"overflow: auto;\">\n"
                + "                            <div class=\"descripcion graf\" style=\"\">\n"
                + "                                <canvas id=\"dia\" class=\"grafica\"></canvas>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\">\n"
                + "                        <div class=\"tarjetas tamanoMes\" style=\"\">\n"
                + "                            <div class=\"descripcion ajusta\" style=\"\">\n"
                + "                                <div style=\"background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 178, 255))\" class=\"tituloMes\"><br>Hoy</div>\n"
                + "                                <div style=\"\" class=\"ajustarTabla\">\n"
                + "                                    " + htmlAsistenciaDia + " "
                + "                                </div>\n"
                + "\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + ""
                + htmlInformacionMes
                + ""
                + "\n"
                + "                </div>\n"
                + "\n"
                + "            </main>\n"
                + "        </div>\n"
                + "        <script>\n"
                //===========================================Grafica general===============================================================================
                + scriptGeneralMes
                //=========================================================================================================================================
                //Grafica diaria
                + "\n"
                + "            //noviembre\n"
                + "            var ctx = document.getElementById('dia').getContext('2d');\n"
                + "            var chart = new Chart(ctx, {\n"
                + "                // The type of chart we want to create\n"
                + "                type: 'bar',\n"
                + "                data: {\n"
                + "                    labels: [\"Asistidos\", \"No Asistidos\"],\n"
                + "                    datasets: [\n"
                + "                        {\n"
                + "                            label: \"Alumnos\",\n"
                + "                            backgroundColor: [\"rgba(0, 176, 204, 0.2)\", \"rgba(255, 0, 0, 0.2)\"],\n"
                + "                            borderColor: [\"rgb(0, 176, 204)\", \"rgb(255, 0, 0)\"],\n"
                + "                            borderWidth: 3,\n"
                + "                            data: [" + asistidosxDia + ", " + faltadosxDia + ", 0, " + totalAlumnosxDia + "]\n"
                + "                        }\n"
                + "                    ]\n"
                + "                },\n"
                + "                options: {\n"
                + "                }\n"
                + "            });\n"
                + "            \n"
                //================================Grafica mes===============================================================================================
                + scriptInformacionMes
                //===========================================================================================================================================
                + "        </script>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return _asistenciaMatutino;
    }

    

    private static java.util.List<java.lang.Object> asistenciaTurnoPorDiaMas(java.lang.String turno) {
        serviciosWebGestion.Gestion_Service service = new serviciosWebGestion.Gestion_Service();
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.asistenciaTurnoPorDiaMas(turno);
    }

    private static java.util.List<java.lang.Object> asistenciaTurnoPorDia(int turno, int mes, int dia) {
        serviciosWebGestion.Gestion_Service service = new serviciosWebGestion.Gestion_Service();
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.asistenciaTurnoPorDia(turno, mes, dia);
    }

    private static java.util.List<java.lang.Object> asistenciaTurnoMes(int mes, int turno) {
        serviciosWebGestion.Gestion_Service service = new serviciosWebGestion.Gestion_Service();
        serviciosWebGestion.Gestion port = service.getGestionPort();
        return port.asistenciaTurnoMes(mes, turno);
    }

    
}
