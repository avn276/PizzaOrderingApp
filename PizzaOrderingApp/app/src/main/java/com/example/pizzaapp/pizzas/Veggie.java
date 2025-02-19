package com.example.pizzaapp.pizzas;

import com.example.pizzaapp.BYOActivity;
import com.example.pizzaapp.enums.Sauce;
import com.example.pizzaapp.enums.Size;
import com.example.pizzaapp.enums.Toppings;

import java.util.ArrayList;

/**
 * Represents a Veggie pizza, a specific type of pizza with a selection of vegetarian toppings.
 * This class extends the abstract Pizza class, providing specific details and behaviors for Veggie pizzas.
 * Veggie pizzas have a base price, and additional charges may apply for larger sizes, extra cheese, and extra sauce.
 * The toppings include mushroom, black olive, onion, and green pepper, with tomato sauce as the default sauce.
 */

public class Veggie extends Pizza {
    private static final double VEGGIE_SMALL_PRICE = 11.99;

    /**
     * Constructs a Veggie pizza with default settings, including toppings and sauce.
     */
    public Veggie() {
        toppings = new ArrayList<>();
        sauce = Sauce.TOMATO;
        toppings.add(Toppings.MUSHROOM);
        toppings.add(Toppings.BLACKOLIVE);
        toppings.add(Toppings.ONION);
        toppings.add(Toppings.GREENPEPPER);
    }

    /**
     * Calculates the total price of the Veggie pizza based on size, toppings, and extras.
     *
     * @return The total price of the Veggie pizza.
     */
    @Override
    public double price() {
        double price = VEGGIE_SMALL_PRICE;
        if (size == Size.MEDIUM) {
            price += Size.MEDIUM.getPriceAdd();
        }
        if (size == Size.LARGE) {
            price += Size.LARGE.getPriceAdd();
        }
        if (extraCheese) {
            price++;
        }
        if (extraSauce) {
            price++;
        }
        return price;
    }
    /**
     * Sets the size of the Veggie pizza.
     *
     * @param newSize The new size of the Veggie pizza.
     */
    @Override
    public void setSize(Size newSize) {
        this.size = newSize;
    }

    /**
     * Adds a topping to the Veggie pizza. This method is not supported for Veggie pizzas.
     *
     * @param topping The topping to be added (not used).
     */
    @Override
    public void addToppings(Toppings topping) {

    }
    /**
     * Removes a topping from the Veggie pizza. This method is not supported for Veggie pizzas.
     *
     * @param topping The topping to be removed (not used).
     */
    @Override
    public void removeToppings(Toppings topping) {

    }
    /**
     * Provides a string representation of the Veggie pizza, including details such as toppings,
     * size, sauce, extras, and the total price.
     *
     * @return String representing the details of the Veggie pizza.
     */

    @Override
    public String toString() {
        String pizzaType = "[Veggie] ";
        String toppingsString = "";
        for (Toppings topping : toppings) {
            if (!toppingsString.isEmpty()) {
                toppingsString += ", ";
            }
            toppingsString += BYOActivity.capitalize(topping.name().toLowerCase());
        }
        String sizeString = ", " + size.toString().toLowerCase();
        String sauceString = ", " + sauce.toString().toLowerCase();
        String extraCheeseString = extraCheese ? ", extra cheese" : "";
        String extraSauceString = extraSauce ? ", extra sauce" : "";
        String priceString = " $" + String.format("%.2f", price());
        return pizzaType + toppingsString + sizeString + sauceString + extraCheeseString +
                extraSauceString + priceString;
    }

}
