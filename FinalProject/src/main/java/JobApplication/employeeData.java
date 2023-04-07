package JobApplication;

public class employeeData {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private int age;
    private String email;
    private int empID;
    private int yearsEmployed;
    private String phoneNumber;
    private String clearanceLevel;

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public int getEmpID(){
        return empID;
    }
    public int getYearsEmployed(){
        return yearsEmployed;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getClearanceLevel(){
        return clearanceLevel;
    }



    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public void setYearsEmployed(int years){
        this.yearsEmployed = yearsEmployed;
    }
    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }
    public void setClearanceLevel(String clearanceLevel){
        this.clearanceLevel = clearanceLevel;
    }
}
