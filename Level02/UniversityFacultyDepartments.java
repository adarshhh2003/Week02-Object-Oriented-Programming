import java.util.ArrayList;
import java.util.List;

// Class representing a Faculty
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class representing a Department
class Departments {
    private String name;
    private List<Faculty> faculties = new ArrayList<>();

    public Departments(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    @Override
    public String toString() {
        return name + " Faculties: " + faculties;
    }
}

// Class representing a University
class University {
    private String name;
    private List<Departments> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Departments department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return name + " Departments: " + departments;
    }
}

// Main class
public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        University university = new University("Global University");

        Departments cs = new Departments("Computer Science");
        Departments ee = new Departments("Electrical Engineering");

        Faculty profAlice = new Faculty("Prof. Alice");
        Faculty profBob = new Faculty("Prof. Bob");

        cs.addFaculty(profAlice);
        ee.addFaculty(profBob);

        university.addDepartment(cs);
        university.addDepartment(ee);

        System.out.println(university);

        // Faculties exist independently
        System.out.println("Independent Faculty: " + profAlice);

        // Deleting university (simulate by nullifying reference)
        university = null;

        // Departments are tied to the university and should not exist independently
        // Garbage collection will handle the actual deletion in Java
    }
}
