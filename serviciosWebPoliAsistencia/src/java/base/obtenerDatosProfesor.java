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
public class obtenerDatosProfesor {
    private String _nombre;
    private String _paterno;
    private String _materno;
    private String _genero;
    private String _numero;
    private String _nacimiento;
    private boolean _valido;
    
    
    public  obtenerDatosProfesor(String numero, String llave){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spTraerDatosProf('"+numero+"', '"+llave+"');");
            if(resultado.next()){
                if(resultado.getString("existe").equals("1")){
                    _nombre = resultado.getString("nom");
                    _paterno = resultado.getString("pat");
                    _materno = resultado.getString("mat");
                    _genero = resultado.getString("gen");
                    _numero = resultado.getString("bol");
                    _nacimiento = resultado.getString("fec");
                    _valido = true;
                }
                else{
                    if(resultado.getString("msj").equals("usuario o psw incorrecto")){
                        _nombre = resultado.getString("nom");
                        _paterno = resultado.getString("pat");
                        _materno = resultado.getString("mat");
                        _genero = resultado.getString("gen");
                        _numero = resultado.getString("bol");
                        _nacimiento = resultado.getString("fec");
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
    
    public String obtenerNombre(){
        return _nombre;
    }
    
    public String obtenerPaterno(){
        return _paterno;
    }
    
    public String obtenerMaterno(){
        return _materno;
    }
    
    public String obtenerGenero(){
        return _genero;
    }
    
    public String obtenerNumeroTrabajador(){
        return _numero;
    }
    
    public String obtenerNacimiento(){
        return _nacimiento;
    }
    
    public boolean valido(){
        return _valido;
    }
}
