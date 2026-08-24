import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Bracket1Test{


    @Test
    
    public void testThatTheBracketclosesWhenOpenIsTrueAndOtherwise(){

    String number = "[<{(<]>>)";

    boolean expected = Bracket1.brackets(number);

    boolean actual = true;

    assertEquals(expected, actual);

    }

}
