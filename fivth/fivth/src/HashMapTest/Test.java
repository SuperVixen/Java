package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static HashMap<Integer, String> fill() {
        HashMap<Integer, String> outMap = new HashMap<>();
        outMap.put(1233212, "Иванов");
        outMap.put(1236612, "Петров");
        outMap.put(3433212, "Иванов");
        outMap.put(321456, "Васильев");
        outMap.put(234561, "Петрова");
        return outMap;

    }

    public static void printHashMap(HashMap<Integer, String> outMap, String searchValue) {
        for(Map.Entry<Integer, String> item: outMap.entrySet()){
            if(item.getValue() == searchValue){
                System.out.println(item.getValue()+" - "+ item.getKey());
            }
            
        }
    }

}