import java.util.Scanner;
public class Wrap9{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = input.nextInt();
    
    
     
    for(int count = 1900; count <= number; count++){ 
        if(count % 400 == 0 || count % 4 == 0 && count % 100 != 0){
                System.out.println("THe leaps year is: " + count);
        }
 
    }

    }

}
