import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Array3Test{


    @Test
    
    public void testThatTheNumberOfArrayInEvenNumberMultiplyByTwoAndOddPlusOne(){

    int[] number = {-1,12,17,39};

    int[] expected = Array3.array(number);

    int[] actual = {0,24, 18,40};

    assertArrayEquals(expected, actual);

    }

}
