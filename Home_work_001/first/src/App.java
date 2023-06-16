<<<<<<< HEAD
// import java.time.LocalTime;
// import java.util.Arrays;
=======
>>>>>>> b011f407dffd60a6d1a0a74abb6e6a07808355cd
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task1();
        // task3();
        // task4();
        // task5();
        calculator();
        // System.out.println("Hello, World!");
<<<<<<< HEAD
=======
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
>>>>>>> b011f407dffd60a6d1a0a74abb6e6a07808355cd
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

    private static void task1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter ur name: ");
        String name = iScanner.nextLine();
        System.out.println("Hello, " + name + "!");    
        iScanner.close();
        task2(name);
    }

    public static void task2(String name) {
        LocalTime timeofday = LocalTime.now();
        System.out.println(timeofday);
        if (timeofday.getHour() >= 18 && timeofday.getHour() < 23) {
            System.out.println("Good evening, " + name + "!");
        } else if (timeofday.getHour() >= 23 && timeofday.getHour() < 5) {
            System.out.println("Good night, " + name + "!");
        } else if (timeofday.getHour() >= 5 && timeofday.getHour() < 12) {
            System.out.println("Good morning, " + name + "!");
        } else if (timeofday.getHour() >= 12 && timeofday.getHour() < 18) {
            System.out.println("Good afternoon, " + name + "!");
        }
        
    }

    //дан массив чисел вида [1, 1, 0, 0, 0, 1, 0, 1, 1, 1] вывести максимальное количество подряд идущих единиц
    private static void task3() {

        int[] my_array = {1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int max_count = 0;

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == 1) {count++;}
                else {
                if (count > max_count) {max_count = count;}
                count = 0; 
                }
        }
        if (max_count < count) {
            max_count = count; 
        }
    System.out.println(max_count);
    }

    private static void task4() {
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
        // конец массива.
        // Таким образом, первые несколько (или все) элементов массива должны быть
        // отличны от заданного, а остальные - равны ему.

        int[] arr = new int[] { 1, 1, 0, 3, 1, 1, 3, 0, 1 };
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                arr[arr.length - 1] = val;
            }
        }

        for (int item : arr)
            System.out.printf("%d\t", item);

    }

    public static int findPrefix(String[] strs){
        String[] lStrs = Arrays.stream(strs).map(s->s.toLowerCase()).toArray(String[]::new);
        String first = lStrs[0];
        boolean found = false;
        int result = 0;
        for(int prefixLenght = 1; prefixLenght < first.length(); prefixLenght++){
            String prefix = first.substring(0, prefixLenght + 1);
            boolean match = true;
            for(int i = 1; i < lStrs.length; i++){
                String checkingStr = lStrs[i];
                if(!checkingStr.startsWith(prefix)){
                    match = false;
                    break;
                }
            }
            if(match){
                result = prefixLenght;
            }
            else break;
        }
        return result;
    }

    private static void task5() {
        // Напишите метод, который находит самую длинную строку общего префикса среди
        // массива строк.
        // Если общего префикса нет, вернуть пустую строку "".
        String[] lines = { "dom", "domovoy", "domashniy" };
        System.out.println(findPfx(lines));
        System.out.println(lines[0].substring(0, findPfx(lines)));

    }

    private static int findPfx(String[] lines) {
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) {
            res++;
            for (int i = 0; i < (lines.length - 1); i++) {
                if (res <= lines[i].length() && res <= lines[i + 1].length()) {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                        res--;
                        pfxExist = false;
                        break;
                    }
                } else {
                    res--;
                        pfxExist = false;
                        break;
                }
            }
        }
        return res;
    }


}
