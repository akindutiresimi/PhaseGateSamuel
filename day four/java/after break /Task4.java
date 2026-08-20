import java.util.Scanner;
public class Task4{

public static void main(String[] args){

Scanner input  = new Scanner(System.in);

    int sum = 0;
    int average = 0;


    for (int count = 1; count <= 10; count++){

        System.out.print("Enter number");
            int number = input.nextInt();

            if(count % 2 == 0){
                count++;
             
            
            }
        sum = sum + count;
    }
System.out.println("the sum is:" + sum);

}
}
