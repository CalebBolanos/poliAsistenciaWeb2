
package serviciosWebGestion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciosWebGestion package. 
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

    private final static QName _Alumnos_QNAME = new QName("http://servicios/", "alumnos");
    private final static QName _AlumnosResponse_QNAME = new QName("http://servicios/", "alumnosResponse");
    private final static QName _AsistenciaGrupoDia_QNAME = new QName("http://servicios/", "asistenciaGrupoDia");
    private final static QName _AsistenciaGrupoDiaResponse_QNAME = new QName("http://servicios/", "asistenciaGrupoDiaResponse");
    private final static QName _AsistenciaGrupoMes_QNAME = new QName("http://servicios/", "asistenciaGrupoMes");
    private final static QName _AsistenciaGrupoMesResponse_QNAME = new QName("http://servicios/", "asistenciaGrupoMesResponse");
    private final static QName _AsistenciaTurnoMes_QNAME = new QName("http://servicios/", "asistenciaTurnoMes");
    private final static QName _AsistenciaTurnoMesResponse_QNAME = new QName("http://servicios/", "asistenciaTurnoMesResponse");
    private final static QName _AsistenciaTurnoPorDia_QNAME = new QName("http://servicios/", "asistenciaTurnoPorDia");
    private final static QName _AsistenciaTurnoPorDiaMas_QNAME = new QName("http://servicios/", "asistenciaTurnoPorDiaMas");
    private final static QName _AsistenciaTurnoPorDiaMasResponse_QNAME = new QName("http://servicios/", "asistenciaTurnoPorDiaMasResponse");
    private final static QName _AsistenciaTurnoPorDiaResponse_QNAME = new QName("http://servicios/", "asistenciaTurnoPorDiaResponse");
    private final static QName _BorrarNotificaciones_QNAME = new QName("http://servicios/", "borrarNotificaciones");
    private final static QName _BorrarNotificacionesResponse_QNAME = new QName("http://servicios/", "borrarNotificacionesResponse");
    private final static QName _DatosGrupoEspecifico_QNAME = new QName("http://servicios/", "datosGrupoEspecifico");
    private final static QName _DatosGrupoEspecificoResponse_QNAME = new QName("http://servicios/", "datosGrupoEspecificoResponse");
    private final static QName _Grupos_QNAME = new QName("http://servicios/", "grupos");
    private final static QName _GruposResponse_QNAME = new QName("http://servicios/", "gruposResponse");
    private final static QName _GuardarNotificaciones_QNAME = new QName("http://servicios/", "guardarNotificaciones");
    private final static QName _GuardarNotificacionesResponse_QNAME = new QName("http://servicios/", "guardarNotificacionesResponse");
    private final static QName _ObtenerNotificacionEspecifica_QNAME = new QName("http://servicios/", "obtenerNotificacionEspecifica");
    private final static QName _ObtenerNotificacionEspecificaResponse_QNAME = new QName("http://servicios/", "obtenerNotificacionEspecificaResponse");
    private final static QName _ObtenerNotificaciones_QNAME = new QName("http://servicios/", "obtenerNotificaciones");
    private final static QName _ObtenerNotificacionesResponse_QNAME = new QName("http://servicios/", "obtenerNotificacionesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosWebGestion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alumnos }
     * 
     */
    public Alumnos createAlumnos() {
        return new Alumnos();
    }

    /**
     * Create an instance of {@link AlumnosResponse }
     * 
     */
    public AlumnosResponse createAlumnosResponse() {
        return new AlumnosResponse();
    }

    /**
     * Create an instance of {@link AsistenciaGrupoDia }
     * 
     */
    public AsistenciaGrupoDia createAsistenciaGrupoDia() {
        return new AsistenciaGrupoDia();
    }

    /**
     * Create an instance of {@link AsistenciaGrupoDiaResponse }
     * 
     */
    public AsistenciaGrupoDiaResponse createAsistenciaGrupoDiaResponse() {
        return new AsistenciaGrupoDiaResponse();
    }

    /**
     * Create an instance of {@link AsistenciaGrupoMes }
     * 
     */
    public AsistenciaGrupoMes createAsistenciaGrupoMes() {
        return new AsistenciaGrupoMes();
    }

    /**
     * Create an instance of {@link AsistenciaGrupoMesResponse }
     * 
     */
    public AsistenciaGrupoMesResponse createAsistenciaGrupoMesResponse() {
        return new AsistenciaGrupoMesResponse();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoMes }
     * 
     */
    public AsistenciaTurnoMes createAsistenciaTurnoMes() {
        return new AsistenciaTurnoMes();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoMesResponse }
     * 
     */
    public AsistenciaTurnoMesResponse createAsistenciaTurnoMesResponse() {
        return new AsistenciaTurnoMesResponse();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoPorDia }
     * 
     */
    public AsistenciaTurnoPorDia createAsistenciaTurnoPorDia() {
        return new AsistenciaTurnoPorDia();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoPorDiaMas }
     * 
     */
    public AsistenciaTurnoPorDiaMas createAsistenciaTurnoPorDiaMas() {
        return new AsistenciaTurnoPorDiaMas();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoPorDiaMasResponse }
     * 
     */
    public AsistenciaTurnoPorDiaMasResponse createAsistenciaTurnoPorDiaMasResponse() {
        return new AsistenciaTurnoPorDiaMasResponse();
    }

    /**
     * Create an instance of {@link AsistenciaTurnoPorDiaResponse }
     * 
     */
    public AsistenciaTurnoPorDiaResponse createAsistenciaTurnoPorDiaResponse() {
        return new AsistenciaTurnoPorDiaResponse();
    }

    /**
     * Create an instance of {@link BorrarNotificaciones }
     * 
     */
    public BorrarNotificaciones createBorrarNotificaciones() {
        return new BorrarNotificaciones();
    }

    /**
     * Create an instance of {@link BorrarNotificacionesResponse }
     * 
     */
    public BorrarNotificacionesResponse createBorrarNotificacionesResponse() {
        return new BorrarNotificacionesResponse();
    }

    /**
     * Create an instance of {@link DatosGrupoEspecifico }
     * 
     */
    public DatosGrupoEspecifico createDatosGrupoEspecifico() {
        return new DatosGrupoEspecifico();
    }

    /**
     * Create an instance of {@link DatosGrupoEspecificoResponse }
     * 
     */
    public DatosGrupoEspecificoResponse createDatosGrupoEspecificoResponse() {
        return new DatosGrupoEspecificoResponse();
    }

    /**
     * Create an instance of {@link Grupos }
     * 
     */
    public Grupos createGrupos() {
        return new Grupos();
    }

    /**
     * Create an instance of {@link GruposResponse }
     * 
     */
    public GruposResponse createGruposResponse() {
        return new GruposResponse();
    }

    /**
     * Create an instance of {@link GuardarNotificaciones }
     * 
     */
    public GuardarNotificaciones createGuardarNotificaciones() {
        return new GuardarNotificaciones();
    }

    /**
     * Create an instance of {@link GuardarNotificacionesResponse }
     * 
     */
    public GuardarNotificacionesResponse createGuardarNotificacionesResponse() {
        return new GuardarNotificacionesResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionEspecifica }
     * 
     */
    public ObtenerNotificacionEspecifica createObtenerNotificacionEspecifica() {
        return new ObtenerNotificacionEspecifica();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionEspecificaResponse }
     * 
     */
    public ObtenerNotificacionEspecificaResponse createObtenerNotificacionEspecificaResponse() {
        return new ObtenerNotificacionEspecificaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Alumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "alumnos")
    public JAXBElement<Alumnos> createAlumnos(Alumnos value) {
        return new JAXBElement<Alumnos>(_Alumnos_QNAME, Alumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "alumnosResponse")
    public JAXBElement<AlumnosResponse> createAlumnosResponse(AlumnosResponse value) {
        return new JAXBElement<AlumnosResponse>(_AlumnosResponse_QNAME, AlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaGrupoDia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaGrupoDia")
    public JAXBElement<AsistenciaGrupoDia> createAsistenciaGrupoDia(AsistenciaGrupoDia value) {
        return new JAXBElement<AsistenciaGrupoDia>(_AsistenciaGrupoDia_QNAME, AsistenciaGrupoDia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaGrupoDiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaGrupoDiaResponse")
    public JAXBElement<AsistenciaGrupoDiaResponse> createAsistenciaGrupoDiaResponse(AsistenciaGrupoDiaResponse value) {
        return new JAXBElement<AsistenciaGrupoDiaResponse>(_AsistenciaGrupoDiaResponse_QNAME, AsistenciaGrupoDiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaGrupoMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaGrupoMes")
    public JAXBElement<AsistenciaGrupoMes> createAsistenciaGrupoMes(AsistenciaGrupoMes value) {
        return new JAXBElement<AsistenciaGrupoMes>(_AsistenciaGrupoMes_QNAME, AsistenciaGrupoMes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaGrupoMesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaGrupoMesResponse")
    public JAXBElement<AsistenciaGrupoMesResponse> createAsistenciaGrupoMesResponse(AsistenciaGrupoMesResponse value) {
        return new JAXBElement<AsistenciaGrupoMesResponse>(_AsistenciaGrupoMesResponse_QNAME, AsistenciaGrupoMesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoMes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoMes")
    public JAXBElement<AsistenciaTurnoMes> createAsistenciaTurnoMes(AsistenciaTurnoMes value) {
        return new JAXBElement<AsistenciaTurnoMes>(_AsistenciaTurnoMes_QNAME, AsistenciaTurnoMes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoMesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoMesResponse")
    public JAXBElement<AsistenciaTurnoMesResponse> createAsistenciaTurnoMesResponse(AsistenciaTurnoMesResponse value) {
        return new JAXBElement<AsistenciaTurnoMesResponse>(_AsistenciaTurnoMesResponse_QNAME, AsistenciaTurnoMesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoPorDia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoPorDia")
    public JAXBElement<AsistenciaTurnoPorDia> createAsistenciaTurnoPorDia(AsistenciaTurnoPorDia value) {
        return new JAXBElement<AsistenciaTurnoPorDia>(_AsistenciaTurnoPorDia_QNAME, AsistenciaTurnoPorDia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoPorDiaMas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoPorDiaMas")
    public JAXBElement<AsistenciaTurnoPorDiaMas> createAsistenciaTurnoPorDiaMas(AsistenciaTurnoPorDiaMas value) {
        return new JAXBElement<AsistenciaTurnoPorDiaMas>(_AsistenciaTurnoPorDiaMas_QNAME, AsistenciaTurnoPorDiaMas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoPorDiaMasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoPorDiaMasResponse")
    public JAXBElement<AsistenciaTurnoPorDiaMasResponse> createAsistenciaTurnoPorDiaMasResponse(AsistenciaTurnoPorDiaMasResponse value) {
        return new JAXBElement<AsistenciaTurnoPorDiaMasResponse>(_AsistenciaTurnoPorDiaMasResponse_QNAME, AsistenciaTurnoPorDiaMasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsistenciaTurnoPorDiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "asistenciaTurnoPorDiaResponse")
    public JAXBElement<AsistenciaTurnoPorDiaResponse> createAsistenciaTurnoPorDiaResponse(AsistenciaTurnoPorDiaResponse value) {
        return new JAXBElement<AsistenciaTurnoPorDiaResponse>(_AsistenciaTurnoPorDiaResponse_QNAME, AsistenciaTurnoPorDiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarNotificaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "borrarNotificaciones")
    public JAXBElement<BorrarNotificaciones> createBorrarNotificaciones(BorrarNotificaciones value) {
        return new JAXBElement<BorrarNotificaciones>(_BorrarNotificaciones_QNAME, BorrarNotificaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarNotificacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "borrarNotificacionesResponse")
    public JAXBElement<BorrarNotificacionesResponse> createBorrarNotificacionesResponse(BorrarNotificacionesResponse value) {
        return new JAXBElement<BorrarNotificacionesResponse>(_BorrarNotificacionesResponse_QNAME, BorrarNotificacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGrupoEspecifico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "datosGrupoEspecifico")
    public JAXBElement<DatosGrupoEspecifico> createDatosGrupoEspecifico(DatosGrupoEspecifico value) {
        return new JAXBElement<DatosGrupoEspecifico>(_DatosGrupoEspecifico_QNAME, DatosGrupoEspecifico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGrupoEspecificoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "datosGrupoEspecificoResponse")
    public JAXBElement<DatosGrupoEspecificoResponse> createDatosGrupoEspecificoResponse(DatosGrupoEspecificoResponse value) {
        return new JAXBElement<DatosGrupoEspecificoResponse>(_DatosGrupoEspecificoResponse_QNAME, DatosGrupoEspecificoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grupos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "grupos")
    public JAXBElement<Grupos> createGrupos(Grupos value) {
        return new JAXBElement<Grupos>(_Grupos_QNAME, Grupos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GruposResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "gruposResponse")
    public JAXBElement<GruposResponse> createGruposResponse(GruposResponse value) {
        return new JAXBElement<GruposResponse>(_GruposResponse_QNAME, GruposResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarNotificaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "guardarNotificaciones")
    public JAXBElement<GuardarNotificaciones> createGuardarNotificaciones(GuardarNotificaciones value) {
        return new JAXBElement<GuardarNotificaciones>(_GuardarNotificaciones_QNAME, GuardarNotificaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarNotificacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "guardarNotificacionesResponse")
    public JAXBElement<GuardarNotificacionesResponse> createGuardarNotificacionesResponse(GuardarNotificacionesResponse value) {
        return new JAXBElement<GuardarNotificacionesResponse>(_GuardarNotificacionesResponse_QNAME, GuardarNotificacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionEspecifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerNotificacionEspecifica")
    public JAXBElement<ObtenerNotificacionEspecifica> createObtenerNotificacionEspecifica(ObtenerNotificacionEspecifica value) {
        return new JAXBElement<ObtenerNotificacionEspecifica>(_ObtenerNotificacionEspecifica_QNAME, ObtenerNotificacionEspecifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionEspecificaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerNotificacionEspecificaResponse")
    public JAXBElement<ObtenerNotificacionEspecificaResponse> createObtenerNotificacionEspecificaResponse(ObtenerNotificacionEspecificaResponse value) {
        return new JAXBElement<ObtenerNotificacionEspecificaResponse>(_ObtenerNotificacionEspecificaResponse_QNAME, ObtenerNotificacionEspecificaResponse.class, null, value);
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
