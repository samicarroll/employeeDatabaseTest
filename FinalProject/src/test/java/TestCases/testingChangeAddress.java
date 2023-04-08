package TestCases;

import JobApplication.businessLogic;
import JobApplication.employeeData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testingChangeAddress {
    JobApplication.businessLogic businessLogic = new businessLogic();
    JobApplication.employeeData employeeData = new employeeData();

    @Test
    public void testChangeAddress() {
        String newAddress = "2005 Price Blvd";
        String oldAddress = "2004 Price Blvd";
        employeeData.setNewStreetAddress(newAddress);
        employeeData.setStreetAddress(oldAddress);
        Assert.assertEquals(newAddress, businessLogic.changeStreetAddress(employeeData, newAddress), "Addresses Do Not Match");
    }

    @Test
    public void testSameAddress() {
        String newAddress = "2005 Price Blvd";
        String oldAddress = "2005 Price Blvd";
        employeeData.setNewStreetAddress(newAddress);
        employeeData.setStreetAddress(oldAddress);
        Assert.assertEquals(newAddress, businessLogic.changeStreetAddress(employeeData, newAddress), "Addresses Do Not Match");
    }

    @Test
    public void testOldAddress() {
        String newAddress = "2005 Price Blvd";
        String oldAddress = "2004 Price Blvd";
        employeeData.setNewStreetAddress(newAddress);
        employeeData.setStreetAddress(oldAddress);
        Assert.assertEquals(oldAddress, businessLogic.changeStreetAddress(employeeData, oldAddress), "Addresses Do Not Match");
    }
}
