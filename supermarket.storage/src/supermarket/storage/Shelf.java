package supermarket.storage;


import supermarket.product.drink.DrinkFactory;
import supermarket.product.candy.CandyFactory;

import java.util.ServiceLoader;


public class Shelf {
	
	public static Iterable<DrinkFactory> availableDrinkFactories() {
		return ServiceLoader.load(DrinkFactory.class);
	}
	
	public static Iterable<CandyFactory> availableCandyFactories() {
		return ServiceLoader.load(CandyFactory.class);
	}
	
}