package Opps_Assignment;

// Abstract class
abstract class Employee {
    String name;
    static final String COMPANY_NAME = "RIS IT Services";

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

    void company() {
        System.out.println("Company: " + COMPANY_NAME);
    }
}

// Child class 1
class Developer extends Employee {
    private static final String ROLE = "developing software";

    Developer(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is " + ROLE + ".");
    }
}

// Child class 2
class Tester extends Employee {
    private static final String ROLE = "testing applications";

    Tester(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is " + ROLE + ".");
    }
}

// Main class (renamed)
public class Abstarctpart2 {
    public static void main(String[] args) {
        String devName = "Akshay";
        String testerName = "Ravi";

        Employee e1 = new Developer(devName);
        e1.company();
        e1.work();

        Employee e2 = new Tester(testerName);
        e2.company();
        e2.work();
    }
}

