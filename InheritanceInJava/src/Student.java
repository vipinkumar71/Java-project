public class Student extends Person {
    // extends
  //Super class is a base class that we extends

    public Student(String name, String surname, int age) {
        super(name, surname,age);

        //When we write super it means go and call constructor of super class
    }

    public static void run(){
        System.out.println("Student is running");
    }
    public String read(String bookName){
        return bookName;
    }

    // Person is our parent class or super class or base class
    //Here Teacher and student is our child class
}