import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s[] =new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<s.length; i++){
            System.out.println("Enter elements of array");
         s[i]= scanner.nextLine();
        }

        String s2[] =new String[3];

        for (int i=0; i<s2.length; i++){
            System.out.println("Enter element of second array" );
            s2[i]=scanner.nextLine();
        }

    boolean a=Arrays.equals(s,s2);
        if(a==true){
            System.out.println("Arrays are equals");
        }
        else{
            System.out.println("Arrays are not equals");
        }
    }
}
