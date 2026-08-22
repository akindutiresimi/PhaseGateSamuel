import java.util.Arrays;
public class NegativeToZero{

    public static int[] array(int[] number){

    for(int count = 0; count < number.length; count++){

        for(int counter = 0; counter < number.length; counter++){

            if(number[count] < 0){

                number[count] = 0;
            }

        }
      
    }
    return number;
    }


    public static void main(String[] args){

    int[] number = {5,-9,3,-6,2,-11};

    System.out.println(Arrays.toString(array(number)));

    }
}
