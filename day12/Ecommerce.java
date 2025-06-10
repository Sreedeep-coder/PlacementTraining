package day12;

import java.util.*;

class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addItems(Product product) {
        items.add(product);
        System.out.println(product.name + " added to cart");
    }
    public void removeItem(String productName) {
        items.removeIf(item -> item.name.equals(productName));
    }       
    public void displayCart() {
        System.out.println("Your Cart:");
        items.forEach(item -> System.out.println("- " + item.name + ": $" + item.price));
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItems(new Product("Laptop", 999.90));
        myCart.addItems(new Product("Mobile", 98.90));

        myCart.displayCart();
    }
}
