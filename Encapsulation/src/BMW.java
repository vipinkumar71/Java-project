public class BMW {
    private String name;
    private String model;
    private int doors;
    private int horsePower;

    public BMW(){

    }
    public BMW(String name, String model, int doors, int horsePower){
        this.name=name;
        this.model=model;
        this.doors=doors;
        this.horsePower= horsePower;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setDoors(int doors){
        // Encapsulation fields
        if(doors<1){
            System.out.println("Invalid door operation");
            return;
        }
        System.out.println("Method is not stopped.");
        this.doors=doors;
    }
    public int getDoors(){
        return doors;
    }
    public void setHorsePower(int horsePower){
        if(horsePower<10){
            System.out.println("invalid power operation");
            return;
        }
        System.out.println("Enough power");
        this.horsePower=horsePower;
    }
    public int getHorsePower(){
        return horsePower;
    }

}
