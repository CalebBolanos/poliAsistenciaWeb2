
package serviciosWebGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asistenciaTurnoMes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asistenciaTurnoMes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asistenciaTurnoMes", propOrder = {
    "mes",
    "turno"
})
public class AsistenciaTurnoMes {

    protected int mes;
    protected int turno;

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     */
    public int getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     */
    public void setMes(int value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad turno.
     * 
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Define el valor de la propiedad turno.
     * 
     */
    public void setTurno(int value) {
        this.turno = value;
    }

}
