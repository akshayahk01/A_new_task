package ConditionalStatement;

import java.util.Scanner;

public class PosiiveNegetive {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        System.out.println("enter the number you want to cheak");
        int num = scan.nextInt();
        if (num >=0){
            System.out.println("number is positive");
        }else {
            System.out.println("number is negative");
        }
    }
}
