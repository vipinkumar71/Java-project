public class Teacher {
// this is a keyword and it means inside the class I will show variable of our class
    private String name;
    private    String surname;
    private   String email;
    private   int age;

    public Teacher(String name) {
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
