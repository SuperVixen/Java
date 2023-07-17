package Domen;

public class Teacher extends Person implements Comparable<Teacher>{
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }


    public String getAcadDegree() {
        return acadDegree;
    }

   
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
    
    @Override
    public String toString() {
        return "Teacher " + super.getName() + ", age=" + super.getAge() + ", degree" + acadDegree + "\n";
    }

    @Override
    public int compareTo(Teacher o) {
        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(acadDegree==o.acadDegree)return 0 ;
            // if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1; 
    }
}