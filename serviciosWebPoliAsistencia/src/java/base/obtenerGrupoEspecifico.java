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
public class obtenerGrupoEspecifico {
    private String _unidad = "", _grupo = "", _semestre = "", _turno = "", _especialidad = "", _noAlumnos = "";
    private boolean _valido;
    public obtenerGrupoEspecifico(String grupo){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spDatosgrupoEspecifico('"+grupo+"');");
            if(resultado.next()){
                _unidad = resultado.getString("idUnidad");
                _grupo = resultado.getString("grupo");
                _semestre = resultado.getString("semestre");
                _turno = resultado.getString("Truno");
                if(_turno.equals("1")){
                    _turno = "Matutino";
                }
                else{
                    _turno = "Vespertino";
                }
                _especialidad = resultado.getString("especialidad");
                _noAlumnos = resultado.getString("inscritos");
                _valido = true;
            }
        }
        catch(Exception error){
            _valido = false;
        }
    }
    
    public String obtenerUnidad(){
        return _unidad;
    }
    
    public String obtenerGrupo(){
        return _grupo;
    }
    
    public String obtenerSemestre(){
        return _semestre;
    }
    
    public String obtenerTurno(){
        return _turno;
    }
    
    public String obtenerEspecialidad(){
        return _especialidad;
    }
    
    public String obtenerCantidadAlumnos(){
        return _noAlumnos;
    }
    
    public boolean valido(){
        return _valido;
    }
}
