package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class UiUxDesigner extends Employees {
    static final double MINSALARY = 90000.00;
    
    public UiUxDesigner(String name, double salary) {
        this.name = name;
        this.role = "UI/UX Designer";
        if (salary < MINSALARY) {
            throw new IllegalArgumentException();
        } else {
            this.salary = salary;
        }
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
