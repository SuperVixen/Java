package Calculator;


public final class CalcComplex implements iCalcComplex{
    

    private double primaryArg;
    private double imagiArg;

    
    public CalcComplex(double primaryArg, double imagiArg) {
        this.primaryArg = primaryArg;
        this.imagiArg = imagiArg;
    }

    // @Override
    // public iCalcComplex sum(Double arg, Double imArg) {
    //     primaryArg += arg;
    //     imagiArg += imArg;
    //     return this;
    // }

    // @Override
    // public iCalcComplex multi(Double arg, Double imArg) {
    //     primaryArg *= arg;
    //     imagiArg *= imArg;
    //     return this;
    // }

    // public CalcComplex(int i, int j) {
    // }

    @Override
    public iCalcComplex sum(double realPart, double imaginaryPart) {
        primaryArg += realPart;
        imagiArg += imaginaryPart;
        return this;
    }

    @Override
    public iCalcComplex multi(double realPart, double imaginaryPart) {
        primaryArg *= realPart;
        imagiArg *= imaginaryPart;
        return this;
    }

    @Override
    public double getResult() {
        return primaryArg + imagiArg;
    }
}