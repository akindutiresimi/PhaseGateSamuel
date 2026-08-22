import java.util.Arrays;
public class Duplicate{

    public static int[] array(int[] number){

    int[] numbers = new int[]{number.length};

    for(int count = 0; count < number.length; count++){

        for(int counter = count + 1; counter < number.length; counter++){

            if(number[count] == number[counter]){

                count++;        
            }

        } 

    }
    for(int count = 0; count < number.length; count++){

        for(int counter = ; counter < number.length; counter++){

            if(number[count] == number[counter]){

                count++;     
    }
    
    }


    public static void main(String[] args){

    int[] number = {45,60,3,0,67,2,45,3,22,0};

    System.out.println(Arrays.toString(array(number)));

    }
}

