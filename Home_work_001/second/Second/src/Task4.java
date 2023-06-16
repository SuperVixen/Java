import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static List<String> fileNamez(String dirPath) {
        List<String> fileName = new ArrayList<>();
        File directory = new File(dirPath);
        if (directory.isDirectory()){
            for (File item: directory.listFiles()){
                fileName.add(item.getName());
                try {
                    System.out.println(item.getName().substring(item.getName().lastIndexOf(".")));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        


        return fileName;
    }
}
