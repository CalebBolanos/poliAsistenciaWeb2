/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;
import org.json.simple.JSONObject;

/**
 *
 * @author Caleb
 */
public class inicioSesion {
    private String _idPersona;
    private String _idTipo;
    private boolean _valido;
    
    public inicioSesion(String usuario, String contrasena){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spValidaUsr('"+usuario+"', '"+contrasena+"');");
            if(resultado.next()){
                if(resultado.getString("msj").equals("ok")){
                    _idPersona = resultado.getString("idP");
                    _idTipo = resultado.getString("idT");
                    _valido = true;
                }
                else{
                    if(resultado.getString("msj").equals("usuario o psw incorrecto")){
                        _idPersona = resultado.getString("idP");
                        _idTipo = resultado.getString("idT");
                        _valido = false;
                    }
                }
            }
            base.cierraConexion();
        }
        catch(Exception error){
            _valido = false;
        }
    }
    
    public JSONObject obtenerJSON(){        
        JSONObject resultado = new JSONObject();
        resultado.put("idPersona", _idPersona);
        resultado.put("idTipo", _idTipo);
        return resultado;
    }
    
    public String obtenerIdPersona(){
        return _idPersona;
    }
    
    public String obteneridTipo(){
        return _idTipo;
    }
    
    public boolean valido(){
        return _valido;
    }
}
