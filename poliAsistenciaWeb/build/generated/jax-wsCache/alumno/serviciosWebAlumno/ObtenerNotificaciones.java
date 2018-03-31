
package serviciosWebAlumno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerNotificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerNotificaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoNotificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerNotificaciones", propOrder = {
    "tipoNotificacion"
})
public class ObtenerNotificaciones {

    protected int tipoNotificacion;

    /**
     * Obtiene el valor de la propiedad tipoNotificacion.
     * 
     */
    public int getTipoNotificacion() {
        return tipoNotificacion;
    }

    /**
     * Define el valor de la propiedad tipoNotificacion.
     * 
     */
    public void setTipoNotificacion(int value) {
        this.tipoNotificacion = value;
    }

}
