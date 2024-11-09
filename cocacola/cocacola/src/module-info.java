module cocacola {
	requires supermarket.product;
	requires static cocacola.discount;
	
	provides supermarket.product.drink.DrinkFactory 
	with cocacola.GlasBottleCocaColaFactory, cocacola.PlasticCanCocaColaFactory;
}