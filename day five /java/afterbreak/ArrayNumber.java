public class ArrayNumber{

  public static int arrayNumber(int[] number){

    int counter = 0;

    for (int count = 0; count < number.length; count++){

        for(int index = 0; index < number[count]; index++){

            if(number[count] != number[index]){

            counter = number[count];
            }
    
        }
       
    }
    return counter;
}


    public static void main(String[] args){

    int[] number = {2,2,1};
    
    System.out.println(arrayNumber(number));
    }
}
