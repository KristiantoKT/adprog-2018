package id.ac.ui.cs.advprog.tutorial3.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    protected List<Employees> employeesList;

    public Company() {
        employeesList = new ArrayList<Employees>();
    }

    public Company(List<Employees> employeesList) {
        Collections.copy(this.employeesList, employeesList);
    }

    public void addEmployee(Employees employees) {
        employeesList.add(employees);
    }

    public double getNetSalaries() {
        double netSalaries = 0.0;
        for (Employees employee : employeesList) {
            double tempSalaries = employee.getSalary();
            netSalaries += tempSalaries;
        }
        return netSalaries;
    }

    public List<Employees> getAllEmployees() {
        return employeesList;
    }
}
