package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class FrontendProgrammer extends Employees {
    static final double MINSALARY = 30000.00;

    public FrontendProgrammer(String name, double salary) {
        this.name = name;
        this.role = "Front End Programmer";
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
