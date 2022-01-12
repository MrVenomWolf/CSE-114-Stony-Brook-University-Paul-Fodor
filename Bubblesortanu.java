import java.util.Arrays;

public class Bubblesortanu {
	
	public static void main(String[] args) {
		
		
		double[] list = new double[] {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		
		Bubblesortanu(list);
	
	}
	
	public static void Bubblesortanu (double[] list) {
		
        double temp;
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					changed = true;
				}
			}
			System.out.println(Arrays.toString(list));
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			
		}
	}
	
	

}

	

