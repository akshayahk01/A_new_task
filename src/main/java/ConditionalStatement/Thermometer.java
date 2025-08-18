package ConditionalStatement;

import java.util.Scanner;

public class Thermometer {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter temperature: ");
            float temp = scan.nextFloat();

            if (temp > 100)
                System.out.println("You have a fever go to docter");
            else
                System.out.println("You don't have a fever chill bro");

            scan.close();
        }
    }


