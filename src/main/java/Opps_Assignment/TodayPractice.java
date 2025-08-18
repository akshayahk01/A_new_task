package Opps_Assignment;

class Ris{


    void dept(){
        System.out.println("i am from ris");
    }

    void adress(){
        System.out.println("kudlu gate");
    }

}

class employ extends Ris{
    @Override
    void dept() {
        System.out.println("java dev");
    }

    @Override
    void adress() {

        System.out.println("davanagere");
    }

    void tea(){
        System.out.println("i love to drink tea");
    }
}
class abc extends Animal{

}



public class TodayPractice {
    public static void main(String[] args) {
        abc a = new abc();
        a.sound();








    }

}
