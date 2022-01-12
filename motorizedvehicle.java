
public class motorizedvehicle extends vehicle {
    private double volumeDisplacement;

    public motorizedvehicle(String name, int wheels, double volumeDisplacement) {
        super(name, wheels);
        this.volumeDisplacement = volumeDisplacement;
    }


    public double horsepower() {
        return getWheels()*this.volumeDisplacement;
    }

    public String toString() {
        return super.toString() + "\nVolume" + volumeDisplacement;
    }
}
