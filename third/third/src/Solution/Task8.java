package Solution;

import java.util.List;

public class Task8 {
    public static Float average(List<Integer> myList) {
        int sum = 0, count = 0;
        // float result = 0;
        for(Integer number: myList){
            sum += number;
            count += 1;
        }
        return (float) (sum / count);
    }
}
