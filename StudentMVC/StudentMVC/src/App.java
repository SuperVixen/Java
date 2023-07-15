import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Model.ModelList;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        ModelList model = new ModelList(students);
        View view = new View();

        Controller control = new Controller(model, view);
        control.update();

    }
}
