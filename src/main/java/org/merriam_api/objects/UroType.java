
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sound" type="{}soundType"/>
 *         &lt;element name="pr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utxt" type="{}utxtType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uroType", propOrder = {
    "ure",
    "sound",
    "pr",
    "fl",
    "lb",
    "utxt"
})
public class UroType {

    @XmlElement(required = true)
    protected String ure;
    @XmlElement(required = true)
    protected SoundType sound;
    @XmlElement(required = true)
    protected String pr;
    @XmlElement(required = true)
    protected String fl;
    @XmlElement(required = true)
    protected String lb;
    @XmlElement(required = true)
    protected UtxtType utxt;

    /**
     * Gets the value of the ure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUre() {
        return ure;
    }

    /**
     * Sets the value of the ure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUre(String value) {
        this.ure = value;
    }

    /**
     * Gets the value of the sound property.
     * 
     * @return
     *     possible object is
     *     {@link SoundType }
     *     
     */
    public SoundType getSound() {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundType }
     *     
     */
    public void setSound(SoundType value) {
        this.sound = value;
    }

    /**
     * Gets the value of the pr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPr() {
        return pr;
    }

    /**
     * Sets the value of the pr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPr(String value) {
        this.pr = value;
    }

    /**
     * Gets the value of the fl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl() {
        return fl;
    }

    /**
     * Sets the value of the fl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl(String value) {
        this.fl = value;
    }

    /**
     * Gets the value of the lb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLb() {
        return lb;
    }

    /**
     * Sets the value of the lb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLb(String value) {
        this.lb = value;
    }

    /**
     * Gets the value of the utxt property.
     * 
     * @return
     *     possible object is
     *     {@link UtxtType }
     *     
     */
    public UtxtType getUtxt() {
        return utxt;
    }

    /**
     * Sets the value of the utxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtxtType }
     *     
     */
    public void setUtxt(UtxtType value) {
        this.utxt = value;
    }

}
