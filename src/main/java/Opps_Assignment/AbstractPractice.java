package Opps_Assignment;

abstract  class company{
abstract void name ();
abstract void dept();
abstract void task();
}

public class AbstractPractice {
    public static void main(String[] args) {
        company c = new company() {
            @Override
            void name() {
                System.out.println("Retouch");

            }

            @Override
            void dept() {
                System.out.println("dev");

            }

            @Override
            void task() {
                System.out.println("app dev");

            }


        };
        c.dept();

    }
}
