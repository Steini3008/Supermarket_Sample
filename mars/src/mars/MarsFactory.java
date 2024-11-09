package mars;


import supermarket.product.candy.CandyFactory;
import supermarket.product.candy.Candy;


public class MarsFactory implements CandyFactory {
	
	@Override
	public Candy create() {
		return new ChocolateBar("Mars", 30, 0.5);
	}
	
}