package Calculator;



// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        iCalcComplex calculator = new CalcComplex(0, 0);

        iCalcComplex newCalcLog = new CalcDecorator(calculator, new Logger());
        
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}