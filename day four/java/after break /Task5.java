import java.util.Scanner;
public class Task5 {

public static void main(String[] args){

Scanner input  = new Scanner(System.in);

    int sum = 0;
  
    

    for (int count = 1; count <= 10; count++){

        System.out.print("Enter number");
            int number = input.nextInt();
       
            if(number % 2 == 0){
              sum = sum + number;
            
            }
       
    }
System.out.println("the sum is:" + sum);

}
}
