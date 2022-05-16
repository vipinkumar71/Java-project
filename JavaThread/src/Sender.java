public class Sender {
    public void send(String msg) {
        System.out.println("Sending \n" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My message is sent: " + msg);

    }


}
