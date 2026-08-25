import java.util.Scanner;

public class SimpleParkingLot {

    public static void parkingSpace(int[] availableSpace){

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

                    System.out.println(" Available Parking Spaces:");

                    for (int space = 0; space < availableSpace.length; space++) {

                        if (availableSpace[space] == 0) {
                            System.out.println("Parking space " + space + " is AVAILABLE");
                        }
                    }

                    break;


               
                case 2:

                    System.out.print("Enter the parking space you want: ");

                    int parkingChoice = input.nextInt();
               
                        if (availableSpace[parkingChoice] == 0) {

                            availableSpace[parkingChoice] = 1;

                            System.out.println("Car successfully parked in space " + parkingChoice);

                        } 
                        
                        else if(availableSpace[parkingChoice] == 1){

                            System.out.println("Sorry, parking space " + parkingChoice + " is already occupied.");
                        }

                        else {

                        System.out.println("Invalid parking space.");
                        }

                    break;


               
                case 3:

                    System.out.print("Enter the parking space to check out: ");

                    int checkoutChoice = input.nextInt();

                        if (availableSpace[checkoutChoice] == 1) {

                            availableSpace[checkoutChoice] = 0;

                            System.out.println("Car checked out successfully from space " + checkoutChoice );

                        } 

                         else if(availableSpace[checkoutChoice] == 0){

                            System.out.println("Parking space "+ checkoutChoice + " is already empty.");
                        }

                    

                        else {

                        System.out.println("Invalid parking space.");
                        }

                    break;


                
                case 4:

                    System.out.println("\nThank you for using the parking lot.");
                    packing = false;

                    break;


                
                default:

                    System.out.println("Invalid option. Please choose between 1 and 20.");
            }
        }

    }


    public static void main(String[] args) {

        int[] parkingLot = {1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,0};

        parkingSpace(parkingLot);
    }
}
