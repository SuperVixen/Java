package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);

    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Integer getStudentIdToDelete(String msg);

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
}
