package person;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher Name: "+ name;
    }
}
