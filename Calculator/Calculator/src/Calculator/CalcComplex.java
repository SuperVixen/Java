package Calculator;


public final class CalcComplex implements iCalcComplex{
    

    private double primaryArg;
    private double imagiArg;

    
    public CalcComplex(double primaryArg, double imagiArg) {
        this.primaryArg = primaryArg;
        this.imagiArg = imagiArg;
    }

    
    @Override
    public iCalcComplex sum(double realPart, double imaginaryPart) {
        primaryArg += realPart;
        imagiArg += imaginaryPart;
        return this;
    }

    @Override
    public iCalcComplex multi(double realPart, double imaginaryPart) {
        primaryArg = primaryArg * realPart - imagiArg * imaginaryPart;
        imagiArg = primaryArg * imaginaryPart + imagiArg * realPart;
        return this;
    }

    @Override
    public String getResult() {
        // return primaryArg + imagiArg;
        // String total2 = String.valueOf(total);
        return String.valueOf(primaryArg) + " + " + String.valueOf(imagiArg) + "* i";
    }


    @Override
    public iCalcComplex div(double realPart, double imaginaryPart) {
        double denominator = realPart * realPart + imaginaryPart * imaginaryPart;
        primaryArg = (primaryArg * realPart + imagiArg * imaginaryPart) / denominator;
        imagiArg = (imagiArg * realPart - primaryArg * imaginaryPart) / denominator;
        return this;
    }
}