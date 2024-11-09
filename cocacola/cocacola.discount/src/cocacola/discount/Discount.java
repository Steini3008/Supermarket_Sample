package cocacola.discount;


public class Discount {
	private double discountInPercent;
	
	public Discount(double discountInPercent) {
		this.discountInPercent = discountInPercent;
	}
	
	public double calculate(double price) {
		return price * (1 - discountInPercent/100);
	}
	
}