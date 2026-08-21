public class AddDigit{

  public static int addNumber(int number){

   int newNumber = 0;
    int nextNumber = 0;

   //for(int count = 0; count < number; count++){

        //if(number < 9){

      newNumber = (number / 10) + (number % 10);

        int result = newNumber;
        
      nextNumber = (result /10) + (result % 10);

       return nextNumber; 
     }   
  


    public static void main(String[] args){
    int number = 38;

    System.out.println(addNumber(number));

    }  
    
}
