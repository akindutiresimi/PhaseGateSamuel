import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Array1Test{


    @Test
    
    public void testThatTheNumberOfArrayInEvenNumberMultiplyByTwoAndOddPlusOne(){

    int[] number = {2,8,14,5,1};

    int[] expected = Array1.array(number);

    int[] actual = {4,16,28,6,2};

    assertArrayEquals(expected, actual);

    }

}
