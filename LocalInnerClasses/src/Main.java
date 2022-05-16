public class Main {

    public static void main(String[] args) {

        int age= 9;


        //Local inner classes == define it without public
        // Define it non- Static
        // Local inner classes pretend like variables
         class A{
//    Local Inner class
             public void shutDown(){
                 System.out.println("Class A shutDown");
             }
        }
        A a = new A();
         a.shutDown();



    }
}
