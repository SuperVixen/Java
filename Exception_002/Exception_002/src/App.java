import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num_1 = in.nextInt();
        
        
        
        try {
            // int result = isItPositive(num_1);
            System.out.println(isItPositive(num_1));

        }
        catch (InvalidNumberException ex){
            System.out.println("Caught InvalidNumberException: " + ex.getMessage());
        }
    }

    public static String isItPositive(int num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число.");
        }
        return "Число корректно";
    }
}
