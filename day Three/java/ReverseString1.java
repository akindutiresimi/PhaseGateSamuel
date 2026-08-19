import java.util.Arrays;
public class ReverseString1{

    public static void main(String[] args){

    String[] word = {"S", "T", "R", "I", "N", "G"};
    

    for(int count = 0; count < word.length / 2; count++){

        int Temp = word.length;

        word.length =  word.length -1 - count;
        
        word.length - 1 - count = Temp;
    }
    System.out.println(word);
}

}
