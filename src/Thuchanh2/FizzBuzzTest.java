package Thuchanh2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void tesFizz3(){
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz6(){
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testBuzz5(){
        int number = 5;
        String expected = "Buzz";
    }
}
