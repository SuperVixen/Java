import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;

import NoteBook.Note;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        
        Note book1 = new Note("MSI", "BZ-112", (float) 16.4, "Ryzen-9500FX", 16, 500, formatter.parse("Fri, June 30, 2023"), 1);
        Note book2 = new Note("Asus", "Shadow", (float) 15.6, "i7-11400", 8, 1000, formatter.parse("Fri, June 30, 2023"), 2);
        Note book3 = new Note("Lenovo", "11235", (float) 17.2, "Pentium 1350", 4, 250, formatter.parse("Fri, June 16, 2023"), 4);
        Note book4 = new Note("Huananzhi", "F8", (float) 16.4, "Xeon E5-2667 v4", 128, 4000, formatter.parse("Mon, Mar 16, 2015"), 5);

        HashSet<Note> noteSet = new HashSet<Note>();
        noteSet.add(book1);
        noteSet.add(book2);
        noteSet.add(book3);
        noteSet.add(book4);
       
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));
        System.out.println(book2.equals(book2));

        System.out.println(noteSet.contains(book4));
        
    }
  
}
