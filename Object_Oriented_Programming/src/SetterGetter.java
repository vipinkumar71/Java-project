public class SetterGetter {
    // Set and get methods
    private String name;
    private String surname;
    private String email;
    private int age;

    public void setName(String name){
       this.name=name;
    }
    public void setSurname(String surname){
        this.surname= surname;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setAge(int age){
        this.age=age;
    }
    public String getName(){

        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }


}
