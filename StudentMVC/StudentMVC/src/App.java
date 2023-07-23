import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        List<Student> students = new ArrayList<Student>();
        // HashMap<Long,Student> students = new HashMap<>();
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);
        // students.put((long) 1, s1);
        // students.put((long) 2, s2);
        // students.put((long) 3, s3);
        // students.put((long) 4, s4);
        // students.put((long) 5, s5);
        // students.put((long) 6, s6);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        


        ModelFile fModel = new ModelFile("StudentDB.txt");
        // fModel.saveAllStudentToFile(students);
        iGetModel modelFile = fModel;
        // iGetModel model = new ModelList(students);
        iGetView view = new ViewEng();

        Controller control = new Controller(modelFile, view);
        // control.update();
        control.run();
    }
}
