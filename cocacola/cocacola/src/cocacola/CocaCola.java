package cocacola;


import supermarket.product.drink.Drink;

import cocacola.discount.Discount;


public class CocaCola implements Drink {
	private int sizeInML;
	private boolean bottleDeposit;
	private double priceInEUR;
	private Discount discount;
	
	public CocaCola(int sizeInML, boolean bottleDeposit, double priceInEUR) {
		this.sizeInML = sizeInML;
		this.bottleDeposit = bottleDeposit;
		this.priceInEUR = priceInEUR;
		
		if (discountPresent()) {
			this.discount = new Discount(20);
		}
	}
	
	private boolean discountPresent() {
		return ModuleLayer.boot().findModule("cocacola.discount").isPresent();
	}
	
	@Override
	public int getSizeInML() {
		return sizeInML;
	}
	
	@Override
	public boolean hasBottleDeposit() {
		return bottleDeposit;
	}
	
	@Override
	public double getPriceInEUR() {
		if (discountPresent()) { 
			return discount.calculate(priceInEUR);
		} else {
			return priceInEUR;
		}
	}
	
	@Override
	public String toString() {
		return "Coca Cola - Size: " + sizeInML + "ml, Bottle Deposit: " + bottleDeposit + ", Price: " + getPriceInEUR() + "EURO";
	}
	
}