import java.util.Arrays;
public class Array2{

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

    int[] number = {12,17,39};

    System.out.println(Arrays.toString(array(number)));
    
    }

}
