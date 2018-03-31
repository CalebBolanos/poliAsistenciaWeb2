
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
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

    private final static QName _BaseMail_QNAME = new QName("http://servicios/", "baseMail");
    private final static QName _Confirma_QNAME = new QName("http://servicios/", "confirma");
    private final static QName _MandaMAil_QNAME = new QName("http://servicios/", "mandaMAil");
    private final static QName _MandaMAils_QNAME = new QName("http://servicios/", "mandaMAils");
    private final static QName _ValidaCuentaResponse_QNAME = new QName("http://servicios/", "validaCuentaResponse");
    private final static QName _ConfirmaResponse_QNAME = new QName("http://servicios/", "confirmaResponse");
    private final static QName _MandaMAilsResponse_QNAME = new QName("http://servicios/", "mandaMAilsResponse");
    private final static QName _RecuperaContraResponse_QNAME = new QName("http://servicios/", "recuperaContraResponse");
    private final static QName _BaseMailResponse_QNAME = new QName("http://servicios/", "baseMailResponse");
    private final static QName _RecuperaContra_QNAME = new QName("http://servicios/", "recuperaContra");
    private final static QName _Cambia_QNAME = new QName("http://servicios/", "cambia");
    private final static QName _ValidaCuenta_QNAME = new QName("http://servicios/", "validaCuenta");
    private final static QName _CambiaResponse_QNAME = new QName("http://servicios/", "cambiaResponse");
    private final static QName _MandaMAilResponse_QNAME = new QName("http://servicios/", "mandaMAilResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MandaMAils }
     * 
     */
    public MandaMAils createMandaMAils() {
        return new MandaMAils();
    }

    /**
     * Create an instance of {@link ValidaCuentaResponse }
     * 
     */
    public ValidaCuentaResponse createValidaCuentaResponse() {
        return new ValidaCuentaResponse();
    }

    /**
     * Create an instance of {@link ConfirmaResponse }
     * 
     */
    public ConfirmaResponse createConfirmaResponse() {
        return new ConfirmaResponse();
    }

    /**
     * Create an instance of {@link MandaMAilsResponse }
     * 
     */
    public MandaMAilsResponse createMandaMAilsResponse() {
        return new MandaMAilsResponse();
    }

    /**
     * Create an instance of {@link RecuperaContraResponse }
     * 
     */
    public RecuperaContraResponse createRecuperaContraResponse() {
        return new RecuperaContraResponse();
    }

    /**
     * Create an instance of {@link BaseMail }
     * 
     */
    public BaseMail createBaseMail() {
        return new BaseMail();
    }

    /**
     * Create an instance of {@link Confirma }
     * 
     */
    public Confirma createConfirma() {
        return new Confirma();
    }

    /**
     * Create an instance of {@link MandaMAil }
     * 
     */
    public MandaMAil createMandaMAil() {
        return new MandaMAil();
    }

    /**
     * Create an instance of {@link Cambia }
     * 
     */
    public Cambia createCambia() {
        return new Cambia();
    }

    /**
     * Create an instance of {@link ValidaCuenta }
     * 
     */
    public ValidaCuenta createValidaCuenta() {
        return new ValidaCuenta();
    }

    /**
     * Create an instance of {@link CambiaResponse }
     * 
     */
    public CambiaResponse createCambiaResponse() {
        return new CambiaResponse();
    }

    /**
     * Create an instance of {@link MandaMAilResponse }
     * 
     */
    public MandaMAilResponse createMandaMAilResponse() {
        return new MandaMAilResponse();
    }

    /**
     * Create an instance of {@link BaseMailResponse }
     * 
     */
    public BaseMailResponse createBaseMailResponse() {
        return new BaseMailResponse();
    }

    /**
     * Create an instance of {@link RecuperaContra }
     * 
     */
    public RecuperaContra createRecuperaContra() {
        return new RecuperaContra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "baseMail")
    public JAXBElement<BaseMail> createBaseMail(BaseMail value) {
        return new JAXBElement<BaseMail>(_BaseMail_QNAME, BaseMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Confirma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "confirma")
    public JAXBElement<Confirma> createConfirma(Confirma value) {
        return new JAXBElement<Confirma>(_Confirma_QNAME, Confirma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAil")
    public JAXBElement<MandaMAil> createMandaMAil(MandaMAil value) {
        return new JAXBElement<MandaMAil>(_MandaMAil_QNAME, MandaMAil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAils }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAils")
    public JAXBElement<MandaMAils> createMandaMAils(MandaMAils value) {
        return new JAXBElement<MandaMAils>(_MandaMAils_QNAME, MandaMAils.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validaCuentaResponse")
    public JAXBElement<ValidaCuentaResponse> createValidaCuentaResponse(ValidaCuentaResponse value) {
        return new JAXBElement<ValidaCuentaResponse>(_ValidaCuentaResponse_QNAME, ValidaCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "confirmaResponse")
    public JAXBElement<ConfirmaResponse> createConfirmaResponse(ConfirmaResponse value) {
        return new JAXBElement<ConfirmaResponse>(_ConfirmaResponse_QNAME, ConfirmaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAilsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAilsResponse")
    public JAXBElement<MandaMAilsResponse> createMandaMAilsResponse(MandaMAilsResponse value) {
        return new JAXBElement<MandaMAilsResponse>(_MandaMAilsResponse_QNAME, MandaMAilsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaContraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "recuperaContraResponse")
    public JAXBElement<RecuperaContraResponse> createRecuperaContraResponse(RecuperaContraResponse value) {
        return new JAXBElement<RecuperaContraResponse>(_RecuperaContraResponse_QNAME, RecuperaContraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "baseMailResponse")
    public JAXBElement<BaseMailResponse> createBaseMailResponse(BaseMailResponse value) {
        return new JAXBElement<BaseMailResponse>(_BaseMailResponse_QNAME, BaseMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaContra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "recuperaContra")
    public JAXBElement<RecuperaContra> createRecuperaContra(RecuperaContra value) {
        return new JAXBElement<RecuperaContra>(_RecuperaContra_QNAME, RecuperaContra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cambia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "cambia")
    public JAXBElement<Cambia> createCambia(Cambia value) {
        return new JAXBElement<Cambia>(_Cambia_QNAME, Cambia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validaCuenta")
    public JAXBElement<ValidaCuenta> createValidaCuenta(ValidaCuenta value) {
        return new JAXBElement<ValidaCuenta>(_ValidaCuenta_QNAME, ValidaCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "cambiaResponse")
    public JAXBElement<CambiaResponse> createCambiaResponse(CambiaResponse value) {
        return new JAXBElement<CambiaResponse>(_CambiaResponse_QNAME, CambiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAilResponse")
    public JAXBElement<MandaMAilResponse> createMandaMAilResponse(MandaMAilResponse value) {
        return new JAXBElement<MandaMAilResponse>(_MandaMAilResponse_QNAME, MandaMAilResponse.class, null, value);
    }

}
