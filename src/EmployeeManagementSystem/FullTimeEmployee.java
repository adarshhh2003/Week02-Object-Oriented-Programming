package EmployeeManagementSystem;
// Subclass
class FullTimeEmployee extends Employee implements Department{
    private String department;

    public FullTimeEmployee(String employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }
    // Override method
    public double calculateSalary() {
        return getBaseSalary();
    }
    // Implements department method
    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return department;
    }
}

