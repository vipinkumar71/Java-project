public class Person {
    private String name;
    private String surname;
    private int age;



    public Person (String name, String surname, int age){
    this.name=name;
    this.surname =surname;
    this.age = age;
  }


    public void setName(String name){
    this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
