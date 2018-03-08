package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        PizzaStore dpkStore = new DepokPizzaStore();

        pizza = dpkStore.orderPizza("cheese");
        System.out.println("John ordered a " + pizza + "\n");

        pizza = dpkStore.orderPizza("clam");
        System.out.println("John ordered a " + pizza + "\n");

        pizza = dpkStore.orderPizza("veggie");
        System.out.println("John ordered a " + pizza + "\n");

    }
}
