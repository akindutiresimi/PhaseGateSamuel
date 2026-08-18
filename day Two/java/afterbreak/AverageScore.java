public class AverageScore{

    public static void averageScore(int Score1, int Score2, int Score3){

    int average = (Score1 + Score2 + Score3) / 3;

    if(average >= 90 && average <= 100){
        System.out.println("average is 'A'");    
    }

    else if(average >= 80 && average < 90){
        System.out.println("average is 'B'");    
    }

    else if(average >= 70 && average < 80){
        System.out.println("average is 'C'");    
    }

    else if(average >= 60 && average < 70){
        System.out.println("average is 'D'");    
    }

    else if(average >= 0 && average <= 60){
        System.out.println("average is 'F'");    
    }


}


  public static void main(String[] args){
   
    
     int Score1 = 60;
     int Score2 = 95;
     int Score3 = 85;
    
    averageScore(Score1, Score2, Score3);  

    }

}
