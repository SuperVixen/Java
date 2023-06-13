import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task1();
        // task3();
        // task4();
        // task5();
        calculator();
        // System.out.println("Hello, World!");
    }

    public static void calculator() {// ничего на вход не передаём, спрашиваем у user'а числа и операцию
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        String numberOne = scan.nextLine();
        System.out.println("Enter 2nd number: ");
        String numberTwo = scan.nextLine();
        System.out.println("Enter opertion symbol (+, -, * , /): ");
        String operation = scan.nextLine();
        scan.close();

        System.out.println(numberOne + " " + operation + " " + numberTwo + " = " + mathematics(numberOne, numberTwo, operation));    
    }

    private static float mathematics(String a, String b, String c) {
        float result = 0; 
        float aNumeric = Float.parseFloat(a);
        float bNumeric = Float.parseFloat(b);
        switch (c) {
            case "+":
                result = aNumeric + bNumeric;
                break;
            case "-":
                result = aNumeric - bNumeric;
                break;
            case "*":
                result = aNumeric * bNumeric;
                break;
            case "/":
                result = aNumeric / bNumeric;
                break;
            default: System.out.printf("Error! Enter correct operator");
                break;
        }
        return result;
    }
}
