package Collection;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {

    public static int randomNumbers() { //генератор случайных чисел для списка
        Random rnd = new Random();
        int num = rnd.nextInt(50); //50 - верхний невключаемый предел генерации значений
        return num;
    }

    public static void enqueue(LinkedList<Integer> myList, int num) {//добавление элемента в конец очереди
        myList.addLast(num);
        // System.out.println(num);
    }

    public static int dequeue(LinkedList<Integer> myList) { //возвращение 1st элемента с удалением его
        int num = myList.pop();        
        return num;
    }

    public static int first(LinkedList<Integer> myList) { //возвращение первого элемента
        int num = myList.get(0);
        return num;
    }

    
}
