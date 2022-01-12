
public class circle2d {
	private double x;
	private double y;
	private double radius;
	
	public double getx() {
		return this.x;
		
	}
	public double gety() {
		return this.y;
		
	}
	public double getradius() {
		return this.radius;
		
	}
	
	public circle2d() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
		
	}
	public circle2d(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
    
	public double getarea() {
		return Math.PI * Math.pow(radius, 2);
		
	}
	public double getperimeter() {
		return Math.PI * 2 * radius;
	}
	
	public boolean contains(double x, double y) {
		boolean xvalid = x <= this.x + this.radius && x >= this.x - this.radius;
		boolean yvalid = y <= this.y + this.radius && y >= this.y - this.radius;
		return xvalid && yvalid;
		
	}
	
	public boolean contains(circle2d circle) {
		boolean xvalid = circle.getx() + circle.getradius() <= this.x + this.radius && circle.getx() - circle.getradius() >= this.x - this.radius;
		boolean yvalid = circle.gety() + circle.getradius() <= this.y + this.radius && circle.gety() - circle.getradius() >= this.y - this.radius;
		return xvalid && yvalid;
		
	}
	public boolean overlaps(circle2d circle) {
		double distance = Math.sqrt(Math.pow(this.getx() - circle.getx(), 2) + Math.pow(this.gety() - circle.gety(), 2));
		return circle.getradius() + this.getradius() <= distance;
		
		
	}
	
	
	
	
	
	
	















}


