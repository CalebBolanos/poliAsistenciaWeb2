
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

    private final static QName _Exception_QNAME = new QName("http://servicios/", "Exception");
    private final static QName _BaseMail_QNAME = new QName("http://servicios/", "baseMail");
    private final static QName _BaseMailResponse_QNAME = new QName("http://servicios/", "baseMailResponse");
    private final static QName _Cifra_QNAME = new QName("http://servicios/", "cifra");
    private final static QName _CifraResponse_QNAME = new QName("http://servicios/", "cifraResponse");
    private final static QName _Descifra_QNAME = new QName("http://servicios/", "descifra");
    private final static QName _DescifraResponse_QNAME = new QName("http://servicios/", "descifraResponse");
    private final static QName _MandaMAil_QNAME = new QName("http://servicios/", "mandaMAil");
    private final static QName _MandaMAilResponse_QNAME = new QName("http://servicios/", "mandaMAilResponse");
    private final static QName _MandaMAils_QNAME = new QName("http://servicios/", "mandaMAils");
    private final static QName _MandaMAilsResponse_QNAME = new QName("http://servicios/", "mandaMAilsResponse");
    private final static QName _RecuperarContra_QNAME = new QName("http://servicios/", "recuperarContra");
    private final static QName _RecuperarContraResponse_QNAME = new QName("http://servicios/", "recuperarContraResponse");
    private final static QName _ValidarCodigo_QNAME = new QName("http://servicios/", "validarCodigo");
    private final static QName _ValidarCodigoResponse_QNAME = new QName("http://servicios/", "validarCodigoResponse");
    private final static QName _ValidarCuenta_QNAME = new QName("http://servicios/", "validarCuenta");
    private final static QName _ValidarCuentaResponse_QNAME = new QName("http://servicios/", "validarCuentaResponse");
    private final static QName _DescifraArg0_QNAME = new QName("", "arg0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link BaseMail }
     * 
     */
    public BaseMail createBaseMail() {
        return new BaseMail();
    }

    /**
     * Create an instance of {@link BaseMailResponse }
     * 
     */
    public BaseMailResponse createBaseMailResponse() {
        return new BaseMailResponse();
    }

    /**
     * Create an instance of {@link Cifra }
     * 
     */
    public Cifra createCifra() {
        return new Cifra();
    }

    /**
     * Create an instance of {@link CifraResponse }
     * 
     */
    public CifraResponse createCifraResponse() {
        return new CifraResponse();
    }

    /**
     * Create an instance of {@link Descifra }
     * 
     */
    public Descifra createDescifra() {
        return new Descifra();
    }

    /**
     * Create an instance of {@link DescifraResponse }
     * 
     */
    public DescifraResponse createDescifraResponse() {
        return new DescifraResponse();
    }

    /**
     * Create an instance of {@link MandaMAil }
     * 
     */
    public MandaMAil createMandaMAil() {
        return new MandaMAil();
    }

    /**
     * Create an instance of {@link MandaMAilResponse }
     * 
     */
    public MandaMAilResponse createMandaMAilResponse() {
        return new MandaMAilResponse();
    }

    /**
     * Create an instance of {@link MandaMAils }
     * 
     */
    public MandaMAils createMandaMAils() {
        return new MandaMAils();
    }

    /**
     * Create an instance of {@link MandaMAilsResponse }
     * 
     */
    public MandaMAilsResponse createMandaMAilsResponse() {
        return new MandaMAilsResponse();
    }

    /**
     * Create an instance of {@link RecuperarContra }
     * 
     */
    public RecuperarContra createRecuperarContra() {
        return new RecuperarContra();
    }

    /**
     * Create an instance of {@link RecuperarContraResponse }
     * 
     */
    public RecuperarContraResponse createRecuperarContraResponse() {
        return new RecuperarContraResponse();
    }

    /**
     * Create an instance of {@link ValidarCodigo }
     * 
     */
    public ValidarCodigo createValidarCodigo() {
        return new ValidarCodigo();
    }

    /**
     * Create an instance of {@link ValidarCodigoResponse }
     * 
     */
    public ValidarCodigoResponse createValidarCodigoResponse() {
        return new ValidarCodigoResponse();
    }

    /**
     * Create an instance of {@link ValidarCuenta }
     * 
     */
    public ValidarCuenta createValidarCuenta() {
        return new ValidarCuenta();
    }

    /**
     * Create an instance of {@link ValidarCuentaResponse }
     * 
     */
    public ValidarCuentaResponse createValidarCuentaResponse() {
        return new ValidarCuentaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "baseMailResponse")
    public JAXBElement<BaseMailResponse> createBaseMailResponse(BaseMailResponse value) {
        return new JAXBElement<BaseMailResponse>(_BaseMailResponse_QNAME, BaseMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cifra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "cifra")
    public JAXBElement<Cifra> createCifra(Cifra value) {
        return new JAXBElement<Cifra>(_Cifra_QNAME, Cifra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CifraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "cifraResponse")
    public JAXBElement<CifraResponse> createCifraResponse(CifraResponse value) {
        return new JAXBElement<CifraResponse>(_CifraResponse_QNAME, CifraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Descifra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "descifra")
    public JAXBElement<Descifra> createDescifra(Descifra value) {
        return new JAXBElement<Descifra>(_Descifra_QNAME, Descifra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescifraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "descifraResponse")
    public JAXBElement<DescifraResponse> createDescifraResponse(DescifraResponse value) {
        return new JAXBElement<DescifraResponse>(_DescifraResponse_QNAME, DescifraResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAilResponse")
    public JAXBElement<MandaMAilResponse> createMandaMAilResponse(MandaMAilResponse value) {
        return new JAXBElement<MandaMAilResponse>(_MandaMAilResponse_QNAME, MandaMAilResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MandaMAilsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "mandaMAilsResponse")
    public JAXBElement<MandaMAilsResponse> createMandaMAilsResponse(MandaMAilsResponse value) {
        return new JAXBElement<MandaMAilsResponse>(_MandaMAilsResponse_QNAME, MandaMAilsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarContra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "recuperarContra")
    public JAXBElement<RecuperarContra> createRecuperarContra(RecuperarContra value) {
        return new JAXBElement<RecuperarContra>(_RecuperarContra_QNAME, RecuperarContra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarContraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "recuperarContraResponse")
    public JAXBElement<RecuperarContraResponse> createRecuperarContraResponse(RecuperarContraResponse value) {
        return new JAXBElement<RecuperarContraResponse>(_RecuperarContraResponse_QNAME, RecuperarContraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validarCodigo")
    public JAXBElement<ValidarCodigo> createValidarCodigo(ValidarCodigo value) {
        return new JAXBElement<ValidarCodigo>(_ValidarCodigo_QNAME, ValidarCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validarCodigoResponse")
    public JAXBElement<ValidarCodigoResponse> createValidarCodigoResponse(ValidarCodigoResponse value) {
        return new JAXBElement<ValidarCodigoResponse>(_ValidarCodigoResponse_QNAME, ValidarCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validarCuenta")
    public JAXBElement<ValidarCuenta> createValidarCuenta(ValidarCuenta value) {
        return new JAXBElement<ValidarCuenta>(_ValidarCuenta_QNAME, ValidarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "validarCuentaResponse")
    public JAXBElement<ValidarCuentaResponse> createValidarCuentaResponse(ValidarCuentaResponse value) {
        return new JAXBElement<ValidarCuentaResponse>(_ValidarCuentaResponse_QNAME, ValidarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = Descifra.class)
    public JAXBElement<byte[]> createDescifraArg0(byte[] value) {
        return new JAXBElement<byte[]>(_DescifraArg0_QNAME, byte[].class, Descifra.class, ((byte[]) value));
    }

}
