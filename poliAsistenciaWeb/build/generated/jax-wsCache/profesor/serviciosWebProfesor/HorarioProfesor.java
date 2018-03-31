
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
 * &lt;complexType name="horarioProfesor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
