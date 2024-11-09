package mars;


import supermarket.product.candy.Candy;


public class ChocolateBar implements Candy {
	private String name;
	private int weightInG;
	private double priceInEUR;
	
	public ChocolateBar(String name, int weightInG, double priceInEUR) {
		this.name = name;
		this.weightInG = weightInG;
		this.priceInEUR = priceInEUR;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getWeightInG() {
		return weightInG;
	}
	
	@Override
	public double getPriceInEUR() {
		return priceInEUR;
	}
	
	@Override
	public String toString() {
		return "Chocolate Bar '" + name + "' - Size: " + weightInG + "g, Price: " + priceInEUR + "EURO";
	}
	
}