/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author caleb
 */
public class guardarFotosNotificaciones {
    String direccionArchivo = "";
    boolean guardado = false;
    String direccionFinal = "";
    String direccionBase = "";
    public guardarFotosNotificaciones(String imagenString, int servidor, String titulo){
        switch (servidor){
            case 1:
                direccionArchivo = conexion.imagenes.NOTIFICACIONES_CALEB;
                break;
            case 2:
                direccionArchivo = conexion.imagenes.NOTIFICACIONES_CALEB_MAC;
                break;
            case 3:
                direccionArchivo = conexion.imagenes.NOTIFICACIONES_ALEXIS;
                break;
            case 4:
                direccionArchivo = conexion.imagenes.NOTIFICACIONES_OBED;
                break;
        }
        
        try{
            byte[] imagenBytes = DatatypeConverter.parseBase64Binary(imagenString);
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imagenBytes));
            String hora = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            direccionFinal = direccionArchivo+"/"+ titulo +"_"+ hora +".jpg";
            File archivoFoto = new File(direccionFinal);
            ImageIO.write(image, "jpg", archivoFoto);
            guardado = true;
            direccionBase = "imagenes/notificaciones/alumno/"+ titulo +"_"+ hora +".jpg";
        }
        catch(Exception e){
            guardado = false;
        }
        
    }
    
    public boolean seGuardo(){
        return guardado;
    }
    
    public String obtenerDireccionBase(){
        return direccionBase;
    }
}
