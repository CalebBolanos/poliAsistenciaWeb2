/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author Alexis
 */

import conexion.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "mails")
public class enviaMails {
    String _error = "";
    String _para = "";
    String _cuerpoMsj = "";
    String _de = "disoft10@gmail.com";
    String _titulo = "";
    
    public enviaMails()
    {
        
    }
    @WebMethod(operationName = "mandaMAils")
    public boolean mandaMAils(@WebParam(name = "Para")int tipo, @WebParam(name = "Titulo")String Titulo,@WebParam(name = "Msj") String Msj){
        boolean ret = false;
        if(tipo == 3){
            cDatos bd = new cDatos();
            try {
                bd.conectar();
                ResultSet rs = bd.consulta("select correo from personas where idTipo = 2");
                String correo;
                while(rs.next()){
                    correo = rs.getString("correo");
                    if(correo != null && !correo.equalsIgnoreCase("sinAsignar") && !correo.equalsIgnoreCase("sinasignar@gmail.com") 
                            && !correo.equalsIgnoreCase("alexis.ol.me@gmail.com") && !correo.equalsIgnoreCase("sinsignar")
                            && !correo.equalsIgnoreCase("sinAsiganr@gmail.com") && !correo.equalsIgnoreCase("")){
                        mandaMAil(correo, Titulo, baseMail(Msj, Titulo));
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(enviaMails.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return ret;
    }
    
    
    public boolean validaCuenta(String paraMail, String nombre,String _codigo){        
        String mensajibirips=
                "<center><div style=\"width:600px; height:600px; background-color:#F0F3F4;\" >"
                + " <div style=\"width:600px; height:130px; background-color:#3F3F3F;\">"
                + "     <li style=\"list-style:none; color:white; font-size:40px; font-family:arial; padding:45px; letter-spacing:10px;\">PRIMESOFT</li>"
                + " </div>"
                + " <div style=\"background-color:#F0F3F4; width:600px; height:470;\">"
                + "     <li style=\"font-size:30px; font-family:arial; color:#3F3F3F; list-style:none; padding-top:50px;\">Hola "+nombre +"!</li>"
                + "     <li style=\"font-size:20px; font-family:arial; color:#3F3F3F; list-style:none; padding-top:30px;\">Estas a un paso de poder utilizar Examinator-X </li>			<li style=\"font-size:20px; font-family:arial; list-style:none; padding-top:30px;\">Para activar tu cuenda introduce el codigo<br/><br/><span style=\" color:#000; text-decoration:underline;\">"+_codigo+"</span><br/><br/> en la pagina que lo solicita </li>"
         
                + " </div>"
                + "</div></center>";
        
        
        
        return mandaMAil(paraMail, "Confirmar e-mail Examinator-X", mensajibirips);
    }
    
    public boolean recuperaContra(String paraMail, String nombre,String clave){
        
        String nomClav=(nombre+clave);
        
        String mensajibirips=
                "<center><div style=\"width:600px; height:600px; background-color:#F0F3F4;\" >"
                + " <div style=\"width:600px; height:130px; background-color:#3F3F3F;\">"
                + "     <li style=\"list-style:none; color:white; font-size:40px; font-family:arial; padding:45px; letter-spacing:10px;\">PRIMESOFT</li>"
                + " </div>"
                + " <div style=\"background-color:#F0F3F4; width:600px; height:470;\">"
                + "     <li style=\"font-size:30px; font-family:arial; color:#3F3F3F; list-style:none; padding-top:50px;\">Hola"+nombre +"!</li>"
                + "     <li style=\"font-size:20px; font-family:arial; color:#3F3F3F; list-style:none; padding-top:30px;\">Solicitaste un cambio de contraseña</li>			<li style=\"font-size:20px; font-family:arial; color:#3F3F3F; list-style:none; padding-top:30px;\">Para continuar da click en el siguiente enlace</li>"
                + "	<a href=\"http://localhost:8080/Examiteitor-x_primeSoft/confirma.jsp?ndupcm="+nomClav+"\" style=\"text-decoration:none; \"><li style=\"font-size:30px; font-family:arial; color:#D35400; list-style:none; padding-top:150px; letter-spacing:5px; border-radius: 5px;border: solid #D35400 5px;\">ACTIVAR</li></a>"
                + " </div>"
                + "</div></center>";
        
        
        
        return mandaMAil(paraMail, "Confirmar e-mail Examinator-X", mensajibirips);
    }
    public boolean mandaMAil(String Para, String Titulo, String Msj)
    {
        boolean envio = false;
        this._titulo = Titulo;
        this._para  = Para;
        this._cuerpoMsj = Msj;
        
        try
        {
            
            // Configuracion de la cuenta de envio de mail
            Properties confMail = new Properties();
            confMail.setProperty("mail.smtp.host", "smtp.gmail.com");
            confMail.setProperty("mail.smtp.starttls.enable", "true");
            confMail.setProperty("mail.smtp.port", "587");
            confMail.setProperty("mail.smtp.user", "mail@gmail.com");
            confMail.setProperty("mail.smtp.auth", "true");
            // Sesion
            Session session = Session.getDefaultInstance(confMail);
            // Creamos el MAil
            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(this._de));
            correo.addRecipient(Message.RecipientType.TO, new InternetAddress(this._para));
            correo.setSubject(this._titulo);
            correo.setContent(this._cuerpoMsj,"text/html");

            // Enviamos MAil .
            Transport t = session.getTransport("smtp");
            t.connect("disoft10@gmail.com", "programacion");
            t.sendMessage(correo, correo.getAllRecipients());

            // Cerramos conexion.
            t.close();
            envio = true;
        }
        catch (Exception e)
        {
            
            this._error = e.getMessage();
        }
        return envio;
        
        
        
    }
    
    public String confirma(String _correo){
        return"<div class=\"Contenido\">\n" +
"	<li class=\"subt\">¡Enhorabuena bienvenido a Examinator-X!</li>\n" +
"	<li class=\"instruc\">Hemos enviado un e-mail de confirmación a: "+_correo+"</li>\n" +
                "<li class=\"instruc\">Introduce la clave proporcionada en e-mail </li>\n" +
                "<li class=\"instruc\" id=\"error\" style=\"display:none;\" >Ups! codigo incorrecto</li>\n" +
"	<form method=\"post\">\n" +
"		<center><input type=\"text\" name=\"clave\" class=\"Inpt\" placeholder=\"# # # # # # # # # # # #\"></center>\n" +
                "<center><input type=\"submit\" name=\"btn\" class=\"Inpt\" value=\"Aceptar\"></center>\n" +
"	</form>\n" +
"		<br> " +
"	  <center><a class=\"first after \" href=\"#\" onclick=\"location.reload();\" class=\"first after\" name=\"btn\">Volver a enviar el correo</a></center>\n" +
"	</div>";
    }
    
    public String cambia(){
        return"<div class=\"Contenido\">\n" +
"	<li class=\"subt\">Cambiar contraseña Examinator-X</li>\n" +
"	<li class=\"instruc\">Te hemos enviado un e-mail de autenticación a tu correo </li>\n" +
                "<li class=\"instruc\">Introduce la clave proporcionada en e-mail </li>\n" +
                "<li class=\"instruc\" id=\"error\" style=\"display:none;\">Ups! codigo incorrecto</li>\n" +
"	<form method=\"post\">\n" +
"		<center><input type=\"text\" name=\"clave\" class=\"Inpt\" placeholder=\"# # # # # # # # # # # #\"></center>\n" +
                "<center><input type=\"submit\" name=\"btn\" class=\"Inpt\" value=\"Aceptar\"></center>\n" +
"	</form>\n" +
"		<br> " +
"	  <center><a class=\"first after \" href=\"#\" onclick=\"location.reload();\" class=\"first after\" name=\"btn\">Volver a enviar el correo</a></center>\n" +
"	</div>";
    }
    
    public String baseMail(String msj,String titulo){
        return "<center>\n" +
"	<div style=\"background: linear-gradient(to bottom, #D5DBF1, #FFFFFF); width: 600px; height: 600px; font-family: Arial; \">\n" +
"		<div style=\"background: linear-gradient(to right, #0091EA, #00D4FF); color: white; padding: 20px;\">\n" +
"			<span style=\"font-size: 50px\">Poli</span><span style=\"font-size: 60px\">Asistencia</span>\n" +
"	    </div>\n" +
"	    <br/>\n" +
"	    <div style=\"text-align: left; margin-left: 17px;\">\n" +
"	    	<b><span style=\"font-size: 30px; color: #0091EA; align-items: left;\">"+titulo +"</span></b>\n" +
"	    	<br><br>\n" +
"	    	<div style=\"font-size: 20px;\">"+msj+"</div>\n" +
"	    </div>\n" +
"    </div>\n" +
"</center>";
    }
}
