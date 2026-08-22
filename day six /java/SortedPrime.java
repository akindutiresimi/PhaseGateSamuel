import java.util.Arrays;
public class SortedPrime{

    public static int[] array(int[] number){

    for(int count = 0; count < number.length; count++){

        for(int counter = 0; counter < number.length; counter++){

            if(number[count] > number[counter]){

              int temp = number[count];

                number[count] = number[counter];
        
                number[counter] = temp;          
                       
            }

        }
    }
    return number;
    }


    public static void main(String[] args){

    int[] number = {5,0,3,0,2,0};

    System.out.println(Arrays.toString(array(number)));

    }
}

