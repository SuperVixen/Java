package Solution;

import java.util.ArrayList;
import java.util.Arrays;
// import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void planets() {
        String[] pl = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        List<String> myList = Arrays.asList(pl);
        // System.out.println(myList);
        
        Set<String> plSet = new HashSet<>(myList);
        for(String plan: plSet) {
            System.out.println(plan + " = " + Collections.frequency(myList, plan));
        }
        // System.out.println(plSet);
    }

        public static ArrayList<String> randomFill(String[] plans) {
        ArrayList<String> planets = new ArrayList<>();
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter array size: ");
        int n = 15;// sc.nextInt();
       // sc.close();
        for (int i = 0; i < n; ++i) {
            planets.add(plans[(int) (Math.random()* plans.length)]);
        }
        System.out.println(planets);
        return planets;      
    }

    public static HashMap<String, Integer> namesCounts(ArrayList<String> planets) {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String string : planets) {
            if (dict.keySet().contains(string)) {
                dict.put(string, dict.get(string) + 1);
            } else {
                dict.put(string, 1);
            }
        }
        return dict;     
    }
}
