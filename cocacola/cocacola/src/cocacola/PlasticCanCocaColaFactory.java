package cocacola;


import supermarket.product.drink.DrinkFactory;
import supermarket.product.drink.Drink;


public class PlasticCanCocaColaFactory implements DrinkFactory {
	
	@Override
	public Drink create() {
		return new CocaCola(330, true, 2.25);
	}
	
}