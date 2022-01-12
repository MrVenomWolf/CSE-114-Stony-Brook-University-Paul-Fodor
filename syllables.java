
public class syllables {
	public static int countsyllables(String str) {
		
		int count = 0;
		boolean prevvowel = false;
		for (int i = 0; i < str.length(); i++) {
			
			if ("aeiouuAEIOU".indexOf(str.charAt(i)) != -1) {
				
				if (prevvowel) {
					
					System.out.println(str.substring(i-1, i+1));
					prevvowel = false;
					count++;
					
				}
				else {
					prevvowel = true;
					
				}
			}
			
			else {
				if (prevvowel) {
					System.out.println(str.charAt(i-1));
					prevvowel = false;
					count++;
				}
			}
		}
		if (prevvowel) {
			System.out.println(str.charAt(str.length()-1));
			count++;
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(countsyllables("I study at Stony Brook University"));
		System.out.println(countsyllables("Three gold chains keep me cold Steve Austin and Im lit dont care about tomorrow"));
		
		
	}
}
