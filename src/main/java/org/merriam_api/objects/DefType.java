
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
 * <p>Java class for defType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="sn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="1 a"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sgram">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="no obj"/>
 *               &lt;enumeration value="a"/>
 *               &lt;enumeration value="count"/>
 *               &lt;enumeration value="more go�ahead; most go�ahead"/>
 *               &lt;enumeration value="Brit"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dt" type="{}dtType"/>
 *         &lt;element name="ssl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="it">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="doing"/>
 *                         &lt;enumeration value="to"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vi" type="{}viType"/>
 *                   &lt;element name="un" type="{}unType"/>
 *                   &lt;element name="dx" type="{}dxType"/>
 *                   &lt;element name="snote" type="{}snoteType"/>
 *                   &lt;element name="wsgram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sx">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="belong"/>
 *                         &lt;enumeration value="steal"/>
 *                         &lt;enumeration value="go-round"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="slb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="always followed by an adverb or preposition"/>
 *               &lt;enumeration value="no obj"/>
 *               &lt;enumeration value="not used in progressive tenses"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sl">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Brit"/>
 *               &lt;enumeration value="informal"/>
 *               &lt;enumeration value="US"/>
 *               &lt;enumeration value="chiefly US"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phrasev" type="{}phrasevType"/>
 *         &lt;element name="sd">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="it">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="doing"/>
 *                         &lt;enumeration value="to"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vi" type="{}viType"/>
 *                   &lt;element name="un" type="{}unType"/>
 *                   &lt;element name="dx" type="{}dxType"/>
 *                   &lt;element name="snote" type="{}snoteType"/>
 *                   &lt;element name="wsgram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sx">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="belong"/>
 *                         &lt;enumeration value="steal"/>
 *                         &lt;enumeration value="go-round"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defType", propOrder = {
    "snOrSgramOrDt"
})
public class DefType {

    @XmlElementRefs({
        @XmlElementRef(name = "sn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ssl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sgram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "phrasev", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "slb", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sl", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> snOrSgramOrDt;

    /**
     * Gets the value of the snOrSgramOrDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snOrSgramOrDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnOrSgramOrDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DefType.Ssl }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PhrasevType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefType.Sd }{@code >}
     * {@link JAXBElement }{@code <}{@link DtType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSnOrSgramOrDt() {
        if (snOrSgramOrDt == null) {
            snOrSgramOrDt = new ArrayList<JAXBElement<?>>();
        }
        return this.snOrSgramOrDt;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
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
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Sd {

        @XmlElementRefs({
            @XmlElementRef(name = "sx", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "it", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "un", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "wsgram", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dx", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "snote", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "vi", type = JAXBElement.class, required = false)
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
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link UnType }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link DxType }{@code >}
         * {@link JAXBElement }{@code <}{@link SnoteType }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link ViType }{@code >}
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
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
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Ssl {

        @XmlElementRefs({
            @XmlElementRef(name = "dx", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "vi", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sx", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "it", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "snote", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "wsgram", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "un", type = JAXBElement.class, required = false)
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
         * {@link JAXBElement }{@code <}{@link DxType }{@code >}
         * {@link JAXBElement }{@code <}{@link ViType }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link SnoteType }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link UnType }{@code >}
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

}
