
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasureDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasureDefinitionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureDefinition" type="{http://ws.soap.finalproject.introsde/}listMeasureDefinitionWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureDefinitionResponse", propOrder = {
    "measureDefinition"
})
public class GetMeasureDefinitionResponse {

    protected ListMeasureDefinitionWrapper measureDefinition;

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ListMeasureDefinitionWrapper }
     *     
     */
    public ListMeasureDefinitionWrapper getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMeasureDefinitionWrapper }
     *     
     */
    public void setMeasureDefinition(ListMeasureDefinitionWrapper value) {
        this.measureDefinition = value;
    }

}
