package com.example.jobapplicationtest;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testEmployeeData {
    businessLogic businessLogic = new businessLogic();
    employeeData employeeData = new employeeData();

    @Test
    public void testCalculateAppraisal() {
        employeeData.setFirstName("Sami");
        employeeData.setLastName("Carroll");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(4000.87);

        double appraisal = businessLogic.calculateAppraisal(employeeData);
        Assert.assertEquals(500, appraisal);
    }

    @Test
    public void testCalculateAppraisal1() {
        employeeData.setFirstName("Ethan");
        employeeData.setLastName("Kramer");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(10000.9);

        double appraisal = businessLogic.calculateAppraisal(employeeData);
        Assert.assertEquals(1000, appraisal);
    }

    @Test
    public void testCalculateYearlySalary(){
        employeeData.setFirstName("Nicholas");
        employeeData.setLastName("Haug");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(5598.43);

        double salary = businessLogic.calculateYearlySalary(employeeData);
        Assert.assertEquals(67181.16, salary);
    }
    @Test
    public void testCalculateYearlySalary1(){
        employeeData.setFirstName("Sami");
        employeeData.setLastName("Carroll");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(1000.4);

        double salary = businessLogic.calculateYearlySalary(employeeData);
        Assert.assertEquals(12004.8, salary);
    }

}
