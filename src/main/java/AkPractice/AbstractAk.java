package AkPractice;

abstract class Employes1 {
     String name;
     int id;

     Employes1(String name , int id){
         this.name= name;
         this.id =id;

     }

     abstract public String Employ_name();
    abstract public int Employ_id();


}

public class AbstractAk {
    public static void main(String[] args) {
//        Employes E = new Employes("Akshay", 58) {
//            @Override
//            public String Employ_name() {
//                return "my name is :"+name;
//            }
//
//            @Override
//            public int Employ_id() {
//                return id;
//            }
//        };
//        System.out.println(E.Employ_name());
//        System.out.println("My ID is: " + E.Employ_id());

        Employes1 E = new Employes1("akshay hiremath", 0072) {
            @Override
            public String Employ_name() {
                return "my name is ::" + name;
            }

            @Override
            public int Employ_id() {
                return id;
            }
        };
        System.out.println(E.Employ_name());
      System.out.println("My ID is: " + E.Employ_id());



    }

}
