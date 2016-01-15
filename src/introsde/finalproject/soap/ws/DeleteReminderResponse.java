
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteReminderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteReminderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseReminderCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteReminderResponse", propOrder = {
    "responseReminderCode"
})
public class DeleteReminderResponse {

    protected int responseReminderCode;

    /**
     * Gets the value of the responseReminderCode property.
     * 
     */
    public int getResponseReminderCode() {
        return responseReminderCode;
    }

    /**
     * Sets the value of the responseReminderCode property.
     * 
     */
    public void setResponseReminderCode(int value) {
        this.responseReminderCode = value;
    }

}
