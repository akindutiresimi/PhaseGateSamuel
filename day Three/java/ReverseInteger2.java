import java.util.Arrays;
public class ReverseInteger2{

    public static void main(String[] args){

    int[] digit = {22,4,5,6,8,9};
    
    int counter = 0;
    for(int count = 0; count < digit.length / 2; count++){

        int Temp = digit[count];

        digit[count] =  digit[digit.length -1 - counter];
        
        digit[digit.length - 1 - counter] = Temp;

     
    }
    System.out.println(Arrays.toString(digit));
}

}
