public class Test {
    public static void main(String[] args){
        // Static and non Static Methods
        // Identifiers public and private
        // Static is for classes and it belongs to class
        // non static is for Objects
       // Static method is creating with classes, and when class is running our static method is also running
        // But non static is a method that we can create when we create our objects
        Student.create();
        Student st = new Student();
        st.put();
    }
}
