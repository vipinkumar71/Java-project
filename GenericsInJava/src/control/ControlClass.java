package control;

public class ControlClass {

    // E means I can give Parameter whatever I want
    public static <E> void printArray(E [] arr) {
        for (E a : arr) {
            System.out.println(a);
        }
    }

}

