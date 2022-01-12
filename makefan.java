
public class makefan {
	public static void main(String[] args) {
		
		fan bigFan = new fan();
		fan defaultFan = new fan();
		
		bigFan.setonState(true);
		bigFan.setfanSpeed(3);
		bigFan.setradius(10.0);
		bigFan.setcolor("yellow");
		
		
		bigFan.setfanSpeed(2);
		
		
		System.out.println(bigFan);
		System.out.println(defaultFan);
		
		
		
	}

}
