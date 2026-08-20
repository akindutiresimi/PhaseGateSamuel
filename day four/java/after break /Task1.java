import java.util.Scanner;
public class Task1{
public static void main(String[] args){
Scanner input  = new Scanner(System.in);

    int sum = 0;
    
for (int count = 1; count <= 10; count++){
    System.out.print("Enter number");
    int number = input.nextInt();

    sum = sum + number;

    
    }
System.out.println("the total is:" + sum);
}

}
