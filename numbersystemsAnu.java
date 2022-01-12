public class numbersystemsAnu {

	
	public static int baseXtodeci(int base, String s){
    
		int a = 0;
        char[] number = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        for(int i = 0; i<s.length();i++) {
            for (int j= 0; j<base;j++) {
                if (number[j] == s.charAt(i)) {
                    a += Math.pow(base, s.length()-1-i) *j;
                }
            }
        }
        return a; 
        
    }

    public static String dectobaseX(int base, int dec){
        
    	String converted =""; 
        
    	int index;
        char[] num = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (dec != 0) {
            index = dec % base;
            converted = num[index] + converted;
            dec /= base;
        }
        return converted;
    }

    
    public static int hexadecitodeci(String hex){
        return baseXtodeci(16, hex);
    }

    public static String decitobinary(int n){
        return dectobaseX(2, n);

    }

    public static String decitohex(int n) {
        return dectobaseX(16, n);

    }

    public static int binarytodeci(String b){ 
        return baseXtodeci(2, b);

    }

    public static void main(String[] args) {

    System.out.println(hexadecitodeci("A1")); 

    System.out.println(decitobinary(10)); 

    System.out.println(decitohex(161)); 

    System.out.println(binarytodeci("1010"));

    }

}