
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for hwType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hwType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="highlight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hindex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hwType", propOrder = {
    "value"
})
public class HwType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "highlight")
    protected String highlight;
    @XmlAttribute(name = "hindex")
    protected String hindex;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlight() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlight(String value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the hindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHindex() {
        return hindex;
    }

    /**
     * Sets the value of the hindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHindex(String value) {
        this.hindex = value;
    }

}
