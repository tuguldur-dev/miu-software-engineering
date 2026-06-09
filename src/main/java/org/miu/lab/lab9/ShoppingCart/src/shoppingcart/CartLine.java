package org.miu.lab.lab9.ShoppingCart.src.shoppingcart;

import org.miu.lab.lab9.ShoppingCart.src.products.Product;

public class CartLine {
    int quantity;
    Product product;

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + product;
    }
}
