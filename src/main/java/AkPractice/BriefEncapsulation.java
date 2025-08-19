package AkPractice;



// Encapsulation Example
class Employee {
    // Private fields (data hiding)
    private String name;
    private int id;
    private String designation;
    private double salary;
    private String department;

    // Getter & Setter methods (public)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

public class BriefEncapsulation {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee();

        // Set values using setters
        emp.setName("Akshay");
        emp.setId(101);
        emp.setDesignation("Java Full Stack Developer");
        emp.setSalary(60000.75);
        emp.setDepartment("Software Development");

        // Get values using getters
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
    }
}

