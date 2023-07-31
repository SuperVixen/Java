package Calculator;

public interface iCalcComplex {
    
    iCalcComplex sum(double realPart, double imaginaryPart);
    iCalcComplex multi(double realPart, double imaginaryPart);
    double getResult();
}