package net.atos.springsoapserver;

import lombok.AllArgsConstructor;
import net.atos.xml.pizzeria.PizzaDetailsRequest;
import net.atos.xml.pizzeria.PizzaDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@AllArgsConstructor
public class PizzaEndpoint {

    private static final String NAMESPACE_URI = "htttp://www.atos.net/xml/pizzeria";

    private PizzaRepository pizzaRepository;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PizzaDetailsRequest")
    @ResponsePayload
    public PizzaDetailsResponse getPizza(@RequestPayload PizzaDetailsRequest request){

        PizzaDetailsResponse  detailsResponse= new PizzaDetailsResponse();
        // wywołanie serisku zwracającego dane
        // wykonie logiki biznesowej

        detailsResponse.setPizza(pizzaRepository.findPizza(request.getName()));

        return detailsResponse;

    }

}
