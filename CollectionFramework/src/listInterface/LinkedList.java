package listInterface;

import java.util.List;
import java.util.ListIterator;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Berlin");
        list.add("Paris");
        list.add("USA");
        list.add("UK");
        list.add("Home");

        ListIterator<String> iterator= list.listIterator();
     while(iterator.hasNext()){
         System.out.println(iterator.next());
     }

    }
}
