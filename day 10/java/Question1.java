import java.util.Arrays;
public class Question1{

    public static int[] plusOne(int[] number){

    number[number.length - 1] = number[number.length - 1] + 1;
      
        
        return number; 
    }


   public static void main(String[] args){

    int[] number = {1,2,-3};

    System.out.println(Arrays.toString(plusOne(number)));

    }
}
