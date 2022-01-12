
public class HorseBarn {
	private Horse[] spaces;
	
	public HorseBarn(int N) {
		spaces = new Horse[N];
		
	}
	public Horse[] getSpaces() {
		return spaces;
		
	}
	
	
	public void add(Horse h) {
		for(int i = 0; i<spaces.length; i++)
			if(spaces[i]==null) {
				spaces[i] = h;
				return;
			}
		
	}
	
	public void remove(Horse h) {
		for(int i = 0; i<spaces.length; i++)
			if(spaces[i]!=null && spaces[i].equals(h)) {
				spaces[i] = null;
				return;
				
			}
		return;
		
	}
	
	public int findHorseSpace(String name) {
		for(int i = 0; i<spaces.length; i++)
			if(spaces[i]!=null && spaces[i].getName().equals(name))
				return i;
		return -1;
		
	}
	
	public void consolidate() {
		int count = 0;
		for(int i = 0; i<spaces.length; i++)
			if(spaces[i]!=null)
				spaces[count++] = spaces[i];
		for(int i=count; i <spaces.length; i++)
			spaces[i] = null;
		
		
		
	}
	
	public String toString() {
		String r = "HorseBarn: ";
		for(int i =0; i <spaces.length; i++)
			r += spaces[i] + " ";
		return r;
		
	}
	
	public static void main(String[] args) {
		HorseBarn b = new HorseBarn(10);
		Horse a = new Horse("Abe",1000);
		b.add(a);
		b.add(new Horse("Bob",1000));
		b.add(new Horse("Cain",1000));
		b.add(new Horse("Don",1000));
		b.add(new Horse("Emile",1000));    
		b.add(new Horse("Rex",1000));
		b.add(new Horse("Bri",1000));
		b.remove(new Horse("Bob",1000));
		b.remove(new Horse("Bri",1000));
		b.remove(new Horse("Rex",1000));
		b.consolidate();
		
		
		
		System.out.println(b);
		
		
		
	}

}
