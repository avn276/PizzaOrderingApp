package com.example.pizzaapp;

import com.example.pizzaapp.pizzas.BBQChicken;
import com.example.pizzaapp.pizzas.BuildYourOwn;
import com.example.pizzaapp.pizzas.Deluxe;
import com.example.pizzaapp.pizzas.Hawaiian;
import com.example.pizzaapp.pizzas.Margherita;
import com.example.pizzaapp.pizzas.Mexican;
import com.example.pizzaapp.pizzas.Supreme;
import com.example.pizzaapp.pizzas.Meatzza;
import com.example.pizzaapp.pizzas.Seafood;
import com.example.pizzaapp.pizzas.Pepperoni;
import com.example.pizzaapp.pizzas.Pizza;
import com.example.pizzaapp.pizzas.Veggie;

/**
 * PizzaMaker is a utility class for creating various pizza objects based on the specified pizza type.
 */
public class PizzaMaker {


    /**
     * Creates a pizza object based on the specified pizza type.
     *
     * @param pizzaType The type of pizza to create.
     * @return A pizza object of the specified type.
     * @throws IllegalArgumentException If the provided pizza type is unknown.
     */

    public static Pizza createPizza(String pizzaType) {
        switch (pizzaType) {
            case "BYO":
                return new BuildYourOwn();
            case "Hawaiian":
                return new Hawaiian();
            case "Supreme":
                return new Supreme();
            case "Meatzza":
                return new Meatzza();
            case "Seafood":
                return new Seafood();
            case "Pepperoni":
                return new Pepperoni();
            case "BBQ Chicken":
                return new BBQChicken();
            case "Deluxe":
                return new Deluxe();
            case "Margherita":
                return new Margherita();
            case "Veggie":
                return new Veggie();
            case "Mexican":
                return new Mexican();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        }
    }
}
