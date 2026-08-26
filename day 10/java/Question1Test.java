import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Question1Test{


    @Test
    
    public void testThatTheLastNumberIsPlusOne(){

    int[] number = {1,2,3};

    int[] expected = Question1.plusOne(number);

    int[] actual = {1,2,4};

    assertEquals(expected, actual);

    }



    @Test
    
    public void testThatTheLastNumberIsPlusOneEvenIfItNegative(){

    int[] number = {1,2,-3};

    int[] expected = Question1.plusOne(number);

    int[] actual = {1,2,2};

    assertEquals(expected, actual);

    }


}
