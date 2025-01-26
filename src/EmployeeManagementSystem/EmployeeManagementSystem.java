package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;
// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create arraylist
        List<Employee> employeeList = new ArrayList<>();
        // Create object of the class
        FullTimeEmployee ftEmployee = new FullTimeEmployee("FT123", "Rahul Kumar", 25000);
        ftEmployee.assignDepartment("Engineering");
        PartTimeEmployee ptEmployee = new PartTimeEmployee("PT123", "Sachin Kumar", 30000, 8, 1000.0);
        ptEmployee.assignDepartment("Support");
        // Add the instances in the list
        employeeList.add(ftEmployee);
        employeeList.add(ptEmployee);
        // Loop to display the result or call the methods
        for(Employee employee: employeeList) {
            employee.displayDetails();
            if(employee instanceof Department) {
                System.out.println(((Department)employee).getDepartmentName());
            }
        }
    }
}
