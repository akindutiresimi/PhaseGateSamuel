import java.util.Arrays;
public class Question3{

    public static boolean numbers(int[] number){

    for(int count = 0; count < number.length; count++){

        for(int cout = 0; cout < number.length; cout++){
    
            if(number[count] == number[cout]){
                return true;
            }            
         }                               
       }
       return false;
    }
   


    public static void main(String[] args){

    int[] number = {1,2,3,1};

    System.out.println(numbers(number));

    }
} 
