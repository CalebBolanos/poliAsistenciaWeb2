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

/**
 *
 * @author Caleb
 */
@WebService(serviceName = "profesor")
public class profesor {

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
    
    @WebMethod(operationName = "unidades")
    public String unidades(@WebParam(name = "idPer") int idPer) {
        consultaProfesor.unidadesAprendizaje persona = new consultaProfesor.unidadesAprendizaje(idPer);
        String html = persona.obtenerHtml();
        return html;
    }
    
    @WebMethod(operationName = "informacionUnidad")
    public ArrayList informacionUnidad(@WebParam(name = "grupo") String grupo, @WebParam(name = "idUnidad") String idUnidad) {
        consultaProfesor.infoUnidades unidad = new consultaProfesor.infoUnidades(grupo, idUnidad);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(unidad.obtenerUnidad());
        datos.add(unidad.obtenerGrupo());
        datos.add(unidad.obtenerSemestre());
        datos.add(unidad.obtenerTurno());
        datos.add(unidad.obtenerEspecialidad());
        datos.add(unidad.obtenerCantidadAlumnos());
        datos.add(unidad.valido());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaUnidadDia")
    public ArrayList asistenciaUnidadDia(@WebParam(name = "idUnidad") String idUnidad) {
        consultaProfesor.asistenciaUnidadPorDia asistencia = new consultaProfesor.asistenciaUnidadPorDia(idUnidad);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.obtenerAlumnosAsistidos());
        datos.add(asistencia.obtenerAlumnosFaltados());
        //datos.add(asistencia.obtenerTotalAlumnos());
        datos.add(asistencia.obtenerTotalAlumnosGrafica());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaUnidasMes")
    public ArrayList asistenciaUnidadMes(@WebParam(name = "idUnidad") int idUnidad, @WebParam(name = "mes") int mes) {
        consultaProfesor.asistenciaUnidadPorMes asistencia = new consultaProfesor.asistenciaUnidadPorMes(idUnidad, mes);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.promedioAsistido());
        datos.add(asistencia.pormedioFaltado());
        datos.add(asistencia.totalDias());
        datos.add(asistencia.grafTotalDias());
        return datos;
    }
    
    @WebMethod(operationName = "horarioProfesor")
    public String[][] horarioProfesor(@WebParam(name = "idPer") String idPer){
        String[][] ret = new String[15][5];
        cDatos bd = new cDatos();
        try{
            bd.conectar();
            ResultSet rs = bd.consulta("call spHorarioProfesor('" + idPer + "');");
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
    
    @WebMethod(operationName = "obtenerHorarioDiaProfesor")
    public String obtenerHorarioDiaProfesor(@WebParam(name = "numero") String numero, @WebParam(name = "diaSemana") int diaSemana) {
        consultaProfesor.obtenerHorarioDia horario = new consultaProfesor.obtenerHorarioDia(numero, diaSemana);
        String html = horario.obtenerHtml();
        return html;
    }
    
    @WebMethod(operationName = "obtenerHorarioDiaProfesorAndroid")
    public String obtenerHorarioDiaProfesorAndroid(@WebParam(name = "numero") String numero) {
        Calendar calendario = new GregorianCalendar();
        consultaProfesor.obtenerHorarioDia horario = new consultaProfesor.obtenerHorarioDia(numero, calendario.get(Calendar.DAY_OF_WEEK)-1);
        String json = horario.obtenerHtml();
        return json;
    }
}
