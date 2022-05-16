public class Person {

    // variables are States
    private String name;
    private String surname;

    public Person(){

    }

    public Person(String name, String surname){
        this.name= name;
        this.surname= surname;
    }
// methods are Behaviour OR Function
    public void walk(String name){
        System.out.println(name + "Is walking");
    }


    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
