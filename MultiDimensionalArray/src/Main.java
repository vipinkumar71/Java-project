public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 4};
         int[][] multiple = new int[3][3];
        //  row column
//         multiple[0] [0]=1;
//         multiple[0] [1]=2;
//         multiple[1] [0]=3;
//         multiple[1] [1]=4;
//               row  column
        multiple [0]    [0] =5;
        multiple [0]    [1] =6;
        multiple [0]    [2] =7;

        multiple [1]    [0] =8;
        multiple [1]    [1] =9;
        multiple [1]    [2] =10;

        multiple [2]    [0] =11;
        multiple [2]    [1] =12;
        multiple [2]    [2] =13;

       for(int i=0; i<3; i++){
           for (int j=0; j<3; j++){
               System.out.print(multiple[i][j] +" ");
           }
           System.out.println(" ");
       }
//        int[][] arr2 = {{1, 0}, {2, 3},};
    }
}
