import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Bracket2Test{


    @Test
    
    public void testThatTheNumberOfArrayInEvenNumberMultiplyByTwoAndOddPlusOne(){

    int[] number = {12,17,39};

    int[] expected = Array2.array(number);

    int[] actual = {24, 18,40};

    assertArrayEquals(expected, actual);

    }

}
