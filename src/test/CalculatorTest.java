package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends Calculator{
    @Test
    @DisplayName("Testing addition")
    void tesCalculatorAdd(){
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing subtraction")
    void testCaculateMul(){
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("testing multiplication")
    void testCalculateMul(){
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing division by zore ")
    void testCalculateDivByZero(){
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                ()-> Calculator.calculator(a,b,o));
    }
    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator(){
        int a = 2;
        int b = 0;
        char o ='=';
        assertThrows(RuntimeException.class,()-> Calculator.calculator(a,b,o));
    }
}
