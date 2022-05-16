import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {
        int [][] multiple=new int[3][3];
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arrays elements");

        for (int i=0; i<3; i++){
            for (int j= 0; j<3; j++){
                multiple[i][j] = scanner.nextInt();
            }
        }
        // Printing

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(multiple [i][j] + " ");

            }
            System.out.println(" ");
        }

    }
}
