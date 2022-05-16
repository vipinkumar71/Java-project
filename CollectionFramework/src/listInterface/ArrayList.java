package listInterface;

import java.awt.print.Book;
import java.util.List;
public class ArrayList{
    public static void main(String[] args) {

     List<String> list = new java.util.ArrayList<>();
      list.add("Book");
      list.add("NoteBook");
      list.add("pen");
      list.add("Bag");
      list.add("Book");
      list.set(4, "MacBook");
//      int index = list.indexOf("Book");
//       System.out.println(index);

//        int index2 = list.lastIndexOf("Book");
//        System.out.println(index2);
//        list.remove(0);
      for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i ));
      }

//        System.out.println(list.indexOf("pen"));
//      int index = list.indexOf("pen");
//        System.out.println(index);
    }
}
// Collection Framework
// Array List
// Array can not expand but arrayList can. Array only can be define once.


// listInterface.ArrayList <String> list1 = new listInterface.ArrayList();
// List<String> list1 = new listInterface.ArrayList();