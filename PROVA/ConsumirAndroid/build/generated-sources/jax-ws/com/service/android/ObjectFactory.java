
package com.service.android;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.android package. 
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

    private final static QName _ChecarandroidResponse_QNAME = new QName("http://android.service.com/", "checarandroidResponse");
    private final static QName _Checarandroid_QNAME = new QName("http://android.service.com/", "checarandroid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.android
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChecarandroidResponse }
     * 
     */
    public ChecarandroidResponse createChecarandroidResponse() {
        return new ChecarandroidResponse();
    }

    /**
     * Create an instance of {@link Checarandroid }
     * 
     */
    public Checarandroid createChecarandroid() {
        return new Checarandroid();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChecarandroidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://android.service.com/", name = "checarandroidResponse")
    public JAXBElement<ChecarandroidResponse> createChecarandroidResponse(ChecarandroidResponse value) {
        return new JAXBElement<ChecarandroidResponse>(_ChecarandroidResponse_QNAME, ChecarandroidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checarandroid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://android.service.com/", name = "checarandroid")
    public JAXBElement<Checarandroid> createChecarandroid(Checarandroid value) {
        return new JAXBElement<Checarandroid>(_Checarandroid_QNAME, Checarandroid.class, null, value);
    }

}
