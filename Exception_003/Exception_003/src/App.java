import java.util.Scanner;

import Calculator.Calculator;
import Calculator.PowerCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Calculator calculator = new Calculator();
        PowerCalculator calc = new PowerCalculator();

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num_1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num_2 = in.nextInt();

            try {
                System.out.println("Деление: " + calculator.divide(num_1, num_2));
            } catch (Exception e) {
                System.out.println("Деление. Произошла ошибка: " + e.getMessage());// TODO: handle exception
            }

            try {
                System.out.println("Умножение: " + calculator.multiply(num_1, num_2));
            } catch (Exception e) {
                System.out.println("Умножение. Произошла ошибка: " + e.getMessage());// TODO: handle exception
            }

            try {
                System.out.println("Вычитание: " + calculator.subtract(num_1, num_2));
            } catch (Exception e) {
                System.out.println("Вычитание. Произошла ошибка: " + e.getMessage());// TODO: handle exception
            }

            try {
                System.out.println("Сложение: " + calculator.sum(num_1, num_2));
            } catch (Exception e) {
                System.out.println("Сложение. Произошла ошибка: " + e.getMessage());// TODO: handle exception
            }

            try {
                System.out.println("Степень: " + calc.calculatePower(num_1, num_2));
            } catch (Exception e) {
                System.out.println("Степень. Произошла ошибка: " + e.getMessage());// TODO: handle exception
            }

        }
    }
}
