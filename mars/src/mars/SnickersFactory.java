package mars;


import supermarket.product.candy.CandyFactory;
import supermarket.product.candy.Candy;


public class SnickersFactory implements CandyFactory {
	
	@Override
	public Candy create() {
		return new ChocolateBar("Snickers", 80, 0.79);
	}
	
}