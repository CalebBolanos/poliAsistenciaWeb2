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
import com.sun.org.apache.xml.internal.security.utils.Base64;
import conexion.cDatos;
import conexion.cifrados;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    String raiz = "http://localhost:8080/poliAsistenciaWeb/";

    public enviaMails() {

    }

    @WebMethod(operationName = "mandaMAils")
    public boolean mandaMAils(@WebParam(name = "Para") int tipo, @WebParam(name = "Titulo") String Titulo, @WebParam(name = "Msj") String Msj) {
        boolean ret = false;
        if (tipo == 3) {
            cDatos bd = new cDatos();
            try {
                bd.conectar();
                ResultSet rs = bd.consulta("select correo from vwPersonasCorreo where idTipo = 2");
                String correo;
                while (rs.next()) {
                    correo = rs.getString("correo");
                    if (correo != null && !correo.equalsIgnoreCase("sinAsignar") && !correo.equalsIgnoreCase("sinasignar@gmail.com")
                            && !correo.equalsIgnoreCase("sinsignar")
                            && !correo.equalsIgnoreCase("sinAsiganr@gmail.com") && !correo.equalsIgnoreCase("")) {
                        mandaMAil(correo, Titulo, baseMail(Msj, Titulo));
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(enviaMails.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ret;
    }

    @WebMethod(operationName = "validarCodigo")
    public String validarCodigo(@WebParam(name = "codigo") String codigo) {
        String ret="Ocurrio un error, correo no validado", bolet="", corre="", mensa;
        try {
            cifrados descifra = new cifrados();
            mensa = descifra.Desencriptar(codigo);
            boolean cambia=true;
            char ch;
            for(int i=0; i<mensa.length(); i++){
                ch = mensa.charAt(i);
                if(ch == ' '){
                    cambia = false;
                } else {
                    if(cambia){
                        bolet += ch; 
                    } else {
                        corre+=ch;
                    }
                }
            }
            cDatos bd = new cDatos();
            bd.conectar();
            ResultSet rs = bd.consulta("call spValidaCorreo('" + bolet + "', '" + corre + "');");
            while(rs.next()){
                ret = rs.getNString("msj");
            }
        } catch (Exception ex) {
            Logger.getLogger(enviaMails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public boolean mandaMAil(String Para, String Titulo, String Msj) {
        boolean envio = false;
        this._titulo = Titulo;
        this._para = Para;
        this._cuerpoMsj = Msj;

        try {

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
            correo.setContent(this._cuerpoMsj, "text/html");

            // Enviamos MAil .
            Transport t = session.getTransport("smtp");
            t.connect("disoft10@gmail.com", "programacion");
            t.sendMessage(correo, correo.getAllRecipients());

            // Cerramos conexion.
            t.close();
            envio = true;
        } catch (Exception e) {

            this._error = e.getMessage();
        }
        return envio;

    }

    public String baseMail(String msj, String titulo) {
        return "<center>\n"
                + "	<div style=\"background: linear-gradient(to bottom, #D5DBF1, #FFFFFF); width: 600px; height: 600px; font-family: Arial; \">\n"
                + "		<div style=\"background: linear-gradient(to right, #0091EA, #00D4FF); color: white; padding: 20px;\">\n"
                + "			<span style=\"font-size: 50px\">Poli</span><span style=\"font-size: 60px\">Asistencia</span>\n"
                + "	    </div>\n"
                + "	    <br/>\n"
                + "	    <div style=\"text-align: left; margin-left: 17px;\">\n"
                + "	    	<b><span style=\"font-size: 30px; color: #0091EA; align-items: left;\">" + titulo + "</span></b>\n"
                + "	    	<br><br>\n"
                + "	    	<div style=\"font-size: 20px;\">" + msj + "</div>\n"
                + "	    </div>\n"
                + "    </div>\n"
                + "</center>";
    }
    
    public void recuperarContra(String boleta){
        
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        hourdateFormat.format(date);
    }
    
    @WebMethod(operationName = "validarCuenta")
    public void validarCuenta(@WebParam(name = "boleta") int boleta, @WebParam(name = "correo") String correo){
        try {
            cifrados cifra = new cifrados();
            String codigo = cifra.Encriptar(boleta+" " + correo);
            String mensaj = "Es necesario realices la confirmación de la cuenta de Correo Electrónico"
                    + " que proporcionaste al registrarte en Poliasistencia dando clic en la siguiente enlace: "
                    + "<br><b><span style=\"font-size: 25px; color: #0091EA; align-items: left;\">"
                    + raiz + "confirmarCorreo?codigo="+codigo + "</span></b>\n";
             mandaMAil(correo, "Validar correo", mensaj);
        } catch (Exception ex) {
            Logger.getLogger(enviaMails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
