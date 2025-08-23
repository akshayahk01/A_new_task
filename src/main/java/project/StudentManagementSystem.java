package project;



import java.util.*;

// 🔹 Abstraction using Interface
interface DatabaseOperations {
    void addStudent(Student student);
    void viewStudents();
    void updateStudent(int id, String newCourse, double newMarks);
    void deleteStudent(int id);
}

// 🔹 Base class (Inheritance)
class Person {
    protected int id;
    protected String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 🔹 Polymorphism (Overridable method)
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// 🔹 Student class extending Person (Inheritance + Encapsulation)
class Student extends Person {
    private String course;
    private double marks;

    Student(int id, String name, String course, double marks) {
        super(id, name);
        this.course = course;
        this.marks = marks;
    }

    // Encapsulation (Getters & Setters)
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    // 🔹 Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name +
                ", Course: " + course + ", Marks: " + marks);
    }

    // 🔹 Method Overloading (Polymorphism)
    public void displayInfo(boolean showResult) {
        displayInfo();
        if (showResult) {
            System.out.println("Result: " + (marks >= 40 ? "PASS" : "FAIL"));
        }
    }
}

// 🔹 Teacher class extending Person (Inheritance)
class Teacher extends Person {
    private String subject;

    Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + id + ", Name: " + name +
                ", Subject: " + subject);
    }
}

// 🔹 StudentDatabase implementing Abstraction
class StudentDatabase implements DatabaseOperations {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(" Student added successfully!");
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println(" No student records found!");
        } else {
            for (Student s : students) {
                s.displayInfo(true);
            }
        }
    }

    @Override
    public void updateStudent(int id, String newCourse, double newMarks) {
        for (Student s : students) {
            if (s.id == id) {
                s.setCourse(newCourse);
                s.setMarks(newMarks);
                System.out.println(" Student updated successfully!");
                return;
            }
        }
        System.out.println("⚠ Student not found!");
    }

    @Override
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.id == id) {
                iterator.remove();
                System.out.println(" Student deleted successfully!");
                return;
            }
        }
        System.out.println("⚠ Student not found!");
    }
}

// 🔹 Main class (Driver Program)
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();

        while (true) {
            System.out.println("\n===== Student Database Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    db.addStudent(new Student(id, name, course, marks));
                    break;

                case 2:
                    db.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    db.updateStudent(uid, newCourse, newMarks);
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int did = sc.nextInt();
                    db.deleteStudent(did);
                    break;

                case 5:
                    System.out.println(" Exiting Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠ Invalid choice! Try again.");
            }
            
        }
    }
}
