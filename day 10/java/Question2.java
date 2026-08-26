public class Question2{

    public static int number(int[] number1, int[] number2){

    int counter = 0;

    for(int count = 0; count < number1.length; count++){

    for(int cout = 0; cout < number2.length; cout++){
    
            if(number1[count] == number2[cout]){
                counter =  count;
            }
    }  

    }
     return counter;
    }
  


    public static void main(String[] args){

    int[] number1 = {1,2,2,1};

    int[] number2 = {2,2};

    System.out.println(number(number1,number2));

    }
} 
