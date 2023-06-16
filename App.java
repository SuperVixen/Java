import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class App {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) throws IOException {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] arrayToSort = { 18, 9, -4, 33, -31, 22, 5 };
            bubbleSort(arrayToSort);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }      
    }


    public static void bubbleSort(int[] arrayToSort){
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for(int j = 0; j < arrayToSort.length - i - 1; j++) {
                if(arrayToSort[j + 1] < arrayToSort[j]) {
                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = swap;
                }
                writeLog(Arrays.toString(arrayToSort));
            }         
        }
    }    

    public static void writeLog(String note) {
        
        try(FileWriter writer = new FileWriter("log.txt"))
        {
           fileWriter.write(note + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
