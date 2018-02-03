/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Caleb
 */
public class generadorHtml {

    public String htmlInformacionMes(int mes, String totalClases, String promedioAsistido, String promedioFaltado, String htmlMes) {
        String mesString;
        switch (mes+1) {
            case 1:
                mesString = "Enero";
                break;
            case 2:
                mesString = "Febrero";
                break;
            case 3:
                mesString = "Marzo";
                break;
            case 4:
                mesString = "Abril";
                break;
            case 5:
                mesString = "Mayo";
                break;
            case 6:
                mesString = "Junio";
                break;
            case 7:
                mesString = "Julio";
                break;
            case 8:
                mesString = "Agosto";
                break;
            case 9:
                mesString = "Septiembre";
                break;
            case 10:
                mesString = "Octubre";
                break;
            case 11:
                mesString = "Noviembre";
                break;
            case 12:
                mesString = "Diciembre";
                break;
            default:
                mesString = "Mes invalido";
                break;
        }
        String informacion = "<div class=\"mdl-cell mdl-cell--6-col\">\n"//empieza
                + "                        <div class=\"tarjetas\" style=\"overflow: auto;\">\n"
                + "                            <div class=\"descripcion graf\" style=\"\">\n"
                + "                                <canvas id=\"" + mes + "\" class=\"grafica\"></canvas>\n"
                + "                                <div style=\"background-color: white; width: 100%; padding: 3px; font-size: 12px;\">Clases impartidas: " + totalClases + " Promedio de Alumos que asitieron: " + promedioAsistido + " Promedio de Alumos que faltaron: " + promedioFaltado + "</div>\n"
                + "                            </div>\n"
                + "                            \n"
                + "                        </div>\n"
                + "                        \n"
                + "                    </div>\n"
                + "                    <div class=\"mdl-cell mdl-cell--6-col\">\n"
                + "                        <div class=\"tarjetas tamanoMes\" style=\"\">\n"
                + "                            <div class=\"descripcion ajusta\" style=\"\">\n"
                + "                                <div style=\"background: linear-gradient(to right, rgb(0, 145, 234), rgb(0, 178, 255))\" class=\"tituloMes\"><br>" + mesString + "</div>\n"
                + "                                \n"
                + "                                <div style=\"\" class=\"ajustarTabla\">\n"
                + "                                    " + htmlMes + " "
                + "                                </div>\n"
                + "\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n";//termina
        return informacion;
    }

    public String scriptInformacionMes(int mes, String promedioAsistido, String promedioFaltado, String totalGrafica) {
        String script = ""
                + "            var ctx = document.getElementById('" + mes + "').getContext('2d');\n"
                + "            var chart = new Chart(ctx, {\n"
                + "                // The type of chart we want to create\n"
                + "                type: 'bar',\n"
                + "                data: {\n"
                + "                    labels: [\"Asistidos\", \"No Asistidos\"],\n"
                + "                    datasets: [\n"
                + "                        {\n"
                + "                            label: \"Alumnos\",\n"
                + "                            backgroundColor: [\"rgba(0, 229, 10, 0.2)\", \"rgba(255, 0, 0, 0.2)\"],\n"
                + "                            borderColor: [\"rgb(0, 229, 10)\", \"rgb(255, 0, 0)\"],\n"
                + "                            borderWidth: 3,\n"
                + "                            data: [" + promedioAsistido + ", " + promedioFaltado + ", 0, " + totalGrafica + "]\n"
                + "                        }\n"
                + "                    ]\n"
                + "                },\n"
                + "                options: {\n"
                + "                }\n"
                + "            });\n";
        return script;
    }
}
