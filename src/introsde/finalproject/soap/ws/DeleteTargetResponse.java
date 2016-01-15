
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTargetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTargetResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseTargetCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTargetResponse", propOrder = {
    "responseTargetCode"
})
public class DeleteTargetResponse {

    protected int responseTargetCode;

    /**
     * Gets the value of the responseTargetCode property.
     * 
     */
    public int getResponseTargetCode() {
        return responseTargetCode;
    }

    /**
     * Sets the value of the responseTargetCode property.
     * 
     */
    public void setResponseTargetCode(int value) {
        this.responseTargetCode = value;
    }

}
