package org.miu.lab.lab9.ShoppingCart.src.products;

public class Product {
    String number;
    double price;
    String description;

    public Product(String number, double price, String description) {
        super();
        this.number = number;
        this.price = price;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return number + " " + price + " " + description;
    }
}
