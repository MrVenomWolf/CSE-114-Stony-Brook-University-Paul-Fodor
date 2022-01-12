
public class complex extends Number implements Comparable, Cloneable {
    private double r;
    private double i;

    public complex() {};
    public complex(double real) {
        r = real;
    }

    public complex(double real, double imag) {
        r = real;
        i = imag;
    }

    public double getrealpart() {
        return r;
    }

    public double getimagpart() {
        return i;
    }

    public void add(complex number) {
        r += number.r;
        i += number.i;
    }

    public static complex add(complex a, complex b) {
        return new complex(a.r + b.r, a.i + b.i);
    }

    public void subtract(complex number) {
        r -= number.r;
        i -= number.i;
    }

    public static complex subtract(complex a, complex b) {
        return new complex(a.r - b.r, a.i - b.i);
    }

    public void multiply(complex number) {
        r = r * number.r - i * number.i;
        i = i * number.r + r * number.i;
    }

    public static complex multiply(complex a, complex b) {
        double r = a.r;
        double i = a.i;
        double r2 = r* b.r - i * b.i;
        double i2 = r * b.i + i * b.r;
        return new complex(r2, i2);
    }

    public static complex divide(complex number) {
        r = (r * number.r + i * number.i) / (Math.pow(number.r, 2) + Math.pow(number.i, 2));
        i = (i * number.r - r * number.i) / (Math.pow(number.r, 2) + Math.pow(number.i, 2));
    }
    public static complex divide(complex a, complex b) {
        double r = a.r;
        double i = a.i;
        double r2 = (r * b.r + i * b.i) / (Math.pow(b.r, 2) + Math.pow(b.i, 2));
        double i2 = (i * b.r - r * b.i) / (Math.pow(b.r, 2) + Math.pow(b.i, 2));
        return new complex(r2, i2);

    }

    public String toString() {

        if (i != 0) {
            return  "Complex number: " + r + " + " + i + "i";
        } else {
            return  "Complex number: " + r;

        }



    }

    @Override
    public double doubleValue() {
        return r;
    }
    @Override
    public float floatValue() {
        return (float) r;
    }

    @Override
    public int intValue() {
        return (int) r;
    }

    @Override
    public long longValue() {
        return (long) r;
    }

    public Object clone(Complex number) throws CloneNotSupportedException {
        Complex clone = (Complex) super.clone();
        return n;
    }

    @Override

    public int compareTo(Object o) {
        complex number = (complex) o;
        if (r > number.r) 
            return 1;
        if (r < number.r) 
            return -1;
        
            return 0;
        
    }
}
