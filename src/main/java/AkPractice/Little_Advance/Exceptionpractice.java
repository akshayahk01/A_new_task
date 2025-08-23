package AkPractice.Little_Advance;

//exception also called runtime errors soo handling the runtime errors called exception handling

public class Exceptionpractice {

    public static void main(String[] args) {
        int[] nums = new int[20];
        try{
            System.out.println(nums[23]);;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("look once again he size of array");

        }
        System.out.println("thank you bro");
    }
}
