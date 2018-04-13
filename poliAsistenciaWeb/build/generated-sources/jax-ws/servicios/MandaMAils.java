
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mandaMAils complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mandaMAils"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Para" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Msj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandaMAils", propOrder = {
    "para",
    "titulo",
    "msj"
})
public class MandaMAils {

    @XmlElement(name = "Para")
    protected int para;
    @XmlElement(name = "Titulo")
    protected String titulo;
    @XmlElement(name = "Msj")
    protected String msj;

    /**
     * Obtiene el valor de la propiedad para.
     * 
     */
    public int getPara() {
        return para;
    }

    /**
     * Define el valor de la propiedad para.
     * 
     */
    public void setPara(int value) {
        this.para = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad msj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsj() {
        return msj;
    }

    /**
     * Define el valor de la propiedad msj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsj(String value) {
        this.msj = value;
    }

}
