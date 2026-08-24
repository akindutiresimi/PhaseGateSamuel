public class Bracket1{

    public static boolean brackets(String bracket){

    for(int count = 0; count < bracket.length(); count++){

     if(bracket(count) % 2 == 0){
        
            return true;
        }
            
        else{
        
            return false;
        }

    }
    
    }

  


    
    public static void main(String[] args){

    String bracket = "[<{(<]>>)";

    System.out.println(brackets(bracket));

    }
}
