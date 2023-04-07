package TestCases;

import JobApplication.employeeData;
import JobApplication.businessLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCalculatingAppraisall {
    JobApplication.businessLogic businessLogic = new businessLogic();
    employeeData employeeData = new employeeData();

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
    public void testCalculateAppraisal2() {
        employeeData.setFirstName("Sami");
        employeeData.setLastName("Carroll");
        employeeData.setAge(23);
        employeeData.setMonthlySalary(4000.87);

        double appraisal = businessLogic.calculateAppraisal(employeeData);
        Assert.assertEquals(500, appraisal);
    }


}
