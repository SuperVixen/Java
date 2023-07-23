package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.Student;

public class Controller {
    private iGetModel model;
    private iGetView view;
    // private List<Student> students = new ArrayList<>();
    private HashMap<Long,Student> studs = new HashMap<>();
    List<Student> students = new ArrayList<Student>(studs.values()); 
    
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students){
        if(students.size() > 0)
            return true;
        else
            return false;
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
            view.printAllStudents(students);
        else
            System.out.println("Список студентов пуст!");

        
        //MVC
        // view.printAllStudents(model.getAllStudents());
    }


    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        // String idPrompt = new String();
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    model.studentIdToDelete(view.getStudentIdToDelete("Введите Id студента для удаления: "));
                    break;
                default:
                    break;
            }
        }

    }
}
