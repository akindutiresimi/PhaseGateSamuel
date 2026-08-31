
public class Wrap7{

    public static void main(String[] args){

    int number = 145;

    int factorial = 0;
    int factorial2 = 0;
    int factorial3 = 0;

    int sum = 0;
    
    int multply = 1;
    int multply2 = 1;
    int multply3 = 1;
 
    factorial = number % 10;

    factorial2 =(number / 10) % 10;;

    factorial3 = (number / 100) % 10;

    for(int count = 1; count <= factorial; count++){
       multply *= count;

    }
    for(int count = 1; count <= factorial2; count++){
        multply2 *= count;
    }    
     for(int count = 1; count <= factorial3; count++){
         multply3 *= count;
    }
     sum = multply + multply2 + multply3;

    if(sum == number){

    System.out.println("the number is strong number");
    }

    else{
    System.out.println("the number is not Strong number");
    }
    }

}
