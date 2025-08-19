//package AkPractice;
//
//
//
//// Abstract class to make methods as useful for future
//abstract class Employes {
//    String name;
//    int id;
//
//    Employes(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    // Abstract methods
//    abstract public String Employ_name();
//    abstract public int Employ_id();
//    abstract public String Employ_designation();
//    abstract public double Employ_salary();
//    abstract public String Employ_department();
//
//    // Concrete method
//    public void displayBasicInfo() {
//        System.out.println("Employee Basic Info = Name: " + name + ", ID: " + id);
//    }
//}
//
//// Subclass 1 to extends the parent class
//class Manager extends Employes {
//    Manager(String name, int id) {
//        super(name, id);
//    }
//
//
//    @Override
//    public String Employ_name() {
//        return "My name is: " + name;
//    }
//
//    @Override
//    public int Employ_id() {
//        return id;
//    }
//
//    @Override
//    public String Employ_designation() {
//        return "Manager";
//    }
//
//    @Override
//    public double Employ_salary() {
//        return 75000.0;
//    }
//
//    @Override
//    public String Employ_department() {
//        return "Management";
//    }
//}
//
//// Subclass 2 to extends the parent class
//class Developer extends Employes {
//    Developer(String name, int id) {
//        super(name, id);
//    }
//
//    @Override
//    public String Employ_name() {
//        return "My name is: " + name;
//    }
//
//    @Override
//    public int Employ_id() {
//        return id;
//    }
//
//    @Override
//    public String Employ_designation() {
//        return "Java Full Stack Developer";
//    }
//
//    @Override
//    public double Employ_salary() {
//        return 55000.50;
//    }
//
//    @Override
//    public String Employ_department() {
//        return "Software Development";
//    }
//}
//
//// Main class to call the methods
//public class BreifAbstraction {
//    public static void main(String[] args) {
//        Employes manager = new Manager("Akshay hiremath", 101);
//        Employes developer = new Developer("Rahul", 102);
//
//        manager.displayBasicInfo();
//        System.out.println(manager.Employ_name());
//        System.out.println("My ID is: " + manager.Employ_id());
//        System.out.println("My Designation is: " + manager.Employ_designation());
//        System.out.println("My Salary is: " + manager.Employ_salary());
//        System.out.println("My Department is: " + manager.Employ_department());
//
//        System.out.println();
//
//        developer.displayBasicInfo();
//        System.out.println(developer.Employ_name());
//        System.out.println("My ID is: " + developer.Employ_id());
//        System.out.println("My Designation is: " + developer.Employ_designation());
//        System.out.println("My Salary is: " + developer.Employ_salary());
//        System.out.println("My Department is: " + developer.Employ_department());
//    }
//}
