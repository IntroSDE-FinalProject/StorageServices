
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reminder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reminder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autocreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="createReminder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expireReminder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idReminder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="relevanceLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reminder", propOrder = {
    "autocreate",
    "createReminder",
    "expireReminder",
    "idReminder",
    "relevanceLevel",
    "text"
})
public class Reminder {

    protected boolean autocreate;
    @XmlElement(required = true)
    protected String createReminder;
    @XmlElement(required = true)
    protected String expireReminder;
    protected int idReminder;
    protected int relevanceLevel;
    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the autocreate property.
     * 
     */
    public boolean isAutocreate() {
        return autocreate;
    }

    /**
     * Sets the value of the autocreate property.
     * 
     */
    public void setAutocreate(boolean value) {
        this.autocreate = value;
    }

    /**
     * Gets the value of the createReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateReminder() {
        return createReminder;
    }

    /**
     * Sets the value of the createReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateReminder(String value) {
        this.createReminder = value;
    }

    /**
     * Gets the value of the expireReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireReminder() {
        return expireReminder;
    }

    /**
     * Sets the value of the expireReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireReminder(String value) {
        this.expireReminder = value;
    }

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

    /**
     * Gets the value of the relevanceLevel property.
     * 
     */
    public int getRelevanceLevel() {
        return relevanceLevel;
    }

    /**
     * Sets the value of the relevanceLevel property.
     * 
     */
    public void setRelevanceLevel(int value) {
        this.relevanceLevel = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
