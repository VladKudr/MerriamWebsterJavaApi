
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="il" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="if">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="goes"/>
 *               &lt;enumeration value="went"/>
 *               &lt;enumeration value="gone"/>
 *               &lt;enumeration value="go*ing"/>
 *               &lt;enumeration value="go–arounds"/>
 *               &lt;enumeration value="go–be*tweens"/>
 *               &lt;enumeration value="go–get*ters"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sound" type="{}soundType" minOccurs="0"/>
 *         &lt;element name="pr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u02c8go\u028az"/>
 *               &lt;enumeration value="\u02c8w\u025bnt"/>
 *               &lt;enumeration value="\u02c8g\u0251:n"/>
 *               &lt;enumeration value="\u02c8gow\u026a\u014b"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inType", propOrder = {
    "il",
    "_if",
    "sound",
    "pr"
})
public class InType {

    protected String il;
    @XmlElement(name = "if", required = true)
    protected String _if;
    protected SoundType sound;
    protected String pr;

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIl(String value) {
        this.il = value;
    }

    /**
     * Gets the value of the if property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIf() {
        return _if;
    }

    /**
     * Sets the value of the if property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIf(String value) {
        this._if = value;
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

}
