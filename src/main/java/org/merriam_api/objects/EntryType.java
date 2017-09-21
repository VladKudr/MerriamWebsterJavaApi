
package org.merriam_api.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hw" type="{}hwType"/>
 *         &lt;element name="sound" type="{}soundType" minOccurs="0"/>
 *         &lt;element name="pr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u02c8go\u028a"/>
 *               &lt;enumeration value="\u02c8gow\u0259\u02cch\u025bd"/>
 *               &lt;enumeration value="\u02c8gow\u0259\u02ccra\u028and"/>
 *               &lt;enumeration value="\u02c8go\u028ab\u0259\u02cctwi:n"/>
 *               &lt;enumeration value="\u02c8go\u028a\u02c8g\u025bt\u025a"/>
 *               &lt;enumeration value="\u02c8go\u028a\u02ccgo\u028a"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="altpr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u02c8go\u028a"/>
 *               &lt;enumeration value="\u02c8gow\u0259\u02cch\u025bd"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="verb"/>
 *               &lt;enumeration value="noun"/>
 *               &lt;enumeration value="adjective"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="in" type="{}inType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="def" type="{}defType" minOccurs="0"/>
 *         &lt;element name="dro" type="{}droType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dx" type="{}dxType" minOccurs="0"/>
 *         &lt;element name="cx" type="{}cxType" minOccurs="0"/>
 *         &lt;element name="dxnl" type="{}dxnlType" minOccurs="0"/>
 *         &lt;element name="uro" type="{}uroType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryType", propOrder = {
    "hw",
    "sound",
    "pr",
    "altpr",
    "fl",
    "in",
    "lb",
    "def",
    "dro",
    "dx",
    "cx",
    "dxnl",
    "uro"
})
public class EntryType {

    @XmlElement(required = true)
    protected HwType hw;
    protected SoundType sound;
    protected String pr;
    protected String altpr;
    protected String fl;
    protected List<InType> in;
    protected String lb;
    protected DefType def;
    protected List<DroType> dro;
    protected DxType dx;
    protected CxType cx;
    protected DxnlType dxnl;
    protected UroType uro;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the hw property.
     * 
     * @return
     *     possible object is
     *     {@link HwType }
     *     
     */
    public HwType getHw() {
        return hw;
    }

    /**
     * Sets the value of the hw property.
     * 
     * @param value
     *     allowed object is
     *     {@link HwType }
     *     
     */
    public void setHw(HwType value) {
        this.hw = value;
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
     * Gets the value of the altpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltpr() {
        return altpr;
    }

    /**
     * Sets the value of the altpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltpr(String value) {
        this.altpr = value;
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
     * Gets the value of the in property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the in property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InType }
     * 
     * 
     */
    public List<InType> getIn() {
        if (in == null) {
            in = new ArrayList<InType>();
        }
        return this.in;
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
     * Gets the value of the def property.
     * 
     * @return
     *     possible object is
     *     {@link DefType }
     *     
     */
    public DefType getDef() {
        return def;
    }

    /**
     * Sets the value of the def property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefType }
     *     
     */
    public void setDef(DefType value) {
        this.def = value;
    }

    /**
     * Gets the value of the dro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DroType }
     * 
     * 
     */
    public List<DroType> getDro() {
        if (dro == null) {
            dro = new ArrayList<DroType>();
        }
        return this.dro;
    }

    /**
     * Gets the value of the dx property.
     * 
     * @return
     *     possible object is
     *     {@link DxType }
     *     
     */
    public DxType getDx() {
        return dx;
    }

    /**
     * Sets the value of the dx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DxType }
     *     
     */
    public void setDx(DxType value) {
        this.dx = value;
    }

    /**
     * Gets the value of the cx property.
     * 
     * @return
     *     possible object is
     *     {@link CxType }
     *     
     */
    public CxType getCx() {
        return cx;
    }

    /**
     * Sets the value of the cx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxType }
     *     
     */
    public void setCx(CxType value) {
        this.cx = value;
    }

    /**
     * Gets the value of the dxnl property.
     * 
     * @return
     *     possible object is
     *     {@link DxnlType }
     *     
     */
    public DxnlType getDxnl() {
        return dxnl;
    }

    /**
     * Sets the value of the dxnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DxnlType }
     *     
     */
    public void setDxnl(DxnlType value) {
        this.dxnl = value;
    }

    /**
     * Gets the value of the uro property.
     * 
     * @return
     *     possible object is
     *     {@link UroType }
     *     
     */
    public UroType getUro() {
        return uro;
    }

    /**
     * Sets the value of the uro property.
     * 
     * @param value
     *     allowed object is
     *     {@link UroType }
     *     
     */
    public void setUro(UroType value) {
        this.uro = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
