import java.util.Scanner;
public class Wrap7{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = input.nextInt();
    
    
     
    for(int count = 1; count <= number; count++){ 

        int sum = 0;

       for(int counter = 1; counter < count; counter++){

         if(count % counter == 0){

            sum += counter;

        }
        }
        
         if (sum == count){

         System.out.println("perfect number :" + count);
    
        }
    }
    
    }
}

