package ConditionalStatement;

import java.util.Scanner;

public class EvenOdd_make_sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = scan.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();

            if (num % 2 == 0)
                even += num;
            else
                odd += num;
        }

        System.out.println("Sum of Even numbers: " + even);
        System.out.println("Sum of Odd numbers: " + odd);

        scan.close();
    }
}
