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

Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет все операции операции(+, -, '', /) и возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
Важно! С использованием принципа одного уровня абстракции!
*В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.

В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower() и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.

Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**