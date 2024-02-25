package org.example.Shop;

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public static Shop createShop(List<Product> products){
        Shop shop = new Shop();
        shop.setProducts(products);
        return shop;
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        if (products.isEmpty()){
            throw new NullPointerException("Kорзина пуста");
        } else {
            Collections.sort(products);
            return products;
        }

    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        if (products.isEmpty()){
            throw new NullPointerException("Kорзина пуста");
        } else {
            return Collections.max(products);
        }
    }

}
