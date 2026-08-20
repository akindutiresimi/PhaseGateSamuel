import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTransactionTest{

    @Test
    public void testToCheckTheCurrentAmount() {
    
    int currentAmount = 1000;
    
    int expected = SimpleTransaction.currentAmount(currentAmount);
    int actual = 1000;
       
    assertEquals(actual, expected);
    }


     @Test 
    public void testToCheckTheAcountAmountAfterAddingToCurrentAmount() {

    int depositedAmount = 5000;
    
    int expected = SimpleTransaction.depositedAmount(depositedAmount);
    int actual = 5000;
       
    assertEquals(actual, expected);
    }



    @Test 
    public void testToCheckTheNewAcountAmountAfterAddingToDepositAmount() {
    
    int currentAmount  = 1000;
    int depositedAmount = 5000;
    
    int expected = SimpleTransaction.newCurrentAmount(depositedAmount, currentAmount);
    int actual = 6000;
       
    assertEquals(actual, expected);
    }




    @Test
    public void testToCheckTheAmountWillingToWithdraw(){
    
    int withdraw = 7000;
 
    int expected = SimpleTransaction.amountDeducted(withdraw);
    int actual = 7000;
       
    assertEquals(actual, expected);  
    }




   @Test
    public void testToShowTheAccountBalanceAfterTheAmountWillingToWithdrawIsGreaterThanTheBalance(){
    
    int newCurrentAmount = 6000;
    int withdraw = 7000;
 
    int expected = SimpleTransaction.newBalanceAfterWithdraw(newCurrentAmount,withdraw);
    int actual = -1000;
       
    assertEquals(actual, expected);  
    }
}
