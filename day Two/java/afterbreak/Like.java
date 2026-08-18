public class Like{

    public static void blogPost(String[] array){

    for (int count = 0; count < array.length; count++){

    
    if (count < 0){
    
        System.out.println("no one likes this");
    } 

    else if(count == 0){

        System.out.println("peter likes this");
    }


     else if(count == 1){

        System.out.println("jacob and alex like this");
    }

    else if(count == 2){

        System.out.println("max ,john and mark like this");
    }

     else if(count == 3){

        System.out.println("Alex, jacob, and 2 others like this");
    }

    }

}

public static void main(String[] args){
   
   String[] Array = {"peter", "Alex"};
    
   blogPost(Array);  

    }
}





