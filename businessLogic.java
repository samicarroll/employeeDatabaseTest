package com.example.jobapplicationtest;

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

}
