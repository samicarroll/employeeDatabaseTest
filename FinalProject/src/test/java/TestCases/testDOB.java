package TestCases;
import JobApplication.employeeData;
import JobApplication.businessLogic;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testDOB {
    @Test
    public void testCalculateAge() {
        businessLogic logic = new businessLogic();
        employeeData employee = new employeeData();
        employee.setFirstName("Nick");
        employee.setLastName("Haug");
        employee.setDateOfBirth("1995-08-15");
        int actualAge = logic.calculateAge(employee);
        int expectedAge = 27;
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testCalculateAge2() {
        businessLogic logic = new businessLogic();
        employeeData employee = new employeeData();
        employee.setFirstName("Sami");
        employee.setLastName("Carroll");
        employee.setDateOfBirth("2001-07-12");
        int actualAge = logic.calculateAge(employee);
        int expectedAge = 21;
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testCalculateAge3() {
        businessLogic logic = new businessLogic();
        employeeData employee = new employeeData();
        employee.setFirstName("Ethan");
        employee.setLastName("Kramer");
        employee.setDateOfBirth("1999-05-29");
        int actualAge = logic.calculateAge(employee);
        int expectedAge = 23;
        Assert.assertEquals(expectedAge, actualAge);
    }
}

