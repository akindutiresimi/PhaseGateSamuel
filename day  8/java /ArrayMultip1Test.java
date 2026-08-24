import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayMultip1Test{


    @Test
    
    public void testThatTheAdditionOfInnerArrayBringANewArray(){

    int[][] number = {{3,5,7}, {2,2,2}, {4,1,7}};

    int[] expected = ArrayMultip1.arrayMultip(number);

    int[] actual = {15, 6, 14};

    assertArrayEquals(expected, actual);

    }

}
