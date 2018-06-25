/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author caleb
 */
public class guardarFotos {
    String direccionArchivo = "";
    boolean guardado = false;
    String direccionFinal = "";
    public guardarFotos(String imagenString, int servidor, String idPer, String idTipo, String nombre){
        switch (servidor){
            case 1:
                direccionArchivo = conexion.imagenes.PERFIL_CALEB;
                break;
            case 2:
                direccionArchivo = conexion.imagenes.PERFIL_CALEB_MAC;
                break;
            case 3:
                direccionArchivo = conexion.imagenes.PERFIL_ALEXIS;
                break;
            case 4:
                direccionArchivo = conexion.imagenes.PERFIL_OBED;
                break;
        }
        
        try{
            byte[] imagenBytes = DatatypeConverter.parseBase64Binary(imagenString);
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imagenBytes));
            direccionFinal = direccionArchivo+"/"+ idPer +"_"+ idTipo +""+ nombre +".jpg";
            File archivoFoto = new File(direccionFinal);
            ImageIO.write(image, "jpg", archivoFoto);
            guardado = true;
        }
        catch(Exception e){
            guardado = false;
        }
        
    }
    
    public boolean seGuardo(){
        return guardado;
    }
    
    public String obtenerDireccionFinal(){
        return direccionFinal;
    }
}
