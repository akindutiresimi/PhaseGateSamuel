import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LongestTest{


@Test
public void testTheArrayOfStringThatHasACommonInTheArray(){

String[] word = {"flower", "flow", "flight"};

String expected = Longest.longestString(word);

String actual = "fl";

assertEquals(actual, expected);
}
}
