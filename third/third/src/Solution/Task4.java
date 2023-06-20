package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void exec() {
        List<List<String>> library = new ArrayList<>();
        List<String> gList = new ArrayList<>();
        List<String> fList = new ArrayList<>();
        gList.add("Проза");
        gList.add("Стругацкий");
        gList.add("Толстой");
        library.add(gList);
        fList.add("Проза");
        fList.add("Толстой");
        library.add(fList);
        System.out.println(library);
    }
}
