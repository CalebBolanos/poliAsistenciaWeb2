
package serviciosWebProfesor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horarioProfesor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horarioProfesor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioProfesor", propOrder = {
    "idPer"
})
public class HorarioProfesor {

    protected String idPer;

    /**
     * Obtiene el valor de la propiedad idPer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPer() {
        return idPer;
    }

    /**
     * Define el valor de la propiedad idPer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPer(String value) {
        this.idPer = value;
    }

}
