
package serviciosWeb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traerCorreo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traerCorreo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traerCorreo", propOrder = {
    "idPer"
})
public class TraerCorreo {

    protected int idPer;

    /**
     * Obtiene el valor de la propiedad idPer.
     * 
     */
    public int getIdPer() {
        return idPer;
    }

    /**
     * Define el valor de la propiedad idPer.
     * 
     */
    public void setIdPer(int value) {
        this.idPer = value;
    }

}
