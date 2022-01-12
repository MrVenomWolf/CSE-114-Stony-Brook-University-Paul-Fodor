
public class triangle2 {

    private double side1;
    private double side2;
    private double side3;

    public triangle2(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public static void main(String[] args) {
        /*try {
            new triangle2(4, 1, 1);
            System.out.println("It is a valid Triangle  - (4,1,1)");
        } catch (IllegalTriangleException e) {
            System.out.println("It is not a valid Triangle  - (4,1,1)");
        }*/
        
        try {
            new triangle2(3, 4, 5);
            System.out.println("It is a valid Triangle  - (3,4,5)");
        } catch (IllegalTriangleException e) {
            System.out.println("It is not a valid Triangle  - (3,4,5)");
    }

}

class IllegalTriangleException extends Throwable{
	
}

}