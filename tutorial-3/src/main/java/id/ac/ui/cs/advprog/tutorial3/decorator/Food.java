package id.ac.ui.cs.advprog.tutorial3.decorator;

public abstract class Food {
    protected String description = "Unidentified Food";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
