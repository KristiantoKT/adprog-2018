package id.ac.ui.cs.advprog.tutorial4.exercise1;

import static org.junit.Assert.assertTrue;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.CheesePizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.ClamPizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.VeggiePizza;
import org.junit.Before;
import org.junit.Test;

public class DepokPizzaStoreTest {
    protected PizzaStore pizzaStore;
    protected Pizza pizza;

    @Before
    public void setUp() throws Exception {
        pizzaStore = new DepokPizzaStore();
    }

    @Test
    public void testOrderPizza() {
        pizza = pizzaStore.orderPizza("cheese");
        assertTrue(pizza instanceof CheesePizza);

        pizza = pizzaStore.orderPizza("clam");
        assertTrue(pizza instanceof ClamPizza);

        pizza = pizzaStore.orderPizza("veggie");
        assertTrue(pizza instanceof VeggiePizza);
    }
}