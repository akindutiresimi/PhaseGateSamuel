import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Question3Test{


    @Test
    
    public void testThatTheLastNumberIsPlusOne(){

    int[] number  = {1,2,3,1};

    boolean expected = Question3.numbers(number);

    boolean actual = true;

    assertEquals(expected, actual);

    }

}
