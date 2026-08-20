import java.util.Scanner;
public class Task2{

public static void main(String[] args){

Scanner input  = new Scanner(System.in);

    int sum = 0;
    int average = 0;


    for (int count = 1; count <= 10; count++){

        System.out.print("Enter number");
            int number = input.nextInt();

        sum = sum + number;

        average = sum / 10;
    }
System.out.println("the average is:" + average);
}

}

