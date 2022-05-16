public class Main {
    // a car has a engine
    // a car has wheel
    // Programmer is a Employee

    // Composition is "has a connection"

    //AUDI  Can have doors, wheel, engine,seats etc.

    // inheritance = "Is a connection"
    public static void main(String[] args) {
    Engine engine = new Engine("MMS", 450, "SSH");
    Wheel wheel = new Wheel("JK TYER", "Black", 22);


     Car car = new Car("Mercedes",2,2,engine,wheel);
        System.out.println(car.getName());
        System.out.println(car.getSeats());
        System.out.println(car.getDoors());


        System.out.println("Name of the Engine: "+engine.getName());
        System.out.println("Model of the Engine: " +engine.getModel());
        System.out.println("Power of engine: "+engine.getPower());

        System.out.println("Name of the Wheel: "+wheel.getName());
        System.out.println("Colour of the Wheel: "+wheel.getColour());
        System.out.println("Size of the Wheel in inches: "+wheel.getInch());

    }
}
