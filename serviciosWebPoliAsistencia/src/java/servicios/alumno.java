/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.cDatos;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
}
