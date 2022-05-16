import control.ControlClass;
import person.People;
import person.Student;
import person.Teacher;
// using of toString method
// every classes extends form Object
// Real world application using Generics

public class Main<E> {
    public static void main(String[] args) {
        People people= new People("vipin", "kumar");
        Student student= new Student("Bob", "Vishwas");
        Teacher teacher = new Teacher("Rahul");
        ControlClass controlClass= new ControlClass();
        controlClass.verify(people);
        controlClass.verify(student);
        controlClass.verify(teacher);
    }
}

