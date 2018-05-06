/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Caleb
 */
@WebService(serviceName = "usuario")
public class usuario {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "validarUsuario")
    public ArrayList validarUsuario(@WebParam(name = "numero") String numero, @WebParam(name = "contrasena") String contrasena) {
        ArrayList<Object> datos = new ArrayList<>();
        base.inicioSesion persona = new base.inicioSesion(numero, contrasena);
        if (persona.valido()) {
            datos.add(persona.obtenerIdPersona());
            datos.add(persona.obteneridTipo());
        } else {

        }
        return datos;

    }
    
    @WebMethod(operationName = "validarUsuarioAndroid")
    public String validarUsuarioAndroid(@WebParam(name = "numero") String numero) {
        String mensaje = "";
        String usr = "";
        String psw = "";
        String nombre = "";
        String paterno = "";
        String materno = "";
        String genero = "";
        String num = "";
        String nacimiento = "";       
        String urlImagen = "";
        
        int idPersona = 0;
        int idTipo = 0;
        
        try{
            JSONParser parser = new JSONParser();
            JSONObject info = (JSONObject) parser.parse(numero);
            usr = (String)info.get("usuario");
            psw = (String)info.get("contrasena");
        }
        catch(Exception error){
            return "error";
        }
        base.inicioSesion persona = new base.inicioSesion(usr, psw);
        if(persona.valido()){
            idPersona = Integer.parseInt(persona.obtenerIdPersona());
            idTipo = Integer.parseInt(persona.obteneridTipo());
            base.obtenerUrl url = new base.obtenerUrl();
            urlImagen = url.obtenerUrl(idPersona);
            
            switch(idTipo){
                case 1://gestion
                    return "gestion";
                case 2://alumno
                    base.obtenerDatosAlumno alumno = new base.obtenerDatosAlumno(usr, "Pol");
                    if(alumno.valido()){
                        nombre = alumno.obtenerNombre();
                        paterno = alumno.obtenerPaterno();
                        materno = alumno.obtenerMaterno();
                        genero = alumno.obtenerGenero();
                        num = alumno.obtenerBoleta();
                        nacimiento = alumno.obtenerNacimiento();
                        JSONObject datos = persona.obtenerJSON(nombre, paterno, materno, genero, num, nacimiento, urlImagen);
                        mensaje = datos.toString();
                    }
                    else{
                        mensaje = "incorrecto";
                    }
                    break;
                case 3://profesor
                    base.obtenerDatosProfesor profesor = new base.obtenerDatosProfesor(usr, "Pol");
                    if(profesor.valido()){
                        nombre = profesor.obtenerNombre();
                        paterno = profesor.obtenerPaterno();
                        materno = profesor.obtenerMaterno();
                        genero = profesor.obtenerGenero();
                        num = profesor.obtenerNumeroTrabajador();
                        nacimiento = profesor.obtenerNacimiento();
                        JSONObject datos = persona.obtenerJSON(nombre, paterno, materno, genero, num, nacimiento, urlImagen);
                        mensaje = datos.toString();
                    }
                    else{
                        mensaje = "incorrecto";
                    }
                    break;
                case 4://jefe
                    base.obtenerDatosJefeAcademia jefe = new base.obtenerDatosJefeAcademia(usr, "Pol");
                    if(jefe.valido()){
                        nombre = jefe.obtenerNombre();
                        paterno = jefe.obtenerPaterno();
                        materno = jefe.obtenerMaterno();
                        genero = jefe.obtenerGenero();
                        num = jefe.obtenerNumeroTrabajador();
                        nacimiento = jefe.obtenerNacimiento();
                        JSONObject datos = persona.obtenerJSON(nombre, paterno, materno, genero, num, nacimiento, urlImagen);
                        mensaje = datos.toString();
                    }
                    else{
                        mensaje = "incorrecto";
                    }
                    break;
                case 6://prefecto
                    mensaje = "incorrecto";
                    break;
                default:
                    mensaje = "incorrecto";
                    break;
            }
            
            
        }
        else{
            return "incorrecto";
        }
        return mensaje;
    }

    @WebMethod(operationName = "datosAlumno")
    public ArrayList datosAlumno(@WebParam(name = "boleta") String boleta, @WebParam(name = "llave") String llave) {
        ArrayList<Object> datos = new ArrayList<>();
        base.obtenerDatosAlumno alumno = new base.obtenerDatosAlumno(boleta, llave);
        if (alumno.valido()) {
            datos.add(alumno.obtenerNombre());
            datos.add(alumno.obtenerPaterno());
            datos.add(alumno.obtenerMaterno());
            datos.add(alumno.obtenerGenero());
            datos.add(alumno.obtenerBoleta());
            datos.add(alumno.obtenerNacimiento());
        } else {

        }
        return datos;
    }

    @WebMethod(operationName = "datosProfesor")
    public ArrayList datosProfesor(@WebParam(name = "numero") String numero, @WebParam(name = "llave") String llave) {
        ArrayList<Object> datos = new ArrayList<>();
        base.obtenerDatosProfesor profesor = new base.obtenerDatosProfesor(numero, llave);
        if (profesor.valido()) {
            datos.add(profesor.obtenerNombre());
            datos.add(profesor.obtenerPaterno());
            datos.add(profesor.obtenerMaterno());
            datos.add(profesor.obtenerGenero());
            datos.add(profesor.obtenerNumeroTrabajador());
            datos.add(profesor.obtenerNacimiento());
        } else {

        }
        return datos;
    }

    @WebMethod(operationName = "datosJefeAcademia")
    public ArrayList datosJefeAcademia(@WebParam(name = "numero") String numero, @WebParam(name = "llave") String llave) {
        ArrayList<Object> datos = new ArrayList<>();
        base.obtenerDatosProfesor profesor = new base.obtenerDatosProfesor(numero, llave);
        if (profesor.valido()) {
            datos.add(profesor.obtenerNombre());
            datos.add(profesor.obtenerPaterno());
            datos.add(profesor.obtenerMaterno());
            datos.add(profesor.obtenerGenero());
            datos.add(profesor.obtenerNumeroTrabajador());
            datos.add(profesor.obtenerNacimiento());
        } else {

        }
        return datos;
    }

    @WebMethod(operationName = "datosGestion")
    public ArrayList datosGestion(@WebParam(name = "numero") String numero, @WebParam(name = "llave") String llave) {
        ArrayList<Object> datos = new ArrayList<>();
        base.obtenerDatosGestion gestion = new base.obtenerDatosGestion(numero, llave);
        if (gestion.valido()) {
            datos.add(gestion.obtenerNombre());
            datos.add(gestion.obtenerPaterno());
            datos.add(gestion.obtenerMaterno());
            datos.add(gestion.obtenerGenero());
            datos.add(gestion.obtenerNumeroTrabajador());
            datos.add(gestion.obtenerNacimiento());
        } else {

        }
        return datos;
    }

    @WebMethod(operationName = "cambioContrasena")
    public String cambioContrasena(@WebParam(name = "idTipo") int idTipo, @WebParam(name = "boleta") String boleta, @WebParam(name = "antigua") String antigua, @WebParam(name = "nueva") String nueva) {
        String mensaje = "";
        base.cambiarContrasena cambio = new base.cambiarContrasena(idTipo, boleta, antigua, nueva);
        if (cambio.valido()) {
            mensaje = cambio.obtenerMensaje();
        } else {
            if (!cambio.valido()) {
                mensaje = cambio.obtenerMensaje();
            }

        }
        return mensaje;
    }
    
    @WebMethod(operationName = "cambioContrasenaAndroid")
    public String cambioContrasenaAndroid(@WebParam(name = "datos") String datos){
        int idTipo;
        String boleta, antigua, nueva;
        try{
            JSONParser parser = new JSONParser();
            JSONObject info = (JSONObject) parser.parse(datos);
            idTipo = Integer.parseInt((String)info.get("idTipo"));
            boleta = (String)info.get("boleta");
            antigua = (String)info.get("antigua");
            nueva = (String)info.get("nueva");
        } catch (ParseException ex) {
            ex.printStackTrace();
            return "error";
        }
        String mensaje = cambioContrasena(idTipo, boleta, antigua, nueva);
        return mensaje;
    }
    
    @WebMethod(operationName = "traerUrl")
    public String traerUrl(@WebParam(name = "idPer") int idPer) {
        String mensaje;
        base.obtenerUrl url = new base.obtenerUrl();
        mensaje = url.obtenerUrl(idPer);
        return mensaje;
    }
    
    @WebMethod(operationName = "guardarUrl")
    public boolean guardarUrl(@WebParam(name = "idPer") int idPer, @WebParam(name = "url") String url) {
        boolean valido;
        base.guardarUrl guardar = new base.guardarUrl();
        valido = guardar.guardarUrl(idPer, url);
        return valido;
    }
    
    @WebMethod(operationName = "traerCorreo")
    public String traerCorreo(@WebParam(name = "idPer") int idPer) {
        String correo = "";
        base.obtenerCorreo mail = new base.obtenerCorreo(idPer);
        if(mail.existe()){
            correo = mail.correo();
        }
        return correo;
    }
    
    @WebMethod(operationName = "guardarCorreo")
    public boolean guardarCorreo(@WebParam(name = "idPer") int idPer, @WebParam(name = "correo") String correo) {
        boolean valido;
        base.guardarCorreo guardar = new base.guardarCorreo();
        valido = guardar.guardarCorreo(idPer, correo);
        return valido;
    }
    
    
}
