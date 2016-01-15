
package introsde.finalproject.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDoctorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteDoctorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseDoctorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDoctorResponse", propOrder = {
    "responseDoctorCode"
})
public class DeleteDoctorResponse {

    protected int responseDoctorCode;

    /**
     * Gets the value of the responseDoctorCode property.
     * 
     */
    public int getResponseDoctorCode() {
        return responseDoctorCode;
    }

    /**
     * Sets the value of the responseDoctorCode property.
     * 
     */
    public void setResponseDoctorCode(int value) {
        this.responseDoctorCode = value;
    }

}
