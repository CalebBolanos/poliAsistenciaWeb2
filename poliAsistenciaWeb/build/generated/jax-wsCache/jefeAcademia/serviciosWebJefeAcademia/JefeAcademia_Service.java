
package serviciosWebJefeAcademia;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "jefeAcademia", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/serviciosWebPoliAsistencia/jefeAcademia?wsdl")
public class JefeAcademia_Service
    extends Service
{

    private final static URL JEFEACADEMIA_WSDL_LOCATION;
    private final static WebServiceException JEFEACADEMIA_EXCEPTION;
    private final static QName JEFEACADEMIA_QNAME = new QName("http://servicios/", "jefeAcademia");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serviciosWebPoliAsistencia/jefeAcademia?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JEFEACADEMIA_WSDL_LOCATION = url;
        JEFEACADEMIA_EXCEPTION = e;
    }

    public JefeAcademia_Service() {
        super(__getWsdlLocation(), JEFEACADEMIA_QNAME);
    }

    public JefeAcademia_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), JEFEACADEMIA_QNAME, features);
    }

    public JefeAcademia_Service(URL wsdlLocation) {
        super(wsdlLocation, JEFEACADEMIA_QNAME);
    }

    public JefeAcademia_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JEFEACADEMIA_QNAME, features);
    }

    public JefeAcademia_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JefeAcademia_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JefeAcademia
     */
    @WebEndpoint(name = "jefeAcademiaPort")
    public JefeAcademia getJefeAcademiaPort() {
        return super.getPort(new QName("http://servicios/", "jefeAcademiaPort"), JefeAcademia.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JefeAcademia
     */
    @WebEndpoint(name = "jefeAcademiaPort")
    public JefeAcademia getJefeAcademiaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "jefeAcademiaPort"), JefeAcademia.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JEFEACADEMIA_EXCEPTION!= null) {
            throw JEFEACADEMIA_EXCEPTION;
        }
        return JEFEACADEMIA_WSDL_LOCATION;
    }

}
