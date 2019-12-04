package net.atos.springsoapserver;

import net.atos.xml.pizzeria.Pizza;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class PizzaRepository {
    private static final Map<String, Pizza> PIZZA = new HashMap<>();

    @PostConstruct
    public void initData() {

        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.getIngredients()
             .addAll(Arrays.asList("sos", "ser mozzarella", "pieczarki", "oregano"));
        pizza.setSauce("sos czosnkowy");
        pizza.setPrice(22L);
        pizza.setCurrency("PLN");

        PIZZA.put(pizza.getName(), pizza);

        pizza = new Pizza();
        pizza.setName("Napoli");
        pizza.getIngredients()
             .addAll(Arrays.asList("sos", "ser mozzarella", "oliwki", "oregano"));
        pizza.setSauce("sos czosnkowy");
        pizza.setPrice(20L);
        pizza.setCurrency("PLN");

        PIZZA.put(pizza.getName(), pizza);

        pizza = new Pizza();
        pizza.setName("Peperoni");
        pizza.getIngredients()
             .addAll(Arrays.asList("sos", "ser mozzarella", "kiełbaska peperoni", "oregano"));
        pizza.setSauce("sos chili");
        pizza.setPrice(28L);
        pizza.setCurrency("PLN");

        PIZZA.put(pizza.getName(), pizza);

        pizza = new Pizza();
        pizza.setName("Mięsna");
        pizza.getIngredients()
             .addAll(Arrays.asList("sos", "ser mozzarella", "szynka", "bekon", "oregano"));
        pizza.setSauce("kethup");
        pizza.setPrice(25L);
        pizza.setCurrency("PLN");

        PIZZA.put(pizza.getName(), pizza);

        pizza = new Pizza();
        pizza.setName("Hawajska");
        pizza.getIngredients()
             .addAll(Arrays.asList("sos", "ser mozzarella", "szynka", "ananas", "oregano"));
        pizza.setSauce("sos słodko-kwaśny");
        pizza.setPrice(24L);
        pizza.setCurrency("PLN");

        PIZZA.put(pizza.getName(), pizza);

    }

    public Pizza findPizza(String name) {
        Assert.notNull(name, "The Pizza's name must not be null");
        return PIZZA.get(name);
    }
}