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
public class obtenerCorreo {
    private String _correo = "";
    private boolean _existe;
    public obtenerCorreo(int idPer){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spTraeMail("+idPer+");");
            if(resultado.next()){
                _existe = resultado.getString("existe").equals("1");
                if(_existe){
                    _correo= resultado.getString("msj");
                }
                else{
                    _correo= "";
                }
                
            }
            else{
                _correo= "";
            }
        }
        catch(Exception error){
            _correo= "";
        }
    }
    
    public boolean existe(){
        return _existe;
    }
    
    public String correo(){
        return _correo;
    }
}
