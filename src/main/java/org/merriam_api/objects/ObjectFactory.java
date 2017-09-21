
package org.merriam_api.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.merriam_api.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EntryList_QNAME = new QName("", "entry_list");
    private final static QName _DefTypeSdVi_QNAME = new QName("", "vi");
    private final static QName _DefTypeSdDx_QNAME = new QName("", "dx");
    private final static QName _DefTypeSdSx_QNAME = new QName("", "sx");
    private final static QName _DefTypeSdWsgram_QNAME = new QName("", "wsgram");
    private final static QName _DefTypeSdUn_QNAME = new QName("", "un");
    private final static QName _DefTypeSdIt_QNAME = new QName("", "it");
    private final static QName _DefTypeSdSnote_QNAME = new QName("", "snote");
    private final static QName _ViTypePhrase_QNAME = new QName("", "phrase");
    private final static QName _DefTypeDt_QNAME = new QName("", "dt");
    private final static QName _DefTypeSd_QNAME = new QName("", "sd");
    private final static QName _DefTypeGram_QNAME = new QName("", "gram");
    private final static QName _DefTypeSlb_QNAME = new QName("", "slb");
    private final static QName _DefTypeSl_QNAME = new QName("", "sl");
    private final static QName _DefTypeSn_QNAME = new QName("", "sn");
    private final static QName _DefTypePhrasev_QNAME = new QName("", "phrasev");
    private final static QName _DefTypeSsl_QNAME = new QName("", "ssl");
    private final static QName _DefTypeSgram_QNAME = new QName("", "sgram");
    private final static QName _DxTypeDxt_QNAME = new QName("", "dxt");
    private final static QName _DxTypeTag_QNAME = new QName("", "tag");
    private final static QName _PhrasevTypePvl_QNAME = new QName("", "pvl");
    private final static QName _PhrasevTypePva_QNAME = new QName("", "pva");
    private final static QName _DxtTypeDxn_QNAME = new QName("", "dxn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.merriam_api.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DefType }
     * 
     */
    public DefType createDefType() {
        return new DefType();
    }

    /**
     * Create an instance of {@link EntryListType }
     * 
     */
    public EntryListType createEntryListType() {
        return new EntryListType();
    }

    /**
     * Create an instance of {@link DroType }
     * 
     */
    public DroType createDroType() {
        return new DroType();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link SnoteType }
     * 
     */
    public SnoteType createSnoteType() {
        return new SnoteType();
    }

    /**
     * Create an instance of {@link HwType }
     * 
     */
    public HwType createHwType() {
        return new HwType();
    }

    /**
     * Create an instance of {@link DtType }
     * 
     */
    public DtType createDtType() {
        return new DtType();
    }

    /**
     * Create an instance of {@link DxtType }
     * 
     */
    public DxtType createDxtType() {
        return new DxtType();
    }

    /**
     * Create an instance of {@link ViType }
     * 
     */
    public ViType createViType() {
        return new ViType();
    }

    /**
     * Create an instance of {@link DxType }
     * 
     */
    public DxType createDxType() {
        return new DxType();
    }

    /**
     * Create an instance of {@link UroType }
     * 
     */
    public UroType createUroType() {
        return new UroType();
    }

    /**
     * Create an instance of {@link PhrasevType }
     * 
     */
    public PhrasevType createPhrasevType() {
        return new PhrasevType();
    }

    /**
     * Create an instance of {@link UnType }
     * 
     */
    public UnType createUnType() {
        return new UnType();
    }

    /**
     * Create an instance of {@link UtxtType }
     * 
     */
    public UtxtType createUtxtType() {
        return new UtxtType();
    }

    /**
     * Create an instance of {@link VrType }
     * 
     */
    public VrType createVrType() {
        return new VrType();
    }

    /**
     * Create an instance of {@link DxnlType }
     * 
     */
    public DxnlType createDxnlType() {
        return new DxnlType();
    }

    /**
     * Create an instance of {@link InType }
     * 
     */
    public InType createInType() {
        return new InType();
    }

    /**
     * Create an instance of {@link CxType }
     * 
     */
    public CxType createCxType() {
        return new CxType();
    }

    /**
     * Create an instance of {@link SoundType }
     * 
     */
    public SoundType createSoundType() {
        return new SoundType();
    }

    /**
     * Create an instance of {@link DefType.Ssl }
     * 
     */
    public DefType.Ssl createDefTypeSsl() {
        return new DefType.Ssl();
    }

    /**
     * Create an instance of {@link DefType.Sd }
     * 
     */
    public DefType.Sd createDefTypeSd() {
        return new DefType.Sd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry_list")
    public JAXBElement<EntryListType> createEntryList(EntryListType value) {
        return new JAXBElement<EntryListType>(_EntryList_QNAME, EntryListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = DefType.Sd.class)
    public JAXBElement<ViType> createDefTypeSdVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dx", scope = DefType.Sd.class)
    public JAXBElement<DxType> createDefTypeSdDx(DxType value) {
        return new JAXBElement<DxType>(_DefTypeSdDx_QNAME, DxType.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sx", scope = DefType.Sd.class)
    public JAXBElement<String> createDefTypeSdSx(String value) {
        return new JAXBElement<String>(_DefTypeSdSx_QNAME, String.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wsgram", scope = DefType.Sd.class)
    public JAXBElement<String> createDefTypeSdWsgram(String value) {
        return new JAXBElement<String>(_DefTypeSdWsgram_QNAME, String.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "un", scope = DefType.Sd.class)
    public JAXBElement<UnType> createDefTypeSdUn(UnType value) {
        return new JAXBElement<UnType>(_DefTypeSdUn_QNAME, UnType.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = DefType.Sd.class)
    public JAXBElement<String> createDefTypeSdIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snote", scope = DefType.Sd.class)
    public JAXBElement<SnoteType> createDefTypeSdSnote(SnoteType value) {
        return new JAXBElement<SnoteType>(_DefTypeSdSnote_QNAME, SnoteType.class, DefType.Sd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phrase", scope = ViType.class)
    public JAXBElement<String> createViTypePhrase(String value) {
        return new JAXBElement<String>(_ViTypePhrase_QNAME, String.class, ViType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = ViType.class)
    public JAXBElement<String> createViTypeIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, ViType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dt", scope = DefType.class)
    public JAXBElement<DtType> createDefTypeDt(DtType value) {
        return new JAXBElement<DtType>(_DefTypeDt_QNAME, DtType.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefType.Sd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sd", scope = DefType.class)
    public JAXBElement<DefType.Sd> createDefTypeSd(DefType.Sd value) {
        return new JAXBElement<DefType.Sd>(_DefTypeSd_QNAME, DefType.Sd.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gram", scope = DefType.class)
    public JAXBElement<String> createDefTypeGram(String value) {
        return new JAXBElement<String>(_DefTypeGram_QNAME, String.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "slb", scope = DefType.class)
    public JAXBElement<String> createDefTypeSlb(String value) {
        return new JAXBElement<String>(_DefTypeSlb_QNAME, String.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sl", scope = DefType.class)
    public JAXBElement<String> createDefTypeSl(String value) {
        return new JAXBElement<String>(_DefTypeSl_QNAME, String.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sn", scope = DefType.class)
    public JAXBElement<String> createDefTypeSn(String value) {
        return new JAXBElement<String>(_DefTypeSn_QNAME, String.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhrasevType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phrasev", scope = DefType.class)
    public JAXBElement<PhrasevType> createDefTypePhrasev(PhrasevType value) {
        return new JAXBElement<PhrasevType>(_DefTypePhrasev_QNAME, PhrasevType.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefType.Ssl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ssl", scope = DefType.class)
    public JAXBElement<DefType.Ssl> createDefTypeSsl(DefType.Ssl value) {
        return new JAXBElement<DefType.Ssl>(_DefTypeSsl_QNAME, DefType.Ssl.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sgram", scope = DefType.class)
    public JAXBElement<String> createDefTypeSgram(String value) {
        return new JAXBElement<String>(_DefTypeSgram_QNAME, String.class, DefType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DxtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dxt", scope = DxType.class)
    public JAXBElement<DxtType> createDxTypeDxt(DxtType value) {
        return new JAXBElement<DxtType>(_DxTypeDxt_QNAME, DxtType.class, DxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tag", scope = DxType.class)
    public JAXBElement<String> createDxTypeTag(String value) {
        return new JAXBElement<String>(_DxTypeTag_QNAME, String.class, DxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = PhrasevType.class)
    public JAXBElement<ViType> createPhrasevTypeVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dx", scope = PhrasevType.class)
    public JAXBElement<DxType> createPhrasevTypeDx(DxType value) {
        return new JAXBElement<DxType>(_DefTypeSdDx_QNAME, DxType.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sx", scope = PhrasevType.class)
    public JAXBElement<String> createPhrasevTypeSx(String value) {
        return new JAXBElement<String>(_DefTypeSdSx_QNAME, String.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wsgram", scope = PhrasevType.class)
    public JAXBElement<String> createPhrasevTypeWsgram(String value) {
        return new JAXBElement<String>(_DefTypeSdWsgram_QNAME, String.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pvl", scope = PhrasevType.class)
    public JAXBElement<String> createPhrasevTypePvl(String value) {
        return new JAXBElement<String>(_PhrasevTypePvl_QNAME, String.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "un", scope = PhrasevType.class)
    public JAXBElement<UnType> createPhrasevTypeUn(UnType value) {
        return new JAXBElement<UnType>(_DefTypeSdUn_QNAME, UnType.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pva", scope = PhrasevType.class)
    public JAXBElement<String> createPhrasevTypePva(String value) {
        return new JAXBElement<String>(_PhrasevTypePva_QNAME, String.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = PhrasevType.class)
    public JAXBElement<String> createPhrasevTypeIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snote", scope = PhrasevType.class)
    public JAXBElement<SnoteType> createPhrasevTypeSnote(SnoteType value) {
        return new JAXBElement<SnoteType>(_DefTypeSdSnote_QNAME, SnoteType.class, PhrasevType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = DtType.class)
    public JAXBElement<ViType> createDtTypeVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dx", scope = DtType.class)
    public JAXBElement<DxType> createDtTypeDx(DxType value) {
        return new JAXBElement<DxType>(_DefTypeSdDx_QNAME, DxType.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sx", scope = DtType.class)
    public JAXBElement<String> createDtTypeSx(String value) {
        return new JAXBElement<String>(_DefTypeSdSx_QNAME, String.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wsgram", scope = DtType.class)
    public JAXBElement<String> createDtTypeWsgram(String value) {
        return new JAXBElement<String>(_DefTypeSdWsgram_QNAME, String.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "un", scope = DtType.class)
    public JAXBElement<UnType> createDtTypeUn(UnType value) {
        return new JAXBElement<UnType>(_DefTypeSdUn_QNAME, UnType.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = DtType.class)
    public JAXBElement<String> createDtTypeIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snote", scope = DtType.class)
    public JAXBElement<SnoteType> createDtTypeSnote(SnoteType value) {
        return new JAXBElement<SnoteType>(_DefTypeSdSnote_QNAME, SnoteType.class, DtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dxt", scope = DxnlType.class)
    public JAXBElement<String> createDxnlTypeDxt(String value) {
        return new JAXBElement<String>(_DxTypeDxt_QNAME, String.class, DxnlType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tag", scope = DxnlType.class)
    public JAXBElement<String> createDxnlTypeTag(String value) {
        return new JAXBElement<String>(_DxTypeTag_QNAME, String.class, DxnlType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = DefType.Ssl.class)
    public JAXBElement<ViType> createDefTypeSslVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dx", scope = DefType.Ssl.class)
    public JAXBElement<DxType> createDefTypeSslDx(DxType value) {
        return new JAXBElement<DxType>(_DefTypeSdDx_QNAME, DxType.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sx", scope = DefType.Ssl.class)
    public JAXBElement<String> createDefTypeSslSx(String value) {
        return new JAXBElement<String>(_DefTypeSdSx_QNAME, String.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wsgram", scope = DefType.Ssl.class)
    public JAXBElement<String> createDefTypeSslWsgram(String value) {
        return new JAXBElement<String>(_DefTypeSdWsgram_QNAME, String.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "un", scope = DefType.Ssl.class)
    public JAXBElement<UnType> createDefTypeSslUn(UnType value) {
        return new JAXBElement<UnType>(_DefTypeSdUn_QNAME, UnType.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = DefType.Ssl.class)
    public JAXBElement<String> createDefTypeSslIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snote", scope = DefType.Ssl.class)
    public JAXBElement<SnoteType> createDefTypeSslSnote(SnoteType value) {
        return new JAXBElement<SnoteType>(_DefTypeSdSnote_QNAME, SnoteType.class, DefType.Ssl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = UnType.class)
    public JAXBElement<ViType> createUnTypeVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, UnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phrase", scope = UnType.class)
    public JAXBElement<String> createUnTypePhrase(String value) {
        return new JAXBElement<String>(_ViTypePhrase_QNAME, String.class, UnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = UnType.class)
    public JAXBElement<String> createUnTypeIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, UnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vi", scope = SnoteType.class)
    public JAXBElement<ViType> createSnoteTypeVi(ViType value) {
        return new JAXBElement<ViType>(_DefTypeSdVi_QNAME, ViType.class, SnoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phrase", scope = SnoteType.class)
    public JAXBElement<String> createSnoteTypePhrase(String value) {
        return new JAXBElement<String>(_ViTypePhrase_QNAME, String.class, SnoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = SnoteType.class)
    public JAXBElement<String> createSnoteTypeIt(String value) {
        return new JAXBElement<String>(_DefTypeSdIt_QNAME, String.class, SnoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dxn", scope = DxtType.class)
    public JAXBElement<String> createDxtTypeDxn(String value) {
        return new JAXBElement<String>(_DxtTypeDxn_QNAME, String.class, DxtType.class, value);
    }

}
