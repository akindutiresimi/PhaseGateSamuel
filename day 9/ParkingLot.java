import java.util.Arrays;

import java.util.Scanner;

public class ParkingLot {

       
     public static int[] parkingSpace (int[] parkingLot){
        int count = 0;
        for (int counter = 0; counter < parkingLot.length; counter++) {
            if (parkingLot[counter] == 0) {
                count++;
            }
        }                     
         

        int[] emptySpace = new int[count];

          int index = 0;
         for (int counter = 0; counter < parkingLot.length; counter++) {
            if (parkingLot[counter] == 0) {
                emptySpace[index++] = counter + 1;
            }
        }    

        return emptySpace;
    }            


 

    public static int enterLotSpace(int[] parkingLot , int slotNumber){
        for (int count = 0; count < parkingLot.length; count++) {        

             if (count == slotNumber - 1 && parkingLot[count] == 0) {
                parkingLot[count] = 1;
            }

            else if (count == slotNumber - 1 && parkingLot[count] == 1) {
                return 100;
            }

          
        }
        
        return slotNumber;
    
    }



    public static int checkOutLot(int[] parkingLot , int slotNumber){
         for (int count = 0; count < parkingLot.length; count++) {
            if (count == slotNumber - 1 && parkingLot[count] == 1) {
                parkingLot[count] = 0;
            }
        
            else if (count == slotNumber - 1 && parkingLot[count] == 0) {

                return 200;
            }
        }

            return slotNumber;
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

                    System.out.print("Enter the parking space you want: ");

                     int parkingChoice = input.nextInt();

                     int slot = enterLotSpace(parkingLot , parkingChoice);

                        if (slot == 100) {

                        System.out.println("Slot is filled!!!, enter an empty choice");
                        }

                        else {
                        System.out.println("Car successfully parked in space " + slot);
                        }
                    
                    break;



              case 3:

                    System.out.print("Enter the parking space to check out: ");

                    int checkoutChoice = input.nextInt();
                
                    int out = checkOutLot(parkingLot , checkoutChoice);

                        if(out == 200){
                        
                        System.out.println("Slot is  occupied, enter your parked choice");
                        }
                        
                        else{
            
                        System.out.println("Car checked out successfully from space " + out);
                        }

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

