import java.util.HashMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // HashMap<Integer, String> map = HashMapTest.Test.fill();
        // HashMapTest.Test.printHashMap(map, "Иванов");
//         Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
        // HashMap<String, Integer> open = new HashMap<>();
        // open.put("(", 0);
        // open.put("[", 1);
        // open.put("{", 2);
        // open.put("<", 3);
        // HashMap<String, Integer> close = new HashMap<>();
        // close.put(")", 0);
        // close.put("]", 1);
        // close.put("}", 2);
        // close.put(">", 3);

        // System.out.println(open);
        // System.out.println(close);

        // System.out.println(BracketTest.Tester.validation(open, close, "a+(d*3)"));
        // System.out.println(BracketTest.Tester.validation(open, close, "[a+(1*3)"));
        // System.out.println(BracketTest.Tester.validation(open, close, "[6+(3*3)]"));
        // System.out.println(BracketTest.Tester.validation(open, close, "{a}[+]{(d*3)}"));
        // System.out.println(BracketTest.Tester.validation(open, close, "<{a}+{(d*3)}>"));
        // System.out.println(BracketTest.Tester.validation(open, close, "{a+]}{(d*3)}"));
        String line = "Мороз и солнце день чудесный ещё ты дремлешь друг прелестный";
        String[] sLine = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: sLine){
            map.put(s, s.length());
        }
        TreeMap sortMap = TreeMapTest.Test.sortHashMap(map);
        // sortMap.entrySet().forEach(s->System.out::println(s));
        sortMap.entrySet().forEach(System.out::println);
        // System.out.println();
    }
}
