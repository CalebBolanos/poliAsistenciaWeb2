/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
