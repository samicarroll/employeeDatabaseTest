package com.example.jobapplicationtest;
// used to get/set the value of employees first & last name, age, and yearly salary
public class employeeData {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
