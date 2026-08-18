public class Question2{

    public static void main(String[] args){

    int digitOne = 4;

    int digitTwo = 6;

    int digitThree = 8;

    int mean = (digitOne + digitTwo + digitThree) / 3;

    System.out.println("the mean: " + mean);

    
    int median = 0;
    
    if(digitOne > digitTwo && digitOne < digitThree){
            System.out.println("median is : digitOne");
    }
    
    else if(digitTwo > digitOne && digitTwo < digitThree){
            System.out.println("Median is:  digitTwo");
    }
    
    else{
            System.out.println("median is : digitThree");
    }

    }

}
