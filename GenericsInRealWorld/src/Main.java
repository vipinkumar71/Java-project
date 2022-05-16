import control.ControlClass;
import person.People;
import person.Student;
import person.Teacher;

public class Main {

    public static void main(String[] args) {
        People people = new People("vipin", "kumar");
        ControlClass controlClass = new ControlClass();
        Student student= new Student("Rahul");
        Teacher teacher = new Teacher("Bob");
        controlClass.verify(people);
        controlClass.verify(student);
        controlClass.verify(teacher);



    }
}
