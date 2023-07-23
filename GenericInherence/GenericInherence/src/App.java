import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Student<String, Integer> s1 = new Student<String,Integer>("Сергей", 34, 101);
        Student<String, Integer> s2 = new Student<String,Integer>("Иван", 24, 27);
        Student<String, Integer> s3 = new Student<String,Integer>("Андрей", 27, 141);

        List<Student<String,Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        // listStud.sort();

        StudentGroup<String,Integer> group = new StudentGroup<String,Integer>(listStud, "4580" );
        // System.out.println(s1);

        for(Student<String,Integer> stud : group)
            System.out.println(stud);
    }
}
