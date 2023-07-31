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
       String firstArg = oldCalc.getResult();

       logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %f + %f * i", firstArg, arg, imArg));
       iCalcComplex result = oldCalc.sum(arg, imArg);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalcComplex multi(double arg, double imArg) {
       String firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметром %f + %f * i", firstArg, arg, imArg));
        iCalcComplex result = oldCalc.multi(arg, imArg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public String getResult() {
        String result = oldCalc.getResult();
        logger.log(String.format("Получение результата " + result));
        return result;
    }

    @Override
    public iCalcComplex div(double arg, double imArg) {
        String firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода div с параметром %f + %f * i", firstArg, arg, imArg));
        iCalcComplex result = oldCalc.div(arg, imArg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }
    
}