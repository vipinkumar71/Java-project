public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW---Start");
    }

    @Override
    public void stop() {
        System.out.println("BMW--Stop");
    }

    @Override
    public void refuel() {
        System.out.println("BMW -- Refule");
    }
    // non- overridden method also
    public void theSafety(){
        System.out.println("BMW ---theSafety");
    }
}
