
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVitalSignsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVitalSignsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vitalSigns" type="{http://ws.soap.finalproject.introsde/}listMeasureWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVitalSignsResponse", propOrder = {
    "vitalSigns"
})
public class GetVitalSignsResponse {

    protected ListMeasureWrapper vitalSigns;

    /**
     * Gets the value of the vitalSigns property.
     * 
     * @return
     *     possible object is
     *     {@link ListMeasureWrapper }
     *     
     */
    public ListMeasureWrapper getVitalSigns() {
        return vitalSigns;
    }

    /**
     * Sets the value of the vitalSigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMeasureWrapper }
     *     
     */
    public void setVitalSigns(ListMeasureWrapper value) {
        this.vitalSigns = value;
    }

}
