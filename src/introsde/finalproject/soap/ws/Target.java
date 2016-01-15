
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="target">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achieved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="conditionTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endDateTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTarget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureDefinition" type="{http://ws.soap.finalproject.introsde/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="startDateTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "target", propOrder = {
    "achieved",
    "conditionTarget",
    "endDateTarget",
    "idTarget",
    "measureDefinition",
    "startDateTarget",
    "value"
})
public class Target {

    protected boolean achieved;
    @XmlElement(required = true)
    protected String conditionTarget;
    @XmlElement(required = true)
    protected String endDateTarget;
    protected int idTarget;
    protected MeasureDefinition measureDefinition;
    @XmlElement(required = true)
    protected String startDateTarget;
    protected int value;

    /**
     * Gets the value of the achieved property.
     * 
     */
    public boolean isAchieved() {
        return achieved;
    }

    /**
     * Sets the value of the achieved property.
     * 
     */
    public void setAchieved(boolean value) {
        this.achieved = value;
    }

    /**
     * Gets the value of the conditionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionTarget() {
        return conditionTarget;
    }

    /**
     * Sets the value of the conditionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionTarget(String value) {
        this.conditionTarget = value;
    }

    /**
     * Gets the value of the endDateTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTarget() {
        return endDateTarget;
    }

    /**
     * Sets the value of the endDateTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTarget(String value) {
        this.endDateTarget = value;
    }

    /**
     * Gets the value of the idTarget property.
     * 
     */
    public int getIdTarget() {
        return idTarget;
    }

    /**
     * Sets the value of the idTarget property.
     * 
     */
    public void setIdTarget(int value) {
        this.idTarget = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the startDateTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTarget() {
        return startDateTarget;
    }

    /**
     * Sets the value of the startDateTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTarget(String value) {
        this.startDateTarget = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
