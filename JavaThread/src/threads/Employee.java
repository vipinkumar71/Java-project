package threads;

public class Employee implements Runnable {
   String name;
   public Employee (String name){
       this.name= name;
   }
    @Override
    public void run() {   // It is thread class
           System.out.println(name + " Is working");

           for (int i=0; i<10; i++){
               System.out.println(name+ " Is writing " + i);
               try{
                   Thread.sleep(1000);
               }catch( InterruptedException e){
                   e.printStackTrace();
               }
           }
    }
}
