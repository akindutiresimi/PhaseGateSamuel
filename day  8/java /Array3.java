import java.util.Arrays;
public class Array3{

    public static int[] array(int[] number){



    for(int count = 0; count < number.length; count++){
    
        if(number[count] % 2 == 0){
            number[count] = number[count] * 2;
        }
        
        else if(number[count] % 2 != 0){
            
            number[count] = number[count] + 1;

        }
    
        else if(number[count] < 0){
            
            number[count] = 0;

        }

    }
    return number;
    }


    public static void main(String[] args){

    int[] number = {-1,12,17,39};

    System.out.println(Arrays.toString(array(number)));
    
    }

}
