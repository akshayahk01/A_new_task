package AkPractice;



// types of interface:  1. normal interface that have more than one method ;
// 2.functional interface that have only one method allows to lambda expression;
// marker interface : have no method allows serialization and deserialization;




interface A{
    void name();
    void age();
}

class B implements A {
    @Override
    public void name() {
        System.out.println("my name is Akshay");
    }

   public void age(){
       System.out.println("my age is 24");
    }


}

public class InterfacePractice {
    public static void main(String[] args) {
        B obj = new B();
        obj.age();

    }
}
