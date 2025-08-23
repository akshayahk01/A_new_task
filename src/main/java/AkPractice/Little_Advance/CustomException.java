package AkPractice.Little_Advance;
class AkError extends Exception{
     AkError(String str){
        super(str);
    };
}


public class CustomException {
    public static void main(String[] args) {

        int j = 0;
        try {int i = 0;


            if (i==0){            throw new AkError("bro we can divide by zero bro please chaeck that");
            } j = 10 / i;
        } catch (AkError e) {
            System.out.println("we can't divide by zero" + e.getMessage());
        } finally {
            System.out.println(j);
        }

    }
}
