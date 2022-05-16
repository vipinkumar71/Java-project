package mapInterface;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "Niece");
        hashMap.put(2, "Berlin");
        hashMap.put(3, "Tokyo");
        hashMap.put(4, "NewYork");
        hashMap.put(5,"Shimla");
        hashMap.put(6, "Niece");

        String s =hashMap.get(2);
        System.out.println(s);

        for (Map.Entry<Integer, String>map:hashMap.entrySet()){
            System.out.println("Key "  + map.getKey() + "-----" + " value: " + map.getValue());
        }
             ) {
            
        }
    }
}
