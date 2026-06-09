package org.miu.lab.lab9.ShoppingCart.src.shoppingcart;

import org.miu.lab.lab9.ShoppingCart.src.products.Product;

import java.util.ArrayList;


import java.util.Iterator;


public class ShoppingCart {
    ArrayList<CartLine> cards = new ArrayList<CartLine>();

    public void addProduct(Product product) {
        for (CartLine cardline : cards) {
            if (cardline.getProduct().getNumber().equals(product.getNumber())) {
                cardline.setQuantity(cardline.getQuantity() + 1);
                return;
            }
        }
        CartLine cardline = new CartLine();
        cardline.setProduct(product);
        cardline.setQuantity(1);
        cards.add(cardline);
    }

    public void removeProduct(Product product) {
        Iterator<CartLine> iter = cards.iterator();
        while (iter.hasNext()) {
            CartLine cline = iter.next();
            if (!cline.getProduct().getNumber().equals(product.getNumber())) {
                continue;
            }

            if (cline.getQuantity() > 1) {
                cline.setQuantity(cline.getQuantity() - 1);
                continue;
            }
            iter.remove();
        }
    }

    public void printProducts() {
        System.out.println("Content of the shoppingcart:");
        cards.forEach(System.out::println);
        System.out.println("Total price = " + getTotalPrice());
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CartLine cartLine : cards) {
            totalPrice = totalPrice + (cartLine.getProduct().getPrice() * cartLine.getQuantity());
        }
        return totalPrice;
    }
}
