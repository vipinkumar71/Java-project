package finalKeyWord;

public class Car {
    String CarName;
    final int doors=4;
    // there is one rule of final key word is you have to defined it inside the constructor.
    public void run(){
        doors=5;
    }
}
