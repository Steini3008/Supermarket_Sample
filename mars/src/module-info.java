module mars {
	requires supermarket.product;
	
	provides supermarket.product.candy.CandyFactory 
	with mars.SnickersFactory, mars.MarsFactory;
}