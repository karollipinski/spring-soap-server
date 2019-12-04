package net.atos.springsoapserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    //http://localhost:8080/service/pizzaDetails.wsdl

    @Bean(name = "pizzaDetails")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {

        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PizzaDetailsPort");
        wsdl11Definition.setLocationUri("/service/pizza-details");
        wsdl11Definition.setTargetNamespace("http://www.atos.net/xml/pizzeria");
        wsdl11Definition.setSchema(schema);
        return wsdl11Definition;
    }

}
