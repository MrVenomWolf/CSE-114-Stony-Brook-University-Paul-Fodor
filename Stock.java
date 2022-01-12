
public class Stock {
	
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
		
	}
	
	public String getSymbol() {
		return symbol;
		
		
	}
	
	public double getpreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double changePercent() {
		return ((getCurrentPrice() - getpreviousClosingPrice())/ getpreviousClosingPrice()) * 100;
	}

}
