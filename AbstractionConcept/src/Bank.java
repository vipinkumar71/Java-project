import org.w3c.dom.ls.LSOutput;

public abstract class Bank {
// In abstract class we can define initial, final and static and non static variable
    // Any kind of variable we can define in static class
    int amount=100;
    final int rate =10;
    static int loanRate = 5;

    // abstract method
    public abstract void Loan();

    // non- abstract methods
    public void credit(){

    }
    public void debit(){

    }
}

// Partial abstraction
// Hiding the implementation logic --- is called Abstraction (OOP concept )

// In abstract class can have both type of method like abstract method and non-abstract method.
// We cannot create the Object of Abstract classes and as well as the interface
// Also we cannot create the Object of Interface