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

Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
