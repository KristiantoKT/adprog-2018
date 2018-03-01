package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class SecurityExpert extends Employees {
    static final double MINSALARY = 70000.00;

    public SecurityExpert(String name, double salary) {
        this.name = name;
        this.role = "Security Expert";
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
