
public class square extends geometricObject implements colorable {
    private double side;
    public square(double side) {
        this.side = side;
    }
    public void howToColor() {
        System.out.println("Color a square of side length " + side + " from one side to the other side");

    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        geometricobject[] test = new geometricobject[5];
        test[0] = new square(2);
        test[1] = new square(3);
        test[2] = new square(4);
        test[3] = new square(5);
        test[4] = new Triangle();
        for (geometricobject g : test) {
            if (g instanceof colorable) {
                ((colorable) g).howToColor();
            }
        }
    }

        



}
