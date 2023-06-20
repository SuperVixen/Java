import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        String line = new String();
        String querry = "select * from students where ";
        StringBuilder result = new StringBuilder(querry);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {            
            
            while ((line = br.readLine()) != null) {
                line = line.replace("{", "").replace("}", "").replace(" ", "");     //удаляю фигурные скобки, пробелы         
                String [] arrayData = line.split(",");                              //данные в массив строк
                for (int i = 0; i < arrayData.length; i++) {
                    String [] arData = arrayData[i].split(":");                     //разбираю строку на название и значение (строковые)
                    arData[0] = arData[0].replace("\"", "");                        //убираю кавычки
                    // arData[1] = arData[1].replace("\"", "");
                    if (arData[1].equals("null") == false) {                        //я не понимаю, в "иначе" не заходит вообще
                        if(i < arrayData.length - 1) {
                        result.append(arData[0]);
                        result.append(" = ");
                        result.append(arData[1] + " AND "); 
                        } else {
                            result.append(arData[0]);
                            result.append(" = ");
                            result.append(arData[1]);
                        }
                    } else {
                        System.out.println("!!!!!");                                //
                    }              
                }  
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }
    