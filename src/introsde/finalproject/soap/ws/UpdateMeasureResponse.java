
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUpdatedMeasure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMeasureResponse", propOrder = {
    "idUpdatedMeasure"
})
public class UpdateMeasureResponse {

    protected int idUpdatedMeasure;

    /**
     * Gets the value of the idUpdatedMeasure property.
     * 
     */
    public int getIdUpdatedMeasure() {
        return idUpdatedMeasure;
    }

    /**
     * Sets the value of the idUpdatedMeasure property.
     * 
     */
    public void setIdUpdatedMeasure(int value) {
        this.idUpdatedMeasure = value;
    }

}
