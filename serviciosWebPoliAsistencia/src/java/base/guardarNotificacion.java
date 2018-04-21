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
public class guardarNotificacion {
    private boolean  guardado = false;
    public boolean guardarNotificacion(/*String idPersona,*/ int tipoNotificacion, String titulo, String descripcion, String url, String urlImg){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spGuardaNotificacion("/*+idPersona,+*/+tipoNotificacion+",'"+titulo+"','"+descripcion+"','"+url+"','"+urlImg+"');;");
            if(resultado.next()){
                guardado = resultado.getString("msj").equals("ok");
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
