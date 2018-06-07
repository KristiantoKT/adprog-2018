package id.ac.ui.cs.advprog.tutorial3.composite;

public abstract class Employees {
    protected String name = "Unidentified Name";
    protected double salary;
    protected String role;

    public String getName() {
        return this.name;
    }

    public abstract double getSalary();

    public String getRole() {
        return this.role;
    }
}
