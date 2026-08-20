import java.util.Scanner;
public class SimpleTransaction{

    public static int currentAmount(int amount){

    amount =  1000;   

    return amount;

    }
   
    public static int depositedAmount(int amount){

    amount = 5000;  

    return amount;

    }

    public static int newCurrentAmount(int currentAmount, int depositedAmount){

    int newCurrentAmount =  depositedAmount + currentAmount;  

    return newCurrentAmount;
    }


    public static int amountDeducted(int amountWithdraw) {

    int amountWillingWithdraw = 7000;

    return  amountWillingWithdraw; 

    }

    public static int newBalanceAfterWithdraw(int newCurrentAmount, int amountDeducted){
 
    int accountBalance = newCurrentAmount - amountDeducted;
      
    return accountBalance;

    }






    public static void main(String[] Args){

    Scanner input = new Scanner(System.in);

    int amount = 1000;
    
    String menu = """

    1 Deposit   
    2 Withdraw
    3 Show Transaction
    4 Exit

                  """;

    System.out.println(menu);

    int menuList = input.nextInt();

    Switch(menuList);
    
    case 1:
            System.out.println("Deposit");

            System.out.print("Enter a deposit amount");
            int deposit = input.nextInt();


            System.out.println(newCurrentAmount(currentAmount, depositedAmount));


    case 2:
            System.out.println("Withdraw");

            System.out.println("Enter amount You want to Withdraw");


                if(Withdraw > newCurrentAmount){
                     System.out.println("insufficient funds")
                }


                 else{
                    System.out.println(newCurrentAmount(currentAmount, amountDeducted));
                 }

    case 3:
            System.out.println("Show Transaction");
            
            




    case 4:
            System.out.println("Exit");




















}

}
