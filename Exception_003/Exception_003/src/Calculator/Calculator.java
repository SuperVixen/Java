package Calculator;

public class Calculator {
    public double divide(double a, double b) {
        if(b == 0) 
            throw new ArithmeticException("Division by zero not allowed"); 
        return a / b;
    }

    public double multiply(double a, double b) {
        if(a > Double.MAX_VALUE / b)
            throw new ArithmeticException("Double type overflow");
        return a * b;
    }

    public double subtract(double a, double b) {
        if (a < b)
            throw new ArithmeticException("Первое число меньше второго!");
        return a - b;
    }

    public double sum(double a, double b) {
        if (a > Double.MAX_VALUE - b)
            throw new ArithmeticException("Double type overflow");
        return a + b;
    }
}
