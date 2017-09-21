
package org.merriam_api.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phrasevType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phrasevType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="pva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="it">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="doing"/>
 *               &lt;enumeration value="to"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vi" type="{}viType"/>
 *         &lt;element name="un" type="{}unType"/>
 *         &lt;element name="dx" type="{}dxType"/>
 *         &lt;element name="snote" type="{}snoteType"/>
 *         &lt;element name="wsgram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="belong"/>
 *               &lt;enumeration value="steal"/>
 *               &lt;enumeration value="go-round"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pvl">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="or"/>
 *               &lt;enumeration value="go around (a place)"/>
 *               &lt;enumeration value="go around (something or someone)"/>
 *               &lt;enumeration value="go by (somewhere)"/>
 *               &lt;enumeration value="go without (something)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phrasevType", propOrder = {
    "content"
})
public class PhrasevType {

    @XmlElementRefs({
        @XmlElementRef(name = "wsgram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "snote", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "un", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pvl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pva", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sx", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dx", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "it", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link SnoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DxType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
