package setInterface;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        set.add("Two");
        set.add("Three");
        set.add("One");
        set.add("five");

        for (String s:set) {
            System.out.println(s);
        }
    }
}
