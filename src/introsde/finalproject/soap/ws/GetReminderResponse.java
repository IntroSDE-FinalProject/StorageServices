
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReminderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReminderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reminder" type="{http://ws.soap.finalproject.introsde/}listReminderWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReminderResponse", propOrder = {
    "reminder"
})
public class GetReminderResponse {

    protected ListReminderWrapper reminder;

    /**
     * Gets the value of the reminder property.
     * 
     * @return
     *     possible object is
     *     {@link ListReminderWrapper }
     *     
     */
    public ListReminderWrapper getReminder() {
        return reminder;
    }

    /**
     * Sets the value of the reminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListReminderWrapper }
     *     
     */
    public void setReminder(ListReminderWrapper value) {
        this.reminder = value;
    }

}
