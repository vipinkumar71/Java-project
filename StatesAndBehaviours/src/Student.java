public class Student extends Person{
    private String name;
    private String surname;
    public Student(String name, String surname) {
     this.name=name;
     this.surname=surname;
    }

    @Override
    public void walk(String name) {
        super.walk(name);
    }
}
