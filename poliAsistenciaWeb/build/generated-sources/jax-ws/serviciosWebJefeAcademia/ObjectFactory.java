
package serviciosWebJefeAcademia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciosWebJefeAcademia package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosWebJefeAcademia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsistenciaIndResponse }
     * 
     */
    public AsistenciaIndResponse createAsistenciaIndResponse() {
        return new AsistenciaIndResponse();
    }

    /**
     * Create an instance of {@link AsistenciaInd }
     * 
     */
    public AsistenciaInd createAsistenciaInd() {
        return new AsistenciaInd();
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

}
