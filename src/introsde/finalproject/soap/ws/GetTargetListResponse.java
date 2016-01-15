
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTargetListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTargetListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targets" type="{http://ws.soap.finalproject.introsde/}listTargetWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTargetListResponse", propOrder = {
    "targets"
})
public class GetTargetListResponse {

    protected ListTargetWrapper targets;

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link ListTargetWrapper }
     *     
     */
    public ListTargetWrapper getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTargetWrapper }
     *     
     */
    public void setTargets(ListTargetWrapper value) {
        this.targets = value;
    }

}
