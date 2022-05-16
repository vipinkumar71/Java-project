public interface Car {

    // in interface we always define only abstract method --
    // abstract method means == No method body only and only declaration
    // We Achieve 100% abstraction.
// only static and final variable we can define in interface
    final int wheels=4;

  public void start();
  public void stop();
  public void refuel();

}
