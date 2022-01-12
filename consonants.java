
public class consonants {
	public static int countconsonants(String str) {
		
		String letters = str.replaceAll("[^a-zA-Z]", "");
		return letters.length() - letters.replaceAll("[^aeiouAEIOU]", "").length();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(countconsonants("Stony Brook University"));
		
		System.out.println(countconsonants("No pills, blue bills, cha-cha, real smooth"));
	}

}
