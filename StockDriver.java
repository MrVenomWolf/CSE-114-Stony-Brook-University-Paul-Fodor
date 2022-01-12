
public class StockDriver {
	
	public static void main(String[] args) {
		
		Stock google = new Stock("GOOG", "Google");
		google.setPreviousClosingPrice(100);
		google.setCurrentPrice(90);
		double percentChange = google.changePercent();
		System.out.println(percentChange);
		
		Stock tesla = new Stock("TSLA", "Tesla");
		tesla.setPreviousClosingPrice(895.50);
		tesla.setCurrentPrice(909.68);
		double percentChange1 = tesla.changePercent();
		System.out.println(percentChange1);
		
		Stock facebook = new Stock("FB", "Facebook");
		facebook.setPreviousClosingPrice(326.19);
		facebook.setCurrentPrice(324.61);
		double percentChange2 = facebook.changePercent();
		System.out.println(percentChange2);
		
		
		
	}

}
