package supermarket.client;


import supermarket.product.drink.*;  // DrinkFactory and Drink
import supermarket.product.candy.*;  // CandyFactory and Candy

import supermarket.storage.Shelf;


public class GreenClient {
	
	public static void main(String[] args) {
		Iterable<DrinkFactory> drinkFactories = Shelf.availableDrinkFactories();
		Iterable<CandyFactory> candyFactories = Shelf.availableCandyFactories();
		
		System.out.println("Available Drinks");
		for (DrinkFactory drinkFactory : drinkFactories) {
			Drink drink = drinkFactory.create();
			System.out.println(drink);
		}
		
		System.out.println("Available Candy");
		for (CandyFactory candyFactory : candyFactories) {
			Candy candy = candyFactory.create();
			System.out.println(candy);
		}
		
	}
	
}