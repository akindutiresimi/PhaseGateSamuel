import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AddDigitTest{

@Test
public void testTheAdditionOfANumber(){

int number = 38;

int expected = AddDigit.addNumber(number);

int actual = 2;

assertEquals(actual, expected);

}
}



