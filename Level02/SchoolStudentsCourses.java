import java.util.ArrayList;
import java.util.List;

// Class representing a Course
class Course {
    private String name;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollCourse(this);
        }
    }

    @Override
    public String toString() {
        return name + " Enrolled Students: " + enrolledStudents;
    }
}

// Class representing a Student
class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String viewCourses() {
        return name + " Enrolled Courses: " + courses;
    }
}

// Class representing a School
class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    @Override
    public String toString() {
        return name + " Students: " + students;
    }
}

// Main class
public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Greenfield High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        school.addStudent(alice);
        school.addStudent(bob);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(alice);
        math.enrollStudent(bob);
        science.enrollStudent(alice);

        System.out.println(school);
        System.out.println(math);
        System.out.println(science);
        System.out.println(alice.viewCourses());
        System.out.println(bob.viewCourses());
    }
}