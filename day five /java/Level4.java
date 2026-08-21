public class Level4{
   public static int add(int number1, int number2){

    int sum = number1 + number2;

    return sum;
    }



   public static boolean checkEven(int number){

        if(number % 2 == 0){
           return true; 
        }
        else{
            return false;
        }
    }



    public static int square(int number){

    int square = number * number;

    return square;
    }



   public static int celsius(int number){

    int fahrenheit = number + 273;

    return fahrenheit ;
    }



   public static boolean prime(int number){

        if(number % 2 == 0){
           return true; 
        }
        else{
            return false;
        }
    }

   public static boolean prime(int number1, int number2, int number3){

        if(number1 > number2 && number1 > number3){
           return number1; 
        }
        else if{number2 > number1 && number2 > number3){
            return number2;
        }
        else{
            return number3;
        }
    }


    
  public static double simpleIntrest(int principal, int interest, int time){

      double principal = 0;
      double  interest = 0; 
    double time = 0;

    double simple = (principal * interest * time) / 100;

    return simple ;
    }




   public static int rectangle(int number1, int number2){

    int angle = number1 * number2;

    return sum;
    }




    public static int reverse (int[] number){

    for(int count = 0; count < number.length / 2; count++){

    int temp = number[count];
    
    number[count] = number[number.length - 1 -count];

    number[number.length - 1 -count] = temp;

    }

    return reverse;
    }










    public static void main(String[] args){

    System.out.println(add(2, 5));
    }


   public static void main(String[] args){

    System.out.println(checkEven(5));
    }

   public static void main(String[] args){

    System.out.println(square(5));
    }



    public static void main(String[] args){

    System.out.println(celsius(37));
    }



    public static void main(String[] args){

    System.out.println(prime(37));
    }

    public static void main(String[] args){
    System.out.println(prime(2,5,4));
    }
    

    public static void main(String[] args){
  
    System.out.println(simpleIntrest(2,5,4));
    }

    public static void main(String[] args){
    System.out.println(rectangle(2,5,4));
    }



    public static void main(String[] args){

    int[] number = {2,3,4,5,6};
    
    System.out.println(reverse(number));
    }
}
