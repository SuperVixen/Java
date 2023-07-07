package Domen;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    private int age;
    private String name;
    private int id;
    
    

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + name + ", id=" + id + "]";
    }


    
    
    
}