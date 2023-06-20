package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task5 {
    
    public static List<Integer> evenFilter(List<Integer> intList) {
        List<Integer> evenList = new ArrayList<>();
        for(Integer number: intList)
            if(number % 2 == 0)
                evenList.add(number);
        intList.removeAll(evenList);
        return intList;
    }
}
