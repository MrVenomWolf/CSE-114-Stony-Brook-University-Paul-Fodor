
public class fan {
	boolean onState;
	int fanspeed;
	double radius;
	String color;

	
	fan(){
		
		this.onState = false;
		this.fanspeed = 1;
		this.radius = 5.0;
		this.color = "blue";
		
	}
	
	public boolean getonState() { return onState; }
	public int getfanSpeed() { return fanspeed; }
	public double getradius() { return radius; }
	public String getcolor() { return color; }
	
	
	public boolean setonState(boolean onState) {
		return this.onState = onState;
		
	}
	public int setfanSpeed(int fanspeed) {
		return this.fanspeed = fanspeed;
		
	}
	public double setradius(double radius ) {
		return this.radius = radius;
		
	}
	public String setcolor(String color) {
		return this.color = color;
		
	}
	
	public String toString() {
		
		if (onState) return "Fan is on at speed: " + fanspeed + "\nColor: " + color + "\nRadius: " + radius + "\n";
		
		
		return "Fan is off \nColor: " + color + "\nRadius: " + radius + "\n";
	}
}
