package Opps_Assignment;

class Employ1 {
   private String name;
   private int id;
   private static int totalemp=0;

   public Employ1(String name, int id){
       this.id=id;
       this.name= name;
       totalemp++;

   }

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
    public static void showTotalEmployees() {
        System.out.println("Total employees in company: " + totalemp);
    }
}
// whyData Security & Control
//
//Direct access to variables can be dangerous.
//
//With setters/getters, we can control how data is updated or retrieved i want geter and setter
//Read-Only or Write-Only Access
//
//If we only give a getter, the field becomes read-only.
//
//If we only give a setter, the field becomes write-only.

public class EncapsulationPractice{

    public static void main(String[] args) {
        Employ1 e = new Employ1("akshay hiremath",55);

        System.out.println("my name is : "+ e.getName());
        System.out.println("my name is : "+ e.getId());

        Employ1.showTotalEmployees();


    }
}
