public class numbersystems {


    public static int baseX2Decimal(int base, String s){
        
    	
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

    public static String Decimal2BaseX(int base, int dec){
       
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

    public static int Hexadecimal2Decimal(String hex){
        return baseX2Decimal(16, hex);
    }

    public static String Decimal2Binary(int n){
        return Decimal2BaseX(2, n);

    }

    public static String Decimal2Hex(int n) {
        return Decimal2BaseX(16, n);

    }

    public static int Binary2Decimal(String b){ 
        return baseX2Decimal(2, b);

    }

    public static void main(String[] args) {

    System.out.println(Hexadecimal2Decimal("A1"));

    System.out.println(Decimal2Binary(10)); 

    System.out.println(Decimal2Hex(161));

    System.out.println(Binary2Decimal("1010")); 

    }

}