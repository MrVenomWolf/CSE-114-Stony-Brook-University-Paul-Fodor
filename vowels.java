
public class vowels {
	public static int countnumvowels(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(countnumvowels("Stony Brook University"));
		
		System.out.println(countnumvowels("Born show, born to glow, never said that"));
	}

}
