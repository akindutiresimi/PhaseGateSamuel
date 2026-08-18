public class FireDrill1{

    public static void  fathersAge(int currentFatherAge, int currentSonAge){


    int fatherTwiceAsOld = currentFatherAge - (2 * currentSonAge);

    if(fatherTwiceAsOld > 0){

    System.out.println("Years ago the fatherTwiceAsOld as is son   "  + fatherTwiceAsOld +"years");
    }
    
    else if(fatherTwiceAsOld < 0){
        
    System.out.println("years ago fatherTwiceAsold as is son   " + fatherTwiceAsOld +"years");
    
    
    }

}


    public static void main(String[] args){
   
    
     int currentFatherAge = 50;
     int currentSonAge = 20;
    
    fathersAge(currentFatherAge, currentSonAge);  

    }
}
