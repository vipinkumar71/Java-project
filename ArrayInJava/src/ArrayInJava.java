import jdk.swing.interop.SwingInterOpUtils;

public class ArrayInJava {
    public static void main(String[] args){
        //Java Arrays
//        int a = 6;//  0  1  2 3 4 5
//        int [] arr= {100,5,6,7,8,4};
//        int [] arr2= new int[3];
//        arr2[0]= 5;
//        arr2[1]= 7;
//        arr2[2]= 3;

//        String s[] = {"Hey", "Hello", "Come back", "Go"};
//       int a=  s.length;
//        System.out.println("Array length " +a);
//        System.out.println(s[3]);

        //for is is called for each
        double arr[] ={1.4, 4.5, 5.6, 6.7, 7.8};
        String s[]={"A", "B",  "C","D", "E" };

        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++=");
       for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
       }


//     for(double d:arr){
//            System.out.println(d);

//        for(double temName:arr){
//            System.out.println(temName);
//        }
//        System.out.println("*********************************");
//        for(String string :s){
//            System.out.println(string);
//        }

    }
}
