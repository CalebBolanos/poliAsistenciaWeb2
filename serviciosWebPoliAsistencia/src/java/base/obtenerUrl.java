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
public class obtenerUrl {
    private String _link = "";
    public String obtenerUrl(int idPer){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spTraeImg("+idPer+");");
            if(resultado.next()){
                _link= resultado.getString("img");
            }
            else{
                _link= "imagenes/default.png";
            }
        }
        catch(Exception error){
            
        }
        return _link;
    }
}
