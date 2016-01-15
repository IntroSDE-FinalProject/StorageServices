
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonByDoctorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonByDoctorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patientList" type="{http://ws.soap.finalproject.introsde/}listPersonWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByDoctorResponse", propOrder = {
    "patientList"
})
public class GetPersonByDoctorResponse {

    protected ListPersonWrapper patientList;

    /**
     * Gets the value of the patientList property.
     * 
     * @return
     *     possible object is
     *     {@link ListPersonWrapper }
     *     
     */
    public ListPersonWrapper getPatientList() {
        return patientList;
    }

    /**
     * Sets the value of the patientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPersonWrapper }
     *     
     */
    public void setPatientList(ListPersonWrapper value) {
        this.patientList = value;
    }

}
