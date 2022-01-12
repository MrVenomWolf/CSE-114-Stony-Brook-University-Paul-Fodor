import java.util.Scanner;
public class areaofthetriangleAnu {
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
	   
	    double[][] pts = new double[3][2];
	    pts[0][0] = s.nextDouble();
	    pts[0][1] = s.nextDouble();
	    pts[1][0] = s.nextDouble();
	    pts[1][1] = s.nextDouble();
	    pts[2][0] = s.nextDouble();
	    pts[2][1] = s.nextDouble();
	    double area = gettrianglearea(pts);

	    if (Double.isNaN(area) || area == 0) {
	    System.out.println("Points are on the same line.");   
	    }
	    
	    else {
	        System.out.println("Area of the triangle is " + area);
	    }
	    s.close();
	}


	public static double gettrianglearea(double[][] pnts) {
	    double a = pythagorean(pnts[0], pnts[1]);
	    double b = pythagorean(pnts[1], pnts[2]);
	    double c = pythagorean(pnts[2], pnts[0]);
	    double term1 = 4 * Math.pow(a,  2) * Math.pow(b,  2);
	    double term2 = Math.pow(Math.pow(a,  2) + Math.pow(b,  2) - Math.pow(c, 2), 2);
	    return 0.25 * Math.sqrt(term1-term2);
	}


	public static double pythagorean(double[] point1, double[] point2) {
	    return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
	}
}