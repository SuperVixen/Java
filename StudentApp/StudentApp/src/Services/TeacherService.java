package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }    
    
    // @Override
    // public void create(String name, int age) {
    //     Teacher per = new Teacher(name, age, count);
    //     count++;
    //     teachers.add(per);
    // }    

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    public void sortByFIOTchLst()
    {
        teachers.sort( new PersonComparator<Teacher>());        
    }

    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}