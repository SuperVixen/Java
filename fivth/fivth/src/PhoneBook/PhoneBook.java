package PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> contacts = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        if(contacts.containsKey(name)){
            ArrayList<String> phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<String>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }
// <String>
    public static void printContacts() {
        ArrayList<Map.Entry<String, ArrayList<String>>> list = new ArrayList<>(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<String>>>(){
            @Override
            public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        for(Map.Entry<String, ArrayList<String>> entry: list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
