import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Question2Test{


    @Test
    
    public void testThatTheNumberOccurTwiceOrMore(){

    int[] number1 = {1,2,2,1};
    int[] number2 = {2,2};

    int expected = Question2.number(number1, number2);

    int actual = 2;

    assertEquals(expected, actual);

    }

}
