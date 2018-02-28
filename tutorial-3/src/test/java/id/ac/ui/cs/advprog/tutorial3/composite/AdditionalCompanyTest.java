package id.ac.ui.cs.advprog.tutorial3.composite;

import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Ceo;
import id.ac.ui.cs.advprog.tutorial3.composite.techexpert.BackendProgrammer;

import org.junit.Before;
import org.junit.Test;

public class AdditionalCompanyTest {
    private Company company;

    @Before
    public void setUp() {
        company = new Company();
    }

    //Make sure you check that CEO Salary must not lower than 200000.00
    @Test(expected = IllegalArgumentException.class)
    public void ceoSalaryMustNotLowerThan200Million() {
        Ceo badSalaryCeo = new Ceo("Crocodile", 199000.00);
    }

    //Make sure you check that CTO Salary must not lower than 100000.00
    @Test(expected = IllegalArgumentException.class)
    public void ctoSalaryMustNotLowerThan100Million() {
        Cto badSalaryCto = new Cto("Alvida", 99000.00);
    }

    //Make sure you check that BackendProgrammer Salary must not lower than 20000.00
    @Test(expected = IllegalArgumentException.class)
    public void backendProgrammerSalaryMustNotLowerThan20Million() {
        BackendProgrammer badBackendProgrammer = new BackendProgrammer("Kuma", 19999.00);
    }

    //Make sure you check that FrontendProgrammer Salary must not lower than 30000.00
    @Test(expected = IllegalArgumentException.class)
    public void frontendProgrammerSalaryMustNotLowerThan30Million() {
        FrontendProgrammer badBackendProgrammer = new FrontendProgrammer("Hancock", 29999.00);
    }

    //Make sure you check that NetworkExpert Salary must not lower than 50000.00
    @Test(expected = IllegalArgumentException.class)
    public void networkExpertSalaryMustNotLowerThan50Million() {
        NetworkExpert badNetworkExpert = new NetworkExpert("Aokiji", 49999.00);
    }

    //Make sure you check that SecurityExpert Salary must not lower than 70000.00
    @Test(expected = IllegalArgumentException.class)
    public void securityExpertSalaryMustNotLowerThan70Million() {
        SecurityExpert badSecurityExpert = new SecurityExpert("Kizaru", 69999.00);
    }

    //Make sure you check that UiUxDesigner Salary must not lower than 90000.00
    @Test(expected = IllegalArgumentException.class)
    public void uiUxDesignerSalaryMustNotLowerThan90Million() {
        UiUxDesigner badUiUxDesigner = new UiUxDesigner("Rayleigh", 89999.00);
    }
}
