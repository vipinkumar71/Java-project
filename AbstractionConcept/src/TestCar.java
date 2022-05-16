public class TestCar {
    public static void main(String[] args){
    BMW b = new BMW();
    b.start();
    b.stop();
    b.refuel();
    b.theSafety();

    Car c = new BMW();
    c.stop();
    c.refuel();
    c.start();
    }
}
