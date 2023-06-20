import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    //строка из 100 повторений слова TEST - метод
    //записать в простой текстовый файл - метод
    //обработать исключения
    public static void oneHundred(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++){
            sb.append(input);
        }                
        try {
            saveString(sb.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//вызвать функцию записи        
    }

    public static void saveString(String input) throws IOException {
        File file = new File("test.txt");
        FileWriter fw = new FileWriter(file, false); 
            fw.write(input);
            fw.flush();
        
    }
}
