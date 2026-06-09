package org.miu.lab.lab9.ShoppingCart.src.application;
import org.miu.lab.lab9.ShoppingCart.src.products.Product;
import org.miu.lab.lab9.ShoppingCart.src.shoppingcart.ShoppingCart;


public class Application {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("A123", 100.0, "TV");
		cart.addProduct(product1);
		Product product2 = new Product("A665", 75.0, "MP3 Player");
		cart.addProduct(product2);
		Product product3 = new Product("A665", 75.0, "MP3 Player");
		cart.addProduct(product3);
		
		cart.printProducts();
		
		cart.removeProduct(product3);
		cart.removeProduct(product2);
		
		cart.printProducts();

	}

}
