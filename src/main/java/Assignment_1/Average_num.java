package Assignment_1;

import java.util.Scanner;

public class Average_num {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number :");
        int A = scan.nextInt();

        System.out.print("Enter the 2st number :");
        int b = scan.nextInt();

        System.out.print("Enter the 3st number :");
        int c = scan.nextInt();

        double result = (A+b+c)/3.0;
        System.out.println("Average of num : "+ result);

    }
}
