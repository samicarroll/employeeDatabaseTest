package JobApplication;

public class businessLogic {
    public double calculateYearlySalary(employeeData employeeData) {
        double yearlySalary = 0;
        yearlySalary = employeeData.getMonthlySalary() * 12;
        return yearlySalary;
    }
    public double calculateAppraisal(employeeData employeeData) {

        double appraisal = 0;

        if(employeeData.getMonthlySalary() < 10000) {
            appraisal = 500;

        } else {
            appraisal = 1000;
        }

        return appraisal;
    }

    public String calculateClearanceLevel(employeeData employeeData){
        String clearanceLevel = employeeData.getClearanceLevel();
        int yearsEmployed = employeeData.getYearsEmployed();
        if (yearsEmployed >= 5 && yearsEmployed < 10){
            clearanceLevel = "Level 1";
        }
        else if(yearsEmployed >= 10 && yearsEmployed < 15){
            clearanceLevel = "Level 2";
        }
        else if (yearsEmployed >= 15){
            clearanceLevel = "Level 3";
        }
        else{
            clearanceLevel = "None";
        }
        employeeData.setClearanceLevel(clearanceLevel);
        return clearanceLevel;
    }

    public String changePhoneNumber(employeeData employeeData, String number){
        String currentNumber = employeeData.getPhoneNumber();
        String newNumber = number;
        employeeData.setPhoneNumber(newNumber);
        return newNumber;
    }

}
