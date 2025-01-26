package EmployeeManagementSystem;
// Subclass
class PartTimeEmployee extends Employee implements Department{
    private String department;
    private int hoursWorked;
    private double hoursRate;

    public PartTimeEmployee(String employeeId, String name, int baseSalary, int hoursWorked, double hoursRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }

    public double getHoursRate() {
        return hoursRate;
    }

    public double calculateSalary() {
        return hoursRate * hoursWorked;
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return department;
    }
}
