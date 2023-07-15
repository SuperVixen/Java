package View;

import java.util.List;

import Model.Student;

public class View {
    public void printAllStudents(List<Student> students){
        System.out.println("-------------Список студентов--------------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
    }
}
