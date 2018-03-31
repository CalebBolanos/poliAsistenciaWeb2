
package serviciosWebProfesor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asistenciaUnidadDia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asistenciaUnidadDia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asistenciaUnidadDia", propOrder = {
    "idUnidad"
})
public class AsistenciaUnidadDia {

    protected String idUnidad;

    /**
     * Obtiene el valor de la propiedad idUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidad() {
        return idUnidad;
    }

    /**
     * Define el valor de la propiedad idUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidad(String value) {
        this.idUnidad = value;
    }

}
