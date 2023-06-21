package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void TimeTest(int size) {
        Random rnd = new Random();
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();
        // ArrayList<Integer> simpleList1 = new ArrayList<>();
        // LinkedList<Integer> linkList1 = new LinkedList<>();
        long curTime = System.currentTimeMillis();
        // System.out.println(curTime);
        curTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++)
            simpleList.add(1);
        System.out.println("Simple to end " + (System.currentTimeMillis() - curTime));
        curTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++)
            linkList.add(1);
        System.out.println("Linked to end " + (System.currentTimeMillis() - curTime));


        simpleList.clear();
        linkList.clear();

        curTime = System.currentTimeMillis();
        for(int i = 0; i < size/10; i++)
            simpleList.add(0, 1);
        System.out.println("Simple to head " + (System.currentTimeMillis() - curTime));
        for(int i = 0; i < size/10; i++)
            linkList.add(0, 5);
        System.out.println("Linked to head " + (System.currentTimeMillis() - curTime));

        curTime = System.currentTimeMillis();
        for(int i = 0; i < size/10; i++)
            simpleList.add(rnd.nextInt(10000), 1);
        System.out.println("Simple to middle " + (System.currentTimeMillis() - curTime));
        for(int i = 0; i < size/10; i++)
            linkList.add(rnd.nextInt(10000), 5);
        System.out.println("Linked to middle " + (System.currentTimeMillis() - curTime));
    }
}
