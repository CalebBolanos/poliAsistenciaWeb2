/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.cDatos;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Caleb
 */
@WebService(serviceName = "alumno")
public class alumno {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "asistenciaInd")
    public ArrayList asistenciaInd(@WebParam(name = "idPer") String idPer, @WebParam(name = "mes") String mes) {
        ArrayList<Object> datos = new ArrayList<>();
        consultaAlumno.asistenciaIndividual persona = new consultaAlumno.asistenciaIndividual(idPer, mes);
        datos.add(persona.obtenerInformacion());
        datos.add(persona.obtenerTotalDias());
        datos.add(persona.obtenerDiasAsistidos());
        datos.add(persona.obtenerDiasFaltados());
        datos.add(persona.obtenerMes());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaIndividualAndroid")
    public String asistenciaIndividualAndroid(@WebParam(name = "datos") String datos) {
        String idPer;
        String mes;
        try{
            JSONParser parser = new JSONParser();
            JSONObject info = (JSONObject) parser.parse(datos);
            idPer = (String)info.get("idPer");
            mes = (String)info.get("mes");
        }
        catch(Exception error){
            return "error";
        }
        consultaAlumno.asistenciaIndividual persona = new consultaAlumno.asistenciaIndividual(idPer, mes);
        JSONObject info = new JSONObject();
        info.put("asistido", ""+persona.obtenerDiasAsistidos());
        info.put("faltado", ""+persona.obtenerDiasFaltados());
        return info.toString();
    }
    
    @WebMethod(operationName = "infoAsistenciaIndividualAndroid")
    public String infoAsistenciaIndividualAndroid(@WebParam(name = "datos") String datos) {
        String idPer;
        String mes;
        try{
            JSONParser parser = new JSONParser();
            JSONObject info = (JSONObject) parser.parse(datos);
            idPer = (String)info.get("idPer");
            mes = (String)info.get("mes");
        }
        catch(Exception error){
            return "error";
        }
        consultaAlumno.asistenciaIndividual persona = new consultaAlumno.asistenciaIndividual(idPer, mes);
        return persona.obtenerInfoJSON();
    }
    
    @WebMethod(operationName = "graficaGeneralAndroid")
    public String graficaGeneralAndroid(@WebParam(name = "idPer") String idPer) {
        Calendar calendario = new GregorianCalendar();
        int mes = calendario.get(Calendar.MONTH);
        int totalDiasAsistidos = 0;
        
        JSONObject grafica = new JSONObject();
        
        if (mes > Calendar.JULY && mes < Calendar.DECEMBER + 1) {//Ciclo 1
            grafica.put("Ciclo", "1");
            for(int i= Calendar.AUGUST; i <= mes +1; i++){
                consultaAlumno.asistenciaIndividual persona = new consultaAlumno.asistenciaIndividual(idPer, ""+i);
                grafica.put("mes "+i, persona.obtenerDiasAsistidos());
                totalDiasAsistidos += persona.obtenerDiasAsistidos();
                persona = null;
            }
        }else{
            if (mes > Calendar.JANUARY - 1 && mes < Calendar.AUGUST) {//Ciclo 2
                grafica.put("Ciclo", "2");
                for(int i= Calendar.JANUARY+1; i<=mes + 1; i++){
                consultaAlumno.asistenciaIndividual persona = new consultaAlumno.asistenciaIndividual(idPer, ""+i);
                grafica.put("mes "+i, persona.obtenerDiasAsistidos());
                totalDiasAsistidos += persona.obtenerDiasAsistidos();
                persona = null;
            }
            }
        }
        grafica.put("mes actual", ""+(mes+1));
        grafica.put("total asistidos", totalDiasAsistidos);
        return grafica.toString();
    }
    
    @WebMethod(operationName = "horarioAlumno")
    public String[][] horarioAlumno(@WebParam(name = "idPer") String idPer){
        String[][] ret = new String[15][5];
        cDatos bd = new cDatos();
        try{
            bd.conectar();
            ResultSet rs = bd.consulta("call spHorarioAlumno('" + idPer + "');");
            int resta, dia, hora, hora2;
            String mate;
            while(rs.next()){
                dia = rs.getInt("idDia")-1;
                hora = rs.getInt("idHorarioI")-1;
                hora2 = rs.getInt("idHorarioF")-1;
                mate = rs.getString("materia");
                ret[hora][dia] = mate;
                resta = hora2-hora;
                if(resta>1){
                    for(int i = 1; i<resta; i++){
                        ret[hora2-i][dia] = mate;
                    }
                }
            }
            for(int i = 0; i<15; i++){
                for(int j = 0; j<5; j++){
                    if(ret[i][j]==null){
                        ret[i][j] = "";
                    }
                }
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return ret;
    }
    
    @WebMethod(operationName = "obtenerNotificaciones")
    public String obtenerNotificaciones(@WebParam(name = "tipoNotificacion") int tipoNotificacion) {
        consultaAlumno.obtenerNotificaciones consulta = new consultaAlumno.obtenerNotificaciones(tipoNotificacion);
        String html = consulta.obtenerHtml();
        return html;
    }
    
    @WebMethod(operationName = "obtenerHorarioDia")
    public String obtenerHorarioDia(@WebParam(name = "boleta") String boleta, @WebParam(name = "diaSemana") int diaSemana) {
        base.obtenerHorarioDia horario = new base.obtenerHorarioDia(boleta, diaSemana);
        String html = horario.obtenerHtml();
        return html;
    }
    
    @WebMethod(operationName = "obtenerHorarioDiaAndroid")
    public String obtenerHorarioDiaAndroid(@WebParam(name = "boleta") String boleta) {
        Calendar calendario = new GregorianCalendar();
        base.obtenerHorarioDia horario = new base.obtenerHorarioDia(boleta, calendario.get(Calendar.DAY_OF_WEEK)-1);
        String json = horario.obtenerJSON();
        return json;
    }
    
    @WebMethod(operationName = "horarioAndroidAlumno")
    public String horarioAndroidAlumno(@WebParam(name = "numero") String numero){
        String ret[][] = horarioAlumno(numero);
        JSONObject dia;
        JSONArray hora = new JSONArray();
        dia = new JSONObject();
        String Dias[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        for(int i = 0; i<ret.length; i++){
            for(int j = 0; j<ret[i].length; j++){
                dia.put(Dias[j], ret[i][j]);
            }
            hora.add(dia);
            dia = new JSONObject();
        }
        return hora.toString();
    }
    
    
}
