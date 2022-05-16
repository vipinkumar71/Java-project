package setInterface;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String > set = new java.util.LinkedHashSet<>();
        set.add("one");
        set.add("Two");
        set.add("three");
        set.add("four");
        set.add("five");
        Iterator<String> iterator =  set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
