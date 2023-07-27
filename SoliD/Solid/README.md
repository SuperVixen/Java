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


Базовое задние:
1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}
​
Подсказка: вынесите метод calculateNetSalary() в отдельный класс


2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
public double calculateAllowedSpeed(Vehicle vehicle) {
if (vehicle.getType().equalsIgnoreCase("Car")) {
return vehicle.getMaxSpeed() * 0.8;
} else if (vehicle.getType().equalsIgnoreCase("Bus")) {
return vehicle.getMaxSpeed() * 0.6;
}
​
return 0.0;
}
}
public class Vehicle {
int maxSpeed;
String type;
public Vehicle(int maxSpeed, String type) {
this.maxSpeed = maxSpeed;
this.type = type;
}
public int getMaxSpeed() {
return this.maxSpeed;
}
public String getType() {
return this.type;
}
}
​
Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP



3) Переписать код в соответствии с Interface Segregation Principle:
public interface Shape {
double area();
double volume();
}
public class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double area() {
return 2 * 3.14 * radius;
}
@Override
public double volume() {
throw new UnsupportedOperationException();
}
}
public class Cube implements Shape {
private int edge;
public Cube(int edge) {
this.edge = edge;
}
@Override
public double area() {
return 6 * edge * edge;
}
@Override
public double volume() {
return edge * edge * edge;
}
}
​
Подсказка: круг не объемная фигура и этому классу не нужен метод volume().