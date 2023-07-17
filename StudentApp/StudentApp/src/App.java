import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    // private static boolean add;

    public static void main(String[] args) throws Exception {

        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);
        Student ss1 = new Student("Олегсей", 24, 201);
        Student ss2 = new Student("Ольга", 23, 205);
        Student ss3 = new Student("Зарина", 22, 209);
        Student ss4 = new Student("Ислам", 25, 215);
        Student sss1 = new Student("Инна", 24, 301);
        Student sss2 = new Student("Карен", 23, 305);
        Student sss3 = new Student("Любовь", 22, 309);
        Student sss4 = new Student("Изольда", 25, 315);
        Student sss5 = new Student("Александр", 17, 318);

        List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s1);
        // listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(ss1);
        listStud2.add(ss2);
        listStud2.add(ss3);
        listStud2.add(ss4);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(sss1);
        listStud3.add(sss2);
        listStud3.add(sss3);
        listStud3.add(sss4);
        listStud3.add(sss5);

        StudentGroup group4580 = new StudentGroup(listStud1, 4580, listStud1.size());
        StudentGroup group4585 = new StudentGroup(listStud2, 4585, listStud2.size());
        StudentGroup group4510 = new StudentGroup(listStud3, 4510, listStud3.size());

        List<StudentGroup> listSteam13 = new ArrayList<StudentGroup>();
        listSteam13.add(group4510);
        listSteam13.add(group4580);
        listSteam13.add(group4585);
       
        StudentSteam steam666 = new StudentSteam(listSteam13, 666);
                   
        System.out.println("=========================================================");
      
        for(StudentGroup stg: steam666) {      
            System.out.println(stg);           
            System.out.println("=========================================================");
        }

        steam666.sort();   

        System.out.println("================Sorted Groups in Steam===================");
        for(StudentGroup stg: steam666) {      
            System.out.println(stg);
            System.out.println("=========================================================");
        }
        

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        //comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);
    }   
}