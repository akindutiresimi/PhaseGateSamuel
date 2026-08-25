import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SimpleParkingLotTest{


    @Test
    
    public void testThatTheParkingLotHasParkingSpace(){

    int[] space = {1,1,1,1,0,0};

    int expected = SimpleParkingLot.parkingSpace(space);

    int actual = 2;

    assertEquals(expected, actual);

    }



     @Test
    
    public void testThatTheParkingLotHasNoParkingSpace(){

    int[] space = {1,1,1,1,0,0};

    int expected = SimpleParkingLot.parkingChoice(space);

    int actual = 4;

    assertEquals(expected, actual);

    }
}
