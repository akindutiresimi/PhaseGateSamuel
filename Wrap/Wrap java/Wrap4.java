import java.util.Scanner;
public class Wrap4{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = input.nextInt();
    
    int sum = 0;

    for(int count = 1; count < number; count++){ 
       
        if(number % count == 0){

            sum += count;         
        }
 
    }

    if(sum == number){
            System.out.println("The number is a perfect number");
    }
    else{
            System.out.println("The number is not a perfect number"); 
    }
       
    }

}
