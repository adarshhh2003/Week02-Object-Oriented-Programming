import java.util.ArrayList;
import java.util.List;

// Class representing an Employee
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class representing a Department
class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return name + " Employees: " + employees;
    }
}

// Class representing a Company
class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return name + " Departments: " + departments;
    }
}

// Main class
public class CompanyDepartmentsComposition {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department it = new Department("IT");
        it.addEmployee(new Employee("Alice"));
        it.addEmployee(new Employee("Bob"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Charlie"));

        company.addDepartment(it);
        company.addDepartment(hr);

        System.out.println(company);
    }
}
