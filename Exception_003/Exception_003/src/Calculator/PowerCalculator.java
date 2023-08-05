package Calculator;

public class PowerCalculator {
    public double calculatePower(double a, double b) throws InvalidInputException {
        if(a == 0 || b < 0) 
            throw new InvalidInputException("Некорректное основание или отрицательная степень."); 
        return Math.pow(a, b);
    }
}
