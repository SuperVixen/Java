package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkListSolution {

    private static LinkedList<String> list = new LinkedList();

    public static void run() {
        boolean getIteration = true;
        while (getIteration) {
            String cmd = InputUser("Enter the command: ");
            String[] cLine = cmd.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    while (list.size() > 0)
                        System.out.println(list.pop());
                    break;
                case "REVERSE":                   
                    for (int i = list.size() - 1; i >= 0 ; i--) 
                    System.out.print(list.get(i) + "\n");                    
                    break;
                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine);
                        } 
                    }else
                        list.addFirst(cLine[0]);
                    System.out.println(list);
                    break;
            }
        }
    }

    private static String InputUser(String message) {
        System.out.print(message + " ->");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }

    private static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static List<String> adder(String[] splitted) {

        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }
}
