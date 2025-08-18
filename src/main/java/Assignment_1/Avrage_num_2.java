package Assignment_1;
import java.util.Scanner;


public class Avrage_num_2 {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter how many numbers you want to find average: ");
            int n = scan.nextInt();

            double sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + " : ");
                double num = scan.nextDouble();
                sum += num;
            }

            double average = sum / n;
            System.out.println("Average of numbers: " + average);

            scan.close();
        }
    }


