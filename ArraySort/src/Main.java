import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] int1= {1,2,3,10,9,6,7,5,8,4}; // 111
        int[] int2={1,2,3,4,5}; // 112
// Equals
//       boolean b=   Arrays.equals(int1, int2);
//        System.out.println(b);

        // Sorting
        Arrays.sort(int1);
        for(int s:int1){
            System.out.println(s);
        }
    }
}
