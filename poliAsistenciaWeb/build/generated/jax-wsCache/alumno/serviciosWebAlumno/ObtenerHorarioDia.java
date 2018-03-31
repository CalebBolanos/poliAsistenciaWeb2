
package serviciosWebAlumno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerHorarioDia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerHorarioDia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaSemana" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerHorarioDia", propOrder = {
    "boleta",
    "diaSemana"
})
public class ObtenerHorarioDia {

    protected String boleta;
    protected int diaSemana;

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
     * Obtiene el valor de la propiedad diaSemana.
     * 
     */
    public int getDiaSemana() {
        return diaSemana;
    }

    /**
     * Define el valor de la propiedad diaSemana.
     * 
     */
    public void setDiaSemana(int value) {
        this.diaSemana = value;
    }

}
