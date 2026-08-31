import java.util.Scanner;
public class Wrap9{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = input.nextInt();
    
    int counter = 0;
    for(int count = 1900; count <= number; count++){ 
        if(count % 400 == 0 || count % 4 == 0 && count % 100 != 0){
             counter++;     
        }
        
    }
    System.out.println("The leaps year is: " + counter);    
    }

}
