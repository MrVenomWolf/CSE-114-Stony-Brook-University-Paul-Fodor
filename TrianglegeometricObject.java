public class TrianglegeometricObject {

    private double side1, side2, side3 =1.0;

    public TrianglegeometricObject() {;}

    public TrianglegeometricObject(double side1, double side2, double side3) {
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

    public double getArea() {

        double term1 = 4 * Math.pow(side1, 2) * Math.pow(side2, 2);
        double term2 = Math.pow(Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2), 2);

        return 0.25 * Math.sqrt(term1 - term2);
     
    }
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return super.toString() + "\nside: " + side1 + "; Side2: " + side2 + ": Side3: " + side3 + "; Perimeter: " + getPerimeter() + "; 
    }
    

    public static void main(String[] args) {
        TrianglegeometricObject t = new TrianglegeometricObject(1, 1.5, 1);
        t.setColor("Yellow");
        t.setFilled(true);
        System.out.println(t.toString());
    }
    
}
