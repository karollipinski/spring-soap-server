//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.03 at 02:45:33 PM CET 
//


package net.atos.xml.pizzeria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pizza" type="{http://www.atos.net/xml/pizzeria}Pizza"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pizza"
})
@XmlRootElement(name = "PizzaDetailsResponse")
public class PizzaDetailsResponse {

    @XmlElement(name = "Pizza", required = true)
    protected Pizza pizza;

    /**
     * Gets the value of the pizza property.
     * 
     * @return
     *     possible object is
     *     {@link Pizza }
     *     
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * Sets the value of the pizza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pizza }
     *     
     */
    public void setPizza(Pizza value) {
        this.pizza = value;
    }

}
