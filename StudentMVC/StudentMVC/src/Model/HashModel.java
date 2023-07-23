package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    private HashMap<Long, Student> students;

    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }

// Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>, подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.

     @Override
    public List<Student> getAllStudents()
    {
        List<Student> valueList = new ArrayList<Student>(students.values());
        return valueList;
    }

    
    @Override
    public List<Student> studentIdToDelete(int id) {
        
        List<Student> valueList = new ArrayList<Student>(students.values());
        valueList.remove(id);
        return valueList;
    }
}


