module supermarket.storage {
	requires supermarket.product;
	uses supermarket.product.drink.DrinkFactory;
	uses supermarket.product.candy.CandyFactory;
	exports supermarket.storage;
}