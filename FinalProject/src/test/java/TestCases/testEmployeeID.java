package TestCases;

import JobApplication.employeeData;
import JobApplication.businessLogic;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testEmployeeID {
    JobApplication.businessLogic businessLogic = new businessLogic();
    employeeData employeeData = new employeeData();
    @Test
    public void testCalculateEmpIDWithValidInput() {
        employeeData.setFirstName("Nick");
        employeeData.setLastName("Haug");
        employeeData.setDateOfBirth("08/15/1995");

        String empID = businessLogic.calculateEmpID(employeeData);
        Assert.assertEquals("NHaug-1995", empID);
    }

    @Test
    public void testCalculateEmpIDWithValidInput2() {
        employeeData.setFirstName("Sami");
        employeeData.setLastName("Carroll");
        employeeData.setDateOfBirth("07/12/2001");

        String empID = businessLogic.calculateEmpID(employeeData);
        Assert.assertEquals("SCarroll-2001", empID);
    }

    @Test
    public void testCalculateEmpIDWithValidInput3() {
        employeeData.setFirstName("Ethan");
        employeeData.setLastName("Kramer");
        employeeData.setDateOfBirth("05/29/1999");

        String empID = businessLogic.calculateEmpID(employeeData);
        Assert.assertEquals("EKramer-1999", empID);
    }

}
