/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
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
}
