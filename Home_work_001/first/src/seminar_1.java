import java.util.ArrayList;
import java.util.List;

public class seminar_1 {
    // сумма чисел от 1 до n
    public static int Sum(int N){ //O(N)
        int result = 0;
        // for(int i = 1; i <= N; i++){
        //     result += i;
        // }
        return result = N * (N + 1) / 2;//O(1)
    }

    //Поиск делителей
    public static List<Integer> findAvialableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
    
    //Простые числа от 1 до 1000
    public static List<Integer> findSimpleNumbers(int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i ++) {
            boolean simple = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Sum(99)); // сумма чисел от 1 до n
        System.out.println(findAvialableDivider(120)); //Поиск делителей
        System.out.println(findSimpleNumbers(1000)); //Простые числа от 1 до 1000
    }

}