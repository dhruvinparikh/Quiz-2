
package my.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.client package. 
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

    private final static QName _ReverseStringResponse_QNAME = new QName("http://service.my/", "reverseStringResponse");
    private final static QName _ReverseString_QNAME = new QName("http://service.my/", "reverseString");
    private final static QName _CamelCase_QNAME = new QName("http://service.my/", "camelCase");
    private final static QName _CamelCaseResponse_QNAME = new QName("http://service.my/", "camelCaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReverseString }
     * 
     */
    public ReverseString createReverseString() {
        return new ReverseString();
    }

    /**
     * Create an instance of {@link ReverseStringResponse }
     * 
     */
    public ReverseStringResponse createReverseStringResponse() {
        return new ReverseStringResponse();
    }

    /**
     * Create an instance of {@link CamelCaseResponse }
     * 
     */
    public CamelCaseResponse createCamelCaseResponse() {
        return new CamelCaseResponse();
    }

    /**
     * Create an instance of {@link CamelCase }
     * 
     */
    public CamelCase createCamelCase() {
        return new CamelCase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.my/", name = "reverseStringResponse")
    public JAXBElement<ReverseStringResponse> createReverseStringResponse(ReverseStringResponse value) {
        return new JAXBElement<ReverseStringResponse>(_ReverseStringResponse_QNAME, ReverseStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.my/", name = "reverseString")
    public JAXBElement<ReverseString> createReverseString(ReverseString value) {
        return new JAXBElement<ReverseString>(_ReverseString_QNAME, ReverseString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CamelCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.my/", name = "camelCase")
    public JAXBElement<CamelCase> createCamelCase(CamelCase value) {
        return new JAXBElement<CamelCase>(_CamelCase_QNAME, CamelCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CamelCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.my/", name = "camelCaseResponse")
    public JAXBElement<CamelCaseResponse> createCamelCaseResponse(CamelCaseResponse value) {
        return new JAXBElement<CamelCaseResponse>(_CamelCaseResponse_QNAME, CamelCaseResponse.class, null, value);
    }

}
