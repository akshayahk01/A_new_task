package AkPractice;


import java.util.Scanner;

enum Laptop {
    Running(2000),Compiling(8500),Procceing(7500),Completed(8500) ;
    private final int prize;

    Laptop(int prize){
        this.prize = prize;
    }
    public int getPrize(){
        return prize;
    }
}
public class EnamPractice {
    public static void main(String[] args) {

        for(Laptop laptop:Laptop.values() ){
            System.out.println(laptop + "  : " + laptop.getPrize());
        }


        while (true){


            Scanner scan = new Scanner(System.in);

            System.out.println("select the process u want");

            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            String Select = scan.nextLine();
            scan.nextLine();

            if (Select.isEmpty()){
                System.out.println("plase enter the value");
                continue;
            }

            else{
                System.out.println("you selcted :"+Select);;
            }
            int input = Integer.parseInt(Select);

            switch (input){
                case 1:
                    for (Laptop laptop : Laptop.values()){
                        System.out.println(laptop + " : "+ laptop.getPrize());
                    }
                    break;


                case 2:
                    System.out.println(Laptop.Compiling + " : "
                    + Laptop.Compiling.getPrize());
                    break;

                case 3:
                    System.out.println("yenu ella anna nan hathra thorsoke please end madu guru");
                    break;
                default:
                    System.out.println("anna please option correct ha kodu anna");

            }






        }



    }


}
