package Solution;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void ex() {
        Random rnd = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            myList.add(rnd.nextInt(20));
        System.out.println(myList);
        Collections.sort(myList);
        
        // myList.sort(null);
        System.out.println(myList);

    }

}
