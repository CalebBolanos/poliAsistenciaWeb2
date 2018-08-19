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
public class guardarCorreo {
    private boolean  guardado = false;
    public boolean guardarCorreo(int idPer, String correo){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spGuardaCorreo("+idPer+",'"+correo+"');");
            if(resultado.next()){
                     guardado = resultado.getString("msj").equals("Correo actualizado");            
            }
            else{
                guardado = false;
            }
        }
        catch(Exception error){
            guardado = false;
        }
        return guardado;
    }
}
