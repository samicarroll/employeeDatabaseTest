package TestCases;

import JobApplication.businessLogic;
import JobApplication.employeeData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testingChangeNumber {
    JobApplication.businessLogic businessLogic = new businessLogic();
    JobApplication.employeeData employeeData = new employeeData();
    @Test
    public void testChangeNumber(){
        String newNum = "941-555-1234";
        String oldNum = "239-555-1234";
        employeeData.setNewNumber(newNum);
        employeeData.setPhoneNumber(oldNum);
        Assert.assertEquals(newNum, businessLogic.changePhoneNumber(employeeData, newNum), "Phone Numbers Do Not Match");
    }
    @Test
    public void testSameNumber() {
        String newNum = "941-555-1234";
        String oldNum = "941-555-1234";
        employeeData.setNewNumber(newNum);
        employeeData.setPhoneNumber(oldNum);
        Assert.assertEquals(newNum, businessLogic.changePhoneNumber(employeeData, newNum), "Phone Numbers Do Not Match");
    }
    @Test
    public void testOldNumber() {
        String newNum = "941-555-1234";
        String oldNum = "999-555-1234";
        employeeData.setNewNumber(newNum);
        employeeData.setPhoneNumber(oldNum);
        Assert.assertEquals(oldNum, businessLogic.changePhoneNumber(employeeData, oldNum), "Phone Numbers Do Not Match");
    }
}
