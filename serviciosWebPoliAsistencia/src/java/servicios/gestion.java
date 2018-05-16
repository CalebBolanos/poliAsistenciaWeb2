/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Caleb
 */
@WebService(serviceName = "gestion")
public class gestion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "grupos")
    public String grupos() {
        base.obtenerGrupos info = new base.obtenerGrupos();
        return info.obtenerHtml();
    }
    
    @WebMethod(operationName = "alumnos")
    public String alumnos() {
        base.obtenerAlumnos info = new base.obtenerAlumnos();
        return info.obtenerHtml();
    }
    
    @WebMethod(operationName = "asistenciaTurnoPorDia")
    public ArrayList asistenciaTurnoPorDia(@WebParam(name = "turno") int turno, @WebParam(name = "mes") int mes, @WebParam(name = "dia") int dia){
        base.asistenciaTurnoPorDia asistencia = new base.asistenciaTurnoPorDia(turno, mes, dia);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerAsistido());
        datos.add(asistencia.obtenerFaltado());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaTurnoPorDiaMas")
    public ArrayList asistenciaTurnoPorDiaMas(@WebParam(name = "turno") String turno){
        base.asistenciaTurnoPorDia asistencia = new base.asistenciaTurnoPorDia(turno);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.obtenerAlumnosAsistidos());
        datos.add(asistencia.obtenerAlumnosFaltados());
        //datos.add(asistencia.obtenerTotalAlumnos());
        datos.add(asistencia.obtenerTotalAlumnosGrafica());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaTurnoMes")
    public ArrayList asistenciaTurnoMes(@WebParam(name = "mes") int mes, @WebParam(name = "turno") int turno) {
        base.asistenciaTurnoMes asistencia = new base.asistenciaTurnoMes(mes, turno);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.promedioAsistido());
        datos.add(asistencia.pormedioFaltado());
        datos.add(asistencia.totalDias());
        datos.add(asistencia.grafTotalDias());
        return datos;
    }
    
    @WebMethod(operationName = "datosGrupoEspecifico")
    public ArrayList datosGrupoEspecifico(@WebParam(name = "grupo") String grupo){
        base.obtenerGrupoEspecifico group = new base.obtenerGrupoEspecifico(grupo);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(group.obtenerUnidad());
        datos.add(group.obtenerGrupo());
        datos.add(group.obtenerSemestre());
        datos.add(group.obtenerTurno());
        datos.add(group.obtenerEspecialidad());
        datos.add(group.obtenerCantidadAlumnos());
        datos.add(group.valido());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaGrupoDia")
    public ArrayList asistenciaGrupoDia(@WebParam(name = "grupo") String grupo) {
        base.asistenciaGrupoDia asistencia = new base.asistenciaGrupoDia(grupo);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.obtenerAlumnosAsistidos());
        datos.add(asistencia.obtenerAlumnosFaltados());
        //datos.add(asistencia.obtenerTotalAlumnos());
        datos.add(asistencia.obtenerTotalAlumnosGrafica());
        return datos;
    }
    
    @WebMethod(operationName = "asistenciaGrupoMes")
    public ArrayList asistenciaGrupoMes(@WebParam(name = "mes") int mes, @WebParam(name = "grupo") String grupo) {
        base.asistenciaGrupoMes asistencia = new base.asistenciaGrupoMes(mes, grupo);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(asistencia.obtenerHtml());
        datos.add(asistencia.promedioAsistido());
        datos.add(asistencia.pormedioFaltado());
        datos.add(asistencia.totalDias());
        datos.add(asistencia.grafTotalDias());
        return datos;
    }
    
    @WebMethod(operationName = "obtenerNotificaciones")
    public String obtenerNotificaciones(@WebParam(name = "tipoNotificacion") int tipoNotificacion) {
        base.obtenerNotificaciones consulta = new base.obtenerNotificaciones(tipoNotificacion);
        return consulta.obtenerHtml();
    }
    
    @WebMethod(operationName = "guardarNotificaciones")
    public boolean guardarNotificaciones(@WebParam(name = "tipoNotificacion") int tipoNotificacion, @WebParam(name = "idPersona") int idPersona, @WebParam(name = "titulo") String titulo, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "url") String url, @WebParam(name = "urlImg") String urlImg) {
        boolean valido;
        base.guardarNotificacion guardar = new base.guardarNotificacion();
        valido = guardar.guardarNotificacion(tipoNotificacion, idPersona, titulo, descripcion, url, urlImg);
        return valido;
    }
    
    @WebMethod(operationName = "guardarNotificacionesAndroid")
    public String guardarNotificacionesAndroid(@WebParam(name = "jeisonString") String jeisonString) {
        String valido="";
        try {
            JSONParser parser = new JSONParser();
            JSONObject info = (JSONObject) parser.parse(jeisonString);
            String  boleta, titulo, descripcion, url;
            boleta = (String) info.get("numero"); 
            cDatos cd = new cDatos();
            cd.conectar();
            String idPer="0";
            int idPersona = 0;
            ResultSet rs  = cd.consulta("call spTraerIdPer('" + boleta + "');");
            while(rs.next()){
                idPersona = rs.getInt("idPp");
            }
            titulo = (String) info.get("titulo");
            descripcion = (String) info.get("descripcion");
            url = (String) info.get("url");
            if(guardarNotificaciones(1, idPersona, titulo, descripcion, url, ""))
                valido = "OK";
            
        } catch (ParseException ex) {
            Logger.getLogger(gestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(gestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valido;
    }
    
    @WebMethod(operationName = "borrarNotificaciones")
    public boolean borrarNotificaciones(@WebParam(name = "idNotificacion") int idNotificacion) {
        boolean valido;
        base.borrarNotificacion borrar = new base.borrarNotificacion();
        valido = borrar.borrarNotificacion(idNotificacion);
        return valido;
    }
    
    @WebMethod(operationName = "obtenerNotificacionEspecifica")
    public ArrayList obtenerNotificacionEspecifica(@WebParam(name = "id") int id) {
        base.obtenerNotificacionEspecifica notificacion = new base.obtenerNotificacionEspecifica(id);
        ArrayList<Object> datos = new ArrayList<>();
        datos.add(notificacion.obteneIdNoti());
        datos.add(notificacion.obtenerIdTipoN());
        datos.add(notificacion.obtenerTitulo());
        datos.add(notificacion.obtenerInfo());
        datos.add(notificacion.obtenerUrl());
        datos.add(notificacion.obtenerImg());
        return datos;
    }
}
