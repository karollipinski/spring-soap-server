//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.03 at 02:45:33 PM CET 
//


package net.atos.xml.pizzeria;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.atos.xml.pizzeria package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.atos.xml.pizzeria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PizzaDetailsRequest }
     * 
     */
    public PizzaDetailsRequest createPizzaDetailsRequest() {
        return new PizzaDetailsRequest();
    }

    /**
     * Create an instance of {@link PizzaDetailsResponse }
     * 
     */
    public PizzaDetailsResponse createPizzaDetailsResponse() {
        return new PizzaDetailsResponse();
    }

    /**
     * Create an instance of {@link Pizza }
     * 
     */
    public Pizza createPizza() {
        return new Pizza();
    }

}