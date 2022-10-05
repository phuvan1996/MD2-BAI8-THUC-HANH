package test;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculator (int firsOperand, int secondOperand, char operator){
        switch (operator){
            case ADDITION:
                return firsOperand+secondOperand;
            case SUBTRACTION:
                return firsOperand-secondOperand;
            case MULTIPLICATION:
                return firsOperand*secondOperand;
            case DIVISION:
                if (secondOperand!=0)
                    return firsOperand/secondOperand;
                else
                    throw new RuntimeException("can not divide by 0");
            default:
                throw new RuntimeException("unsupported operation");
        }
    }
}
