public class Average7{

    public static void main(String[] args){

    int sum = 0;
    int average = 0;    

    for(int count = 1; count <= 100; count++){

        sum = sum + count;
    
        average = sum /count;

     
    }
    System.out.println("Total sum:" + sum);
    System.out.println("sum of average is :" + average);
}

}
