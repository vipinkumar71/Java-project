public class Wheel {
    private String name;
    private String colour;
    private int inch;

    public Wheel(String name, String colour, int inch) {
        this.name = name;
        this.colour = colour;
        this.inch = inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
