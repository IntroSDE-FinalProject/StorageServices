
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteReminder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteReminder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idReminder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteReminder", propOrder = {
    "idReminder"
})
public class DeleteReminder {

    protected int idReminder;

    /**
     * Gets the value of the idReminder property.
     * 
     */
    public int getIdReminder() {
        return idReminder;
    }

    /**
     * Sets the value of the idReminder property.
     * 
     */
    public void setIdReminder(int value) {
        this.idReminder = value;
    }

}
