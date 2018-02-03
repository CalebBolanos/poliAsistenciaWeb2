
package serviciosWeb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosAlumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosAlumno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosAlumno", propOrder = {
    "boleta",
    "llave"
})
public class DatosAlumno {

    protected String boleta;
    protected String llave;

    /**
     * Obtiene el valor de la propiedad boleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoleta() {
        return boleta;
    }

    /**
     * Define el valor de la propiedad boleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoleta(String value) {
        this.boleta = value;
    }

    /**
     * Obtiene el valor de la propiedad llave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlave() {
        return llave;
    }

    /**
     * Define el valor de la propiedad llave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlave(String value) {
        this.llave = value;
    }

}
