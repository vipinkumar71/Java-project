import threads.Employee;
import threads.Worker;

public class Main {

    // Synchronized
    public static void main(String[] args) {
   Sender sender = new Sender();
   SynSend synSend= new SynSend("Hi", sender);
   SynSend synSend2= new SynSend("Bye", sender);
   synSend.start();
   synSend2.start();

        try {
            synSend.join();
            synSend2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
Hi
My message is sent: Hi
Sending
Bye
My message is sent: Bye

 */