/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import conexion.cDatos;
import conexion.imagenes;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Caleb
 */
public class guardarUrl {
    private boolean  guardado = false;
    public boolean guardarUrl(int idPer, String url){
        String msj = "";
        conexion.cDatos base = new conexion.cDatos();
        try{
            base.conectar();
            ResultSet resultado = base.consulta("call spGuardaImg("+idPer+", '"+url+"');");
            if(resultado.next()){
                msj = resultado.getString("msj");
                guardado = resultado.getString("msj").equals("ok");
            }
            else{
                guardado = false;
            }
        }
        catch(Exception error){
            msj = error.getMessage();
            guardado = false;
        }
        return guardado;
    }
    
    public String guardaImagenAnd(String boleta, byte[] imgByte, String nombreArchivo){
        String ret="Ocurrio un error";
        try {
            cDatos cd = new cDatos();
            cd.conectar();
            String idPer="0";
            
            ResultSet rs  = cd.consulta("call spTraerIdPer('" + boleta + "');");
            while(rs.next()){
                idPer = rs.getInt("idPp")+"";
            }
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(imgByte));
            imagenes imgServ = new imagenes();
            String direccion = imgServ.getServidor();
            File carpeta = new File(direccion);
            carpeta.mkdirs();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(img, "PNG", os);
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            File archivo = File.createTempFile(boleta + "fotoPerfil" + nombreArchivo, ".PNG", carpeta);
            try (InputStream input = is) {
                Files.copy(input, archivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception error) {
            }
            String urlbase = "imagenes/perfil/" + archivo.getName();
            if(guardarUrl(Integer.parseInt(idPer), urlbase))
                ret="Se subio correctamente";
        } catch (SQLException ex) {
            Logger.getLogger(guardarUrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(guardarUrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
}
