
package Opps_Assignment;
class Student {
    String name;
    int rollNumber;
    double marks;

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akshay";
        s1.rollNumber = 101;
        s1.marks = 88.5;

        Student s2 = new Student();
        s2.name = "Ravi";
        s2.rollNumber = 102;
        s2.marks = 92.0;

        s1.display();
        s2.display();
    }
}
