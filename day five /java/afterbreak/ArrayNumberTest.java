import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayNumberTest{


@Test
public void testTheArrayOfNumberIfItOccurMultiplyTimeZeroIfItOccurOnceReturn(){

int[] number = {2,2,1};

int expected = ArrayNumber.arrayNumber(number);

int actual = 1;

assertEquals(actual, expected);
}
}
