public class Engine {
    private String name;
    private int power;
    private String model;

    public Engine(String name, int power, String model) {
        this.name = name;
        this.power = power;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
