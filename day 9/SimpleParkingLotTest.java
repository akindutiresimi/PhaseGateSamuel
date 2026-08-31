import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SimpleParkingLotTest{


    @Test
    
    public void testThatTheParkingLotHasParkingSpace(){

    int[] space = {1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1};

    int[] expected = SimpleParkingLot.parkingSpace(space);

    int[] actual = {4,5,9,10,11,12,13,14,15,17};

    assertArraysEquals(expected, actual);

    }



     @Test
    
    public void testThaTheEmptyParkingLotCanBeOccupiedByPickingASlotInTheEmptySpace(){

    int[] space = {1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1};
    int expected = SimpleParkingLot.enterLotSpace(space);

    int actual = 4;

    assertEquals(expected, actual);

    }
}
