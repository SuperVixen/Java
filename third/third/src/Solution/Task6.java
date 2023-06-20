package Solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task6 {
    public static List<Integer> randomNumberz(int n) {
        Random rnd = new Random();
        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < n; i++)
            myList.add(rnd.nextInt(80));
        System.out.println(myList);
        // System.out.println(myList.getClass().getName());
        // System.out.println(myList.getClass().getSimpleName());
        return myList;
    }

    public static int[] randomNumbers(int n) {
        Random rnd = new Random();
        int[] myList = new int[n];
        
        for(int i = 0; i < myList.length; i++)
            myList[i] = rnd.nextInt(80); 
        System.out.println(Arrays.toString(myList));
        return myList;
    }
}
