
package serviciosWebProfesor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciosWebProfesor package. 
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
    private final static QName _AsistenciaUnidadDia_QNAME = new QName("http://servicios/", "asistenciaUnidadDia");
    private final static QName _AsistenciaUnidadDiaResponse_QNAME = new QName("http://servicios/", "asistenciaUnidadDiaResponse");
    private final static QName _AsistenciaUnidasMes_QNAME = new QName("http://servicios/", "asistenciaUnidasMes");
    private final static QName _AsistenciaUnidasMesResponse_QNAME = new QName("http://servicios/", "asistenciaUnidasMesResponse");
    private final static QName _InformacionUnidad_QNAME = new QName("http://servicios/", "informacionUnidad");
    private final static QName _InformacionUnidadResponse_QNAME = new QName("http://servicios/", "informacionUnidadResponse");
    private final static QName _Unidades_QNAME = new QName("http://servicios/", "unidades");
    private final static QName _UnidadesResponse_QNAME = new QName("http://servicios/", "unidadesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosWebProfesor
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
     * Create an instance of {@link AsistenciaUnidadDia }
     * 
     */
    public AsistenciaUnidadDia createAsistenciaUnidadDia() {
        return new AsistenciaUnidadDia();
    }

    /**
     * Create an instance of {@link AsistenciaUnidadDiaResponse }
     * 
     */
    public AsistenciaUnidadDiaResponse createAsistenciaUnidadDiaResponse() {
        return new AsistenciaUnidadDiaResponse();
    }

    /**
     * Create an instance of {@link AsistenciaUnidasMes }
     * 
     */
    public AsistenciaUnidasMes createAsistenciaUnidasMes() {
        return new AsistenciaUnidasMes();
    }

    /**
     * Create an instance of {@link AsistenciaUnidasMesResponse }
     * 
     */
    public AsistenciaUnidasMesResponse createAsistenciaUnidasMesResponse() {
        return new AsistenciaUnidasMesResponse();
    }

    /**
     * Create an instance of {@link InformacionUnidad }
     * 
     */
    public InformacionUnidad createInformacionUnidad() {
        return new InformacionUnidad();
    }

    /**
     * Create an instance of {@link InformacionUnidadResponse }
     * 
     */
    public InformacionUnidadResponse createInformacionUnidadResponse() {
        return new InformacionUnidadResponse();
    }

    /**
     * Create an instance of {@link Unidades }
     * 
     */
    public Unidades createUnidades() {
        return new Unidades();
    }

    /**
     * Create an instance of {@link UnidadesResponse }
     * 
     */
    public UnidadesResponse createUnidadesResponse() {
        return new UnidadesResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaUnidadDia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaUnidadDia")
    public JAXBElement<AsistenciaUnidadDia> createAsistenciaUnidadDia(AsistenciaUnidadDia value) {
        return new JAXBElement<AsistenciaUnidadDia>(_AsistenciaUnidadDia_QNAME, AsistenciaUnidadDia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaUnidadDiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaUnidadDiaResponse")
    public JAXBElement<AsistenciaUnidadDiaResponse> createAsistenciaUnidadDiaResponse(AsistenciaUnidadDiaResponse value) {
        return new JAXBElement<AsistenciaUnidadDiaResponse>(_AsistenciaUnidadDiaResponse_QNAME, AsistenciaUnidadDiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaUnidasMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaUnidasMes")
    public JAXBElement<AsistenciaUnidasMes> createAsistenciaUnidasMes(AsistenciaUnidasMes value) {
        return new JAXBElement<AsistenciaUnidasMes>(_AsistenciaUnidasMes_QNAME, AsistenciaUnidasMes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaUnidasMesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaUnidasMesResponse")
    public JAXBElement<AsistenciaUnidasMesResponse> createAsistenciaUnidasMesResponse(AsistenciaUnidasMesResponse value) {
        return new JAXBElement<AsistenciaUnidasMesResponse>(_AsistenciaUnidasMesResponse_QNAME, AsistenciaUnidasMesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionUnidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "informacionUnidad")
    public JAXBElement<InformacionUnidad> createInformacionUnidad(InformacionUnidad value) {
        return new JAXBElement<InformacionUnidad>(_InformacionUnidad_QNAME, InformacionUnidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionUnidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "informacionUnidadResponse")
    public JAXBElement<InformacionUnidadResponse> createInformacionUnidadResponse(InformacionUnidadResponse value) {
        return new JAXBElement<InformacionUnidadResponse>(_InformacionUnidadResponse_QNAME, InformacionUnidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unidades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "unidades")
    public JAXBElement<Unidades> createUnidades(Unidades value) {
        return new JAXBElement<Unidades>(_Unidades_QNAME, Unidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "unidadesResponse")
    public JAXBElement<UnidadesResponse> createUnidadesResponse(UnidadesResponse value) {
        return new JAXBElement<UnidadesResponse>(_UnidadesResponse_QNAME, UnidadesResponse.class, null, value);
    }

}
