
public abstract class vehicle {
    private String name;
    private int wheels;

    public vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }
    public int getWheels() {
        return wheels;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String toString() {
        return "Name: " + name + "\n of wheels: " + wheels + " Wheels: ";
    }

}
