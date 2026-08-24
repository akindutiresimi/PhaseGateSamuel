import java.util.Arrays;
public class Array1{

    public static int[] array(int[] number){



    for(int count = 0; count < number.length; count++){
    
        if(number[count] % 2 == 0){
            number[count] = number[count] * 2;
        }
        
        else if(number[count] % 2 != 0){
            
            number[count] = number[count] + 1;

        }
    

    }
    return number;
    }


    public static void main(String[] args){

    int[] number = {2, 8, 14, 5,1};

    System.out.println(Arrays.toString(array(number)));
    
    }

}
