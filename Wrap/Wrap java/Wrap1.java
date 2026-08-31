import java.util.Scanner;
public class Wrap1{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();
    
    for(int count = number; count >= 0; count--){
    
        System.out.print(count + " ");
    }

    }

}
