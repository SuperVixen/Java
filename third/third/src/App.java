// Задание

// Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Solution.Task5;
import Solution.Task6;
import Solution.Task7;
import Solution.Task8;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" =============== "   + "Fisrt task" + " ================= ");
        System.out.println(Arrays.toString(Task7.mergesort(Task6.randomNumbers(15))) + "\n");
        System.out.println(" =============== "   + "Second task" + " ================= ");
        System.out.println(Task5.evenFilter(Task6.randomNumberz(20)) + "\n");
        System.out.println(" =============== "   + "Third task" + " ================= ");
        List<Integer> myList = Task6.randomNumberz(10);
        System.out.println(
        "Min = " + Collections.min(myList) + "\n"
        + "Max = " + Collections.max(myList) + "\n"
        + "Average = " + Task8.average(myList)
        );
    }

    

    

}
