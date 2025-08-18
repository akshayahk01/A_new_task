package Assignment_1;

import java.util.Scanner;

public class Bill_with_gst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of products you want to buy: ");
        int n = scan.nextInt();
        scan.nextLine();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the product " + i + " name: ");
            String product = scan.nextLine();

            System.out.print("Enter the price of " + product + ": ");
            double price = scan.nextDouble();
            scan.nextLine(); // consume newline

            sum += price;
        }

        double gst = sum * 0.18;
        double total = sum + gst;

        System.out.println("Bill is below");
        System.out.println("Total price (without GST): " + sum);
        System.out.println("GST 18%: " + gst);
        System.out.println("Final Bill with GST: " + total);

        scan.close();
    }
}
