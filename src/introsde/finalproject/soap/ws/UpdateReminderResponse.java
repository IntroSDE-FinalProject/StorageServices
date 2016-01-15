
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateReminderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateReminderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateReminder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateReminderResponse", propOrder = {
    "updateReminder"
})
public class UpdateReminderResponse {

    protected int updateReminder;

    /**
     * Gets the value of the updateReminder property.
     * 
     */
    public int getUpdateReminder() {
        return updateReminder;
    }

    /**
     * Sets the value of the updateReminder property.
     * 
     */
    public void setUpdateReminder(int value) {
        this.updateReminder = value;
    }

}
