package TestCases;

import JobApplication.businessLogic;
import JobApplication.employeeData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testContactInfo {
    JobApplication.businessLogic businessLogic = new businessLogic();
    JobApplication.employeeData employeeData = new employeeData();

    @Test
    public void testFirstName(){
        String firstName = "Ethan";
        employeeData.setFirstName(firstName);
        Assert.assertEquals(firstName, employeeData.getFirstName(), "First names do not match");
    }

    @Test
    public void testLastName(){
        String lastName = "Kramer";
        employeeData.setLastName(lastName);
        Assert.assertEquals(lastName, employeeData.getLastName(), "Last names do not match");
    }

    @Test
    public void testPhoneNumber(){
        String number = "239-555-1234";
        employeeData.setPhoneNumber(number);
        Assert.assertEquals(number, employeeData.getPhoneNumber(), "Phone numbers do not match");
    }

}
