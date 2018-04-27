
package serviciosWeb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "usuario", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Usuario {


    /**
     * 
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarUsuarioAndroid", targetNamespace = "http://servicios/", className = "serviciosWeb.ValidarUsuarioAndroid")
    @ResponseWrapper(localName = "validarUsuarioAndroidResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.ValidarUsuarioAndroidResponse")
    @Action(input = "http://servicios/usuario/validarUsuarioAndroidRequest", output = "http://servicios/usuario/validarUsuarioAndroidResponse")
    public String validarUsuarioAndroid(
        @WebParam(name = "numero", targetNamespace = "")
        String numero);

    /**
     * 
     * @param numero
     * @param llave
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosJefeAcademia", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosJefeAcademia")
    @ResponseWrapper(localName = "datosJefeAcademiaResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosJefeAcademiaResponse")
    @Action(input = "http://servicios/usuario/datosJefeAcademiaRequest", output = "http://servicios/usuario/datosJefeAcademiaResponse")
    public List<Object> datosJefeAcademia(
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "llave", targetNamespace = "")
        String llave);

    /**
     * 
     * @param antigua
     * @param idTipo
     * @param boleta
     * @param nueva
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cambioContrasena", targetNamespace = "http://servicios/", className = "serviciosWeb.CambioContrasena")
    @ResponseWrapper(localName = "cambioContrasenaResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.CambioContrasenaResponse")
    @Action(input = "http://servicios/usuario/cambioContrasenaRequest", output = "http://servicios/usuario/cambioContrasenaResponse")
    public String cambioContrasena(
        @WebParam(name = "idTipo", targetNamespace = "")
        int idTipo,
        @WebParam(name = "boleta", targetNamespace = "")
        String boleta,
        @WebParam(name = "antigua", targetNamespace = "")
        String antigua,
        @WebParam(name = "nueva", targetNamespace = "")
        String nueva);

    /**
     * 
     * @param llave
     * @param boleta
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosAlumno", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosAlumno")
    @ResponseWrapper(localName = "datosAlumnoResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosAlumnoResponse")
    @Action(input = "http://servicios/usuario/datosAlumnoRequest", output = "http://servicios/usuario/datosAlumnoResponse")
    public List<Object> datosAlumno(
        @WebParam(name = "boleta", targetNamespace = "")
        String boleta,
        @WebParam(name = "llave", targetNamespace = "")
        String llave);

    /**
     * 
     * @param numero
     * @param contrasena
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarUsuario", targetNamespace = "http://servicios/", className = "serviciosWeb.ValidarUsuario")
    @ResponseWrapper(localName = "validarUsuarioResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.ValidarUsuarioResponse")
    @Action(input = "http://servicios/usuario/validarUsuarioRequest", output = "http://servicios/usuario/validarUsuarioResponse")
    public List<Object> validarUsuario(
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param numero
     * @param llave
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosProfesor", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosProfesor")
    @ResponseWrapper(localName = "datosProfesorResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosProfesorResponse")
    @Action(input = "http://servicios/usuario/datosProfesorRequest", output = "http://servicios/usuario/datosProfesorResponse")
    public List<Object> datosProfesor(
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "llave", targetNamespace = "")
        String llave);

    /**
     * 
     * @param idPer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "traerUrl", targetNamespace = "http://servicios/", className = "serviciosWeb.TraerUrl")
    @ResponseWrapper(localName = "traerUrlResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.TraerUrlResponse")
    @Action(input = "http://servicios/usuario/traerUrlRequest", output = "http://servicios/usuario/traerUrlResponse")
    public String traerUrl(
        @WebParam(name = "idPer", targetNamespace = "")
        int idPer);

    /**
     * 
     * @param numero
     * @param llave
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosGestion", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosGestion")
    @ResponseWrapper(localName = "datosGestionResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.DatosGestionResponse")
    @Action(input = "http://servicios/usuario/datosGestionRequest", output = "http://servicios/usuario/datosGestionResponse")
    public List<Object> datosGestion(
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "llave", targetNamespace = "")
        String llave);

    /**
     * 
     * @param idPer
     * @param correo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarCorreo", targetNamespace = "http://servicios/", className = "serviciosWeb.GuardarCorreo")
    @ResponseWrapper(localName = "guardarCorreoResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.GuardarCorreoResponse")
    @Action(input = "http://servicios/usuario/guardarCorreoRequest", output = "http://servicios/usuario/guardarCorreoResponse")
    public boolean guardarCorreo(
        @WebParam(name = "idPer", targetNamespace = "")
        int idPer,
        @WebParam(name = "correo", targetNamespace = "")
        String correo);

    /**
     * 
     * @param idPer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "traerCorreo", targetNamespace = "http://servicios/", className = "serviciosWeb.TraerCorreo")
    @ResponseWrapper(localName = "traerCorreoResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.TraerCorreoResponse")
    @Action(input = "http://servicios/usuario/traerCorreoRequest", output = "http://servicios/usuario/traerCorreoResponse")
    public String traerCorreo(
        @WebParam(name = "idPer", targetNamespace = "")
        int idPer);

    /**
     * 
     * @param idPer
     * @param url
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarUrl", targetNamespace = "http://servicios/", className = "serviciosWeb.GuardarUrl")
    @ResponseWrapper(localName = "guardarUrlResponse", targetNamespace = "http://servicios/", className = "serviciosWeb.GuardarUrlResponse")
    @Action(input = "http://servicios/usuario/guardarUrlRequest", output = "http://servicios/usuario/guardarUrlResponse")
    public boolean guardarUrl(
        @WebParam(name = "idPer", targetNamespace = "")
        int idPer,
        @WebParam(name = "url", targetNamespace = "")
        String url);

}
