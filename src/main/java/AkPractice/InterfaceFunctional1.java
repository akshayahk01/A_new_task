package AkPractice;
 // lamba expression not need access modifier, return type , in single statement we dont need return keyword also
@FunctionalInterface
interface Fun {
//    void show(String name, int age);

     void add(int i , int j);
}

public class InterfaceFunctional1 {
    public static void main(String[] args) {
//        Fun f =(name,age)  ->{
//            System.out.println("anna nanu "+ name +" nan age "+ age);
//        };
//        f.show("Akshay hiremath",24);

        Fun f = (i,j) -> System.out.println(i+j);

        f.add(5,5);




    }
}
