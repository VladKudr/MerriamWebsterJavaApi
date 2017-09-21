
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cxType", propOrder = {
    "cl",
    "ct"
})
public class CxType {

    @XmlElement(required = true)
    protected String cl;
    @XmlElement(required = true)
    protected String ct;

    /**
     * Gets the value of the cl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCl() {
        return cl;
    }

    /**
     * Sets the value of the cl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCl(String value) {
        this.cl = value;
    }

    /**
     * Gets the value of the ct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCt() {
        return ct;
    }

    /**
     * Sets the value of the ct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCt(String value) {
        this.ct = value;
    }

}
