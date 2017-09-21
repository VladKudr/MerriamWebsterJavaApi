
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="va" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vrType", propOrder = {
    "vl",
    "va"
})
public class VrType {

    @XmlElement(required = true)
    protected String vl;
    @XmlElement(required = true)
    protected String va;

    /**
     * Gets the value of the vl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVl() {
        return vl;
    }

    /**
     * Sets the value of the vl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVl(String value) {
        this.vl = value;
    }

    /**
     * Gets the value of the va property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVa() {
        return va;
    }

    /**
     * Sets the value of the va property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVa(String value) {
        this.va = value;
    }

}
