
package serviciosWeb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioContrasena complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioContrasena"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="boleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="antigua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioContrasena", propOrder = {
    "idTipo",
    "boleta",
    "antigua",
    "nueva"
})
public class CambioContrasena {

    protected int idTipo;
    protected String boleta;
    protected String antigua;
    protected String nueva;

    /**
     * Obtiene el valor de la propiedad idTipo.
     * 
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * Define el valor de la propiedad idTipo.
     * 
     */
    public void setIdTipo(int value) {
        this.idTipo = value;
    }

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
     * Obtiene el valor de la propiedad antigua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntigua() {
        return antigua;
    }

    /**
     * Define el valor de la propiedad antigua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntigua(String value) {
        this.antigua = value;
    }

    /**
     * Obtiene el valor de la propiedad nueva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNueva() {
        return nueva;
    }

    /**
     * Define el valor de la propiedad nueva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNueva(String value) {
        this.nueva = value;
    }

}
