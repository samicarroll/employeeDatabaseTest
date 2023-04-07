package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import JobApplication.employeeData;
import JobApplication.businessLogic;

public class testCalculatingSalary {
    JobApplication.businessLogic businessLogic = new businessLogic();
    employeeData employeeData = new employeeData();

    @Test
    public void testCalculateYearlySalary1(){
        employeeData.setFirstName("Nicholas");
        employeeData.setLastName("Haug");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(5598.43);

        double salary = businessLogic.calculateYearlySalary(employeeData);
        Assert.assertEquals(67181.16, salary, "Incorrect salary");
    }

    @Test
    public void testCalculateYearlySalary2(){
        employeeData.setFirstName("Sami");
        employeeData.setLastName("Carroll");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(1000.4);

        double salary = businessLogic.calculateYearlySalary(employeeData);
        Assert.assertEquals(12004.8, salary, "Incorrect salary");
    }

    @Test
    public void testCalculateYearlySalary3(){
        employeeData.setFirstName("Ethan");
        employeeData.setLastName("Kramer");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(3000.4);

        double salary = businessLogic.calculateYearlySalary(employeeData);
        Assert.assertEquals(36004.8, salary, "Incorrect salary");
    }
}
