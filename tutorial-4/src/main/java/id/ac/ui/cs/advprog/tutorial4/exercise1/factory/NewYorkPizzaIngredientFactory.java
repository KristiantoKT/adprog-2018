package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.ReggianoCheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FreshClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThinCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.MarinaraSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Garlic;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Mushroom;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Onion;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.RedPepper;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
