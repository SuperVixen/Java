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


1) Сделать вариант класса ViewEng с текстом на английском языке, подключить к нему интерфейс iGetView. Класс ViewEng подключить к контроллеру.
2) Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>, подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.
3) Добавить команду в метод run класса контролер по удалению студента:
Для этого: Добавить в switch команду DELETE
- запросить у пользователя номер студента на удаление
- вызов удаления у модели(метод добавить в интерфейс iGetModel)
- если такого нромера нет, то сообщить об этом
Весь код прокомментировать и добавить само-документацию.