
package org.merriam_api.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for droType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="droType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vr" type="{}vrType" minOccurs="0"/>
 *         &lt;element name="gram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="def" type="{}defType" minOccurs="0"/>
 *         &lt;element name="dx" type="{}dxType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "droType", propOrder = {
    "dre",
    "vr",
    "gram",
    "def",
    "dx"
})
public class DroType {

    @XmlElement(required = true)
    protected String dre;
    protected VrType vr;
    protected String gram;
    protected DefType def;
    protected DxType dx;

    /**
     * Gets the value of the dre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDre() {
        return dre;
    }

    /**
     * Sets the value of the dre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDre(String value) {
        this.dre = value;
    }

    /**
     * Gets the value of the vr property.
     * 
     * @return
     *     possible object is
     *     {@link VrType }
     *     
     */
    public VrType getVr() {
        return vr;
    }

    /**
     * Sets the value of the vr property.
     * 
     * @param value
     *     allowed object is
     *     {@link VrType }
     *     
     */
    public void setVr(VrType value) {
        this.vr = value;
    }

    /**
     * Gets the value of the gram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGram() {
        return gram;
    }

    /**
     * Sets the value of the gram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGram(String value) {
        this.gram = value;
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

}
