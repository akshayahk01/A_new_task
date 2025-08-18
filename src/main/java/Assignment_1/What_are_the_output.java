package Assignment_1;

public class What_are_the_output {

    // (i) Operator Expression Example
    public static void example1() {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.println("Example 1 Output:");
        System.out.print(exp1 + ", ");
        System.out.println(exp2);
        System.out.println("&&&&&&&&&&&&&");
    }

    // (ii) Logical Operators Example
    public static void example2() {
        int x = 200, y = 50, z = 100;

        System.out.println("Example 2 Output:");
        if (x > y && y > z) {
            System.out.println("Hello");
        }

        if (z > y && z < x) {
            System.out.println("Java");
        }

        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
        System.out.println("--------------------");
    }

    // (iii) Complex Expressions Example
    public static void example3() {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println("Example 3 Output:");
        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println("--------------------");
    }

    // Main method
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }
}
