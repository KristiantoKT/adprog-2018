package id.ac.ui.cs.advprog.tutorial2.exercise2;

public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
