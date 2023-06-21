import java.util.LinkedList;

import Collection.Task2;

public class App1 {
    public static void main(String[] args) throws Exception {
          LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            Task2.enqueue(myList, Task2.randomNumbers()); //заполнение списка 20-ью случайными числами
        }
        System.out.println("===================== Список ========================");
        System.out.println(myList + "\n");

        System.out.println(Task2.dequeue(myList) + " - первый элемент, удалённый" + "\n"); // удалили первый элемент
        System.out.println("================= Оставшийся список ==================");
        System.out.println(myList + "\n");
        System.out.println(Task2.first(myList) + " - первый элемент" + "\n"); // вывели первый элемент         
    }
}
