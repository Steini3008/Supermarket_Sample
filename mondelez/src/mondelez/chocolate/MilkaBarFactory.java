package mondelez.chocolate;


import supermarket.product.candy.CandyFactory;
import supermarket.product.candy.Candy;


public class MilkaBarFactory implements CandyFactory {
	
	@Override
	public Candy create() {
		return new ChocolateBar("Milka", 100, 1.19);
	}
	
}