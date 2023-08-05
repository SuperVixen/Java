import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num_1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num_2 = in.nextInt();
        
        
        try {
            int result = divideNumbers(num_1, num_2);
            System.out.println("Result: " + result);

        }
        catch (DivisionByZeroException ex){
            System.out.println("Caught DivisionByZeroException: " + ex.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Деление на ноль не допустимо.");
        }
        return dividend / divisor;
    }
}
