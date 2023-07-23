package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    

    @Override
    public List<Student> studentIdToDelete(int id) {
        students.remove(id);
        return students;
    }
}
