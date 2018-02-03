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
public class borrarNotificacion {
    private boolean  borrado = false;
    public boolean borrarNotificacion(int idNotificacion){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spBorraNotificacion("+idNotificacion+");");
            if(resultado.next()){
                borrado = resultado.getString("msj").equals("ok");
            }
            else{
                borrado = false;
            }
        }
        catch(Exception error){
            borrado = false;
        }
        return borrado;
    }
    
    
}
