
package serviciosWebAlumno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciosWebAlumno package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AsistenciaInd_QNAME = new QName("http://servicios/", "asistenciaInd");
    private final static QName _AsistenciaIndResponse_QNAME = new QName("http://servicios/", "asistenciaIndResponse");
    private final static QName _HorarioAlumno_QNAME = new QName("http://servicios/", "horarioAlumno");
    private final static QName _HorarioAlumnoResponse_QNAME = new QName("http://servicios/", "horarioAlumnoResponse");
    private final static QName _ObtenerNotificaciones_QNAME = new QName("http://servicios/", "obtenerNotificaciones");
    private final static QName _ObtenerNotificacionesResponse_QNAME = new QName("http://servicios/", "obtenerNotificacionesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosWebAlumno
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsistenciaInd }
     * 
     */
    public AsistenciaInd createAsistenciaInd() {
        return new AsistenciaInd();
    }

    /**
     * Create an instance of {@link AsistenciaIndResponse }
     * 
     */
    public AsistenciaIndResponse createAsistenciaIndResponse() {
        return new AsistenciaIndResponse();
    }

    /**
     * Create an instance of {@link HorarioAlumno }
     * 
     */
    public HorarioAlumno createHorarioAlumno() {
        return new HorarioAlumno();
    }

    /**
     * Create an instance of {@link HorarioAlumnoResponse }
     * 
     */
    public HorarioAlumnoResponse createHorarioAlumnoResponse() {
        return new HorarioAlumnoResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificaciones }
     * 
     */
    public ObtenerNotificaciones createObtenerNotificaciones() {
        return new ObtenerNotificaciones();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionesResponse }
     * 
     */
    public ObtenerNotificacionesResponse createObtenerNotificacionesResponse() {
        return new ObtenerNotificacionesResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaInd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaInd")
    public JAXBElement<AsistenciaInd> createAsistenciaInd(AsistenciaInd value) {
        return new JAXBElement<AsistenciaInd>(_AsistenciaInd_QNAME, AsistenciaInd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaIndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaIndResponse")
    public JAXBElement<AsistenciaIndResponse> createAsistenciaIndResponse(AsistenciaIndResponse value) {
        return new JAXBElement<AsistenciaIndResponse>(_AsistenciaIndResponse_QNAME, AsistenciaIndResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorarioAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "horarioAlumno")
    public JAXBElement<HorarioAlumno> createHorarioAlumno(HorarioAlumno value) {
        return new JAXBElement<HorarioAlumno>(_HorarioAlumno_QNAME, HorarioAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorarioAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "horarioAlumnoResponse")
    public JAXBElement<HorarioAlumnoResponse> createHorarioAlumnoResponse(HorarioAlumnoResponse value) {
        return new JAXBElement<HorarioAlumnoResponse>(_HorarioAlumnoResponse_QNAME, HorarioAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerNotificaciones")
    public JAXBElement<ObtenerNotificaciones> createObtenerNotificaciones(ObtenerNotificaciones value) {
        return new JAXBElement<ObtenerNotificaciones>(_ObtenerNotificaciones_QNAME, ObtenerNotificaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerNotificacionesResponse")
    public JAXBElement<ObtenerNotificacionesResponse> createObtenerNotificacionesResponse(ObtenerNotificacionesResponse value) {
        return new JAXBElement<ObtenerNotificacionesResponse>(_ObtenerNotificacionesResponse_QNAME, ObtenerNotificacionesResponse.class, null, value);
    }

}
