package Domen;

import java.util.Comparator;

public class GroupComparator<T extends StudentGroup> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
       int res = o1.getGroupSize().compareTo(o2.getGroupSize());
        if (res == 0) {
            // if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                // if (o1.getAge() > o2.getAge()) {
                    // return 1;
                // } else {
                    return -1;
                }
            // }
        // } else {
            // return res;
        }
    }
   
    
// }
