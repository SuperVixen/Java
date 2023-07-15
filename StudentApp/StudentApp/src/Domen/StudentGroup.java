package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> group;
    private Integer idGroup;
    public Integer groupSize;

    public StudentGroup(List<Student> group, Integer idGroup, Integer groupSize) {
        this.group = group;
        this.idGroup = idGroup;
        this.groupSize = groupSize;
    }

    public List<Student> getGroup() {
        return group;
    }

    // public int getGroupSize() {
    //     return group.size();
    // }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getGroupSize() {
        return groupSize;
    }

     @Override
    public String toString() {
        return "Group " + idGroup + ":\n" + group +", people: " + getGroupSize();
    }

    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }
    @Override
    public int compareTo(StudentGroup o) {

        return Integer.compare(this.getGroupSize(), o.getGroupSize());
        // if(this.getGroupSize() > o.getGroupSize())
        //     return 1;
        // else if (this.getGroupSize() < o.getGroupSize())
        //     return -1;
        // else
        //     return 0;
    }
   
}