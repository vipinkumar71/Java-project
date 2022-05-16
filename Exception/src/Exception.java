import java.rmi.server.ExportException;
import java.sql.Connection;

public class Exception extends Throwable {
    public static void main(String[] args) {
        // try and catch block
            String s= null;
        try {
//            s.toUpperCase(); // NullPointerException
            int a = 4/2; //  ArithmeticException
            System.out.println(a);
            int ss[] = {4, 5, 8};
            System.out.println(ss[2]);// ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("You got Exception");
        }
       catch (ArithmeticException e){
           System.out.println("You got Arithmetic Exception");
       }
        finally{
            System.out.println("This is a finally block");
        }
        System.out.println("New line of code");
    }
}