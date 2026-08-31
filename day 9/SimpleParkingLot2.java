import java.util.Arrays;

import java.util.Scanner;

public class SimpleParkingLot2 {

       
     public static int[] parkingSpace (int[] parkingLot){
        int count = 0;
        for (int space = 0; space < parkingLot.length; space++) {
            if (parkingLot[space] == 0) {
                count++;
            }
        }                     
         

        int[] emptySpace = new int[count];

          int index = 0;
         for (int space = 0; space < parkingLot.length; space++) {
            if (parkingLot[space] == 0) {
                emptySpace[index++] = space + 1;
            }
        }    

        return emptySpace;
    }            



    public static String enterLotSpace(int[] parkingLot , int slotNumber){
        for (int count = 0; count < parkingLot.length; count++) {

            if(parkingLot[count] >= 'A' && parkingLot[count] <= 'Z'){
                return ("Invalid, enter number of empty slot you want");
            }

            else if(parkingLot[count] >= 'a' && parkingLot[count] <= 'z'){
                return ("Invalid, enter number of empty slot you want");
             }

            else if (count == slotNumber - 1 && parkingLot[count] == 0) {
                parkingLot[count] = 1;
                
                return ("The car is successfully parked");            
            }

            else if(count == slotNumber && parkingLot[count] == 1){
                

            }
        }
    return ("The Slot is filled, picked an empty slot");
    }



    public static String checkOutLot(int[] parkingLot , int slotNumber){
         for (int count = 0; count < parkingLot.length; count++) {
            if (count == slotNumber - 1 && parkingLot[count] == 1) {
                parkingLot[count] = 0;
        
                return ("Check out the car succesfully");
            }

            else if (count == slotNumber - 1 && parkingLot[count] == 0){
            }
            
        }

            return ("Slot empty, pick the slot number you packed");
    }






 public static void main(String[] args) {

        int[] parkingLot = {1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1};


     Scanner input = new Scanner(System.in);

        String mainMenu = """

                ==================================================
                
                    Welcome To Simulation Parking Lot.
                
                ==================================================
                
                Press 1 To View Empty Lot.
                
                Press 2 To Enter Lot Space.
                
                Press 3 To Check Out Of Parking Lot.
                
                Press 4 To Exit.
                ===================================================
                
                """;

         boolean packing = true;

        while (packing) {

            System.out.print(mainMenu);

            int mainmenuList = input.nextInt();

            switch (mainmenuList) {

              
                case 1:

                    System.out.println(Arrays.toString(parkingSpace(parkingLot)));

                    break;


                case 2:
                    System.out.println("Choose from the slot below!!!!!");
                    System.out.println(Arrays.toString(parkingSpace(parkingLot)));                    

                    System.out.print("Enter the parking space number you want: ");

                     int parkingChoice = input.nextInt();

                    System.out.println(enterLotSpace(parkingLot , parkingChoice));
                
                    break;



              case 3:

                    System.out.print("Enter the parking space number to check out: ");

                    int checkoutChoice = input.nextInt();
            
                    System.out.println(checkOutLot(parkingLot , checkoutChoice));

                    break;


              case 4:

                    System.out.println("Thank you for using the parking lot.");
                    packing = false;

                    break; 

             default:

                    System.out.println("Invalid option. Please choose between 1 and 4.");

    }

    }
    
    }
}

