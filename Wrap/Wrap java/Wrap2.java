import java.util.Scanner;
public class Wrap2{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number1");
    int number1 = input.nextInt();
    
    System.out.println("Enter a number2");
    int number2 = input.nextInt();

    int largest = 1;
    for(int count = 2; count <= number1; count++){
    
        if(number1 % count == 0 && number2 % count == 0)
                 
            largest = count;        

           
    }
  
    System.out.println("the greastest divisor is: " + largest);
    }
}
