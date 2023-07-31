package Calculator;

public class CalcDecorator implements iCalcComplex {

    private iCalcComplex oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalcComplex oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalcComplex sum(double arg, double imArg) {
       double firstArg = oldCalc.getResult();

       logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода sum с параметром %f", firstArg, arg));
       iCalcComplex result = oldCalc.sum(arg, imArg);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalcComplex multi(double arg, double imArg) {
       double firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода multi с параметром %f", firstArg, arg));
        iCalcComplex result = oldCalc.multi(arg, imArg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public double getResult() {
        double result = oldCalc.getResult();
        logger.log(String.format("Получение результата " + result));
        return result;
    }
    
}