public class FrontEndDeveloper implements ITCompany {
    private String name;
    private String surname;
    private String language;
    private int age;

    public FrontEndDeveloper(String name, String surname, String language, int age ){
      this.name = name;
      this.surname= surname;
      this.language= language;
      this.age= age;
    }
      public void setName(String name){
        this.name=name;
      }
      public String getName(){
        return name;
      }
      public void setSurname(String surname){
        this.name=name;
      }
      public String getSurname(){
        return surname;
      }
      public void setLanguage(String language){
      this.language=language;
      }
      public String getLanguage(){
        return language;
      }
      public void setAge(int age){
        this.age=age;
      }
      public int getAge(){
        return age;
      }



    @Override
    public void writeCode() {
        System.out.println(name +" "+ surname + " is making website");
    }

    @Override
    public void comeEarly() {
        System.out.println(name +" "+ surname + " never comes early");
    }

    @Override
    public void testCode() {
        System.out.println(name+" "+surname + " Will test code in 2 days");
    }
}
