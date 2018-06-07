package id.ac.ui.cs.advprog.tutorial2.exercise2;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

@DisplayName("A CaffeineBeverage object")
class CaffeineBeverageTest {

    private CaffeineBeverage beverage;

    @BeforeEach
    void setUp() {
        beverage = spy(new CaffeineBeverage() {

            @Override
            protected void addCondiments() {
                // Do nothing
            }

            @Override
            protected void brew() {
                // Do nothing
            }
        });
    }

    @Test
    @DisplayName("follows the same recipe (algorithm) described in the book")
    void testPrepareRecipeFollowsAlgorithmInTheBook() {
        InOrder inOrder = inOrder(beverage);

        beverage.prepareRecipe();

        inOrder.verify(beverage).boilWater();
        inOrder.verify(beverage).brew();
        inOrder.verify(beverage).pourInCup();
        inOrder.verify(beverage).addCondiments();
        inOrder.verifyNoMoreInteractions();
    }
}