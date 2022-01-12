import java.util.Scanner;
public class kgs_pound {

	public static void main(String[] args) {
		System.out.println("Kilograms  Pounds  Pounds  Kilograms");
		
		for(int i = 0; i <= 99; i++)
		{
			double kgtable1 = 2*i + 1;
			double poundtable1 = 2.2 * kgtable1;
			poundtable1= (double)((int)(poundtable1 * 10)) / 10;
			
			
			double poundtable2 = 20 + 5*i;
			double kgtable2 = (1 / 2.2) * poundtable2;
			kgtable2 = (double)((int)(kgtable2 * 100)) / 100;
			
			int kgtable1length = ("" + (int)kgtable1).length();
			int poundtable1length = ("" + (int)poundtable1).length();
			int poundtable2length = ("" + (int)poundtable1).length();
			
			String row = "";
			
			row += (int)(kgtable1);
			
			for (int j = 0; j < 11 - kgtable1length; j++)
				row += ' ';
			
			row += poundtable1;
			
			for (int j = 0; j < 8 - poundtable1length; j++)
				row += ' ';
			
			
			row += (int)(poundtable2);
			
			for (int j = 0; j < 8 - poundtable2length; j++)
				row += ' ';
			
			row += kgtable2;
			
			System.out.println(row);
	
		}
			
		

	}

}
