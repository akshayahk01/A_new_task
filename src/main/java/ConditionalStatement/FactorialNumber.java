package ConditionalStatement;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        long ref = 1;
        for (int i = 1; i <= n; i++) {
            ref *= i;
        }
        System.out.println("Factorial = " + ref);

        scan.close();
    }
}
