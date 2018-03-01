package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class NetworkExpert extends Employees {
    static final double MINSALARY = 50000.00;

    public NetworkExpert(String name, double salary) {
        this.name = name;
        this.role = "Network Expert";
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
