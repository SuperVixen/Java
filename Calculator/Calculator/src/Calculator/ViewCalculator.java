package Calculator;



import java.util.List;
import java.util.Scanner;

public class ViewCalculator {

    private iCalcComplex calculator;

    public ViewCalculator(iCalcComplex calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double primaryArg = promptDouble("Введите вещественную часть первого числа: "); 
            double imagiArg = promptDouble("Введите мнимую часть первого числа: ");
           
            calculator.sum(primaryArg, imagiArg);
            // calculator.sum(imagiArg);
          
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptDouble("Введите вещественную часть второго числа: ");
                    double imArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.multi(arg, imArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptDouble("Введите вещественную часть второго числа: ");
                    double imArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.sum(arg, imArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = promptDouble("Введите вещественную часть второго числа: ");
                    double imArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.div(arg, imArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
    
}