package cocacola;


import supermarket.product.drink.DrinkFactory;
import supermarket.product.drink.Drink;


public class GlasBottleCocaColaFactory implements DrinkFactory {
	
	@Override
	public Drink create() {
		return new CocaCola(300, false, 3);
	}
	
}