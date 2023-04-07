package TestCases;

import JobApplication.employeeData;
import JobApplication.businessLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCalculatingClearance {
    JobApplication.businessLogic businessLogic = new businessLogic();
    employeeData employeeData = new employeeData();

    @Test
    public void testCalculateLevelNone(){
        employeeData.setYearsEmployed(1);
        String actual = businessLogic.calculateClearanceLevel(employeeData);
        String expected = "None";
        Assert.assertEquals(expected, actual, "Levels do not match");
    }

    @Test
    public void testCalculateLevel1(){
        employeeData.setYearsEmployed(6);
        String actual = businessLogic.calculateClearanceLevel(employeeData);
        String expected = "Level 1";
        String actualClearanceLevel = employeeData.getClearanceLevel();
        Assert.assertEquals(expected, actual, "Levels do not match");
    }

    @Test
    public void testCalculateLevel2(){
        employeeData.setYearsEmployed(10);
        String actual = businessLogic.calculateClearanceLevel(employeeData);
        String expected = "Level 2";
        Assert.assertEquals(expected, actual, "Levels do not match");
    }

}
