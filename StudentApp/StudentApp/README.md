## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль

1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс iPersonService. Добавить метод вывода списка учителей отсортированного обобщенным классом PersonComparator
2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс iPersonController.
3) Разработать обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников. Вывести результат работы класса на консоль.

(Задача со *) Переписать иерархию Person->Student/Teacher/Emploee в иерархию обобщенных типов.

Формат сдачи: ссылка на гитхаб проект