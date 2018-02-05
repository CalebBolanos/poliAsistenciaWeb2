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
public class obtenerNotificacionEspecifica {
    private String titulo = "", info = "", url = "", img = "";
    private int idNoti = 0, idTipoN = 0;
    
    public obtenerNotificacionEspecifica(int id){
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spTraeNoti("+id+");");
            if(resultado.next()){
                titulo = resultado.getString("titulo");
                info = resultado.getString("info");
                url = resultado.getString("url");
                img = resultado.getString("img");
                idNoti = resultado.getInt("idNoti");
                idTipoN = resultado.getInt("idTipoN");
            }
            base.cierraConexion();
        }
        catch(Exception error){
            
        }
    }
    
    public String obtenerTitulo(){
        return titulo;
    }
    
    public String obtenerInfo(){
        return info;
    }
    
    public String obtenerUrl(){
        return url;
    }
    
    public String obtenerImg(){
        return img;
    }
    
    public int obteneIdNoti(){
        return idNoti;
    }
    
    public int obtenerIdTipoN(){
        return idTipoN;
    }
    
    
}
