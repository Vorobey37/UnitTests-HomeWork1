package org.example.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {

        Product eggs = new Product();
        eggs.setCost(100);
        eggs.setTitle("eggs");
        Product milk = new Product();
        milk.setTitle("milk");
        milk.setCost(65);
        Product coffee = new Product();
        coffee.setCost(320);
        coffee.setTitle("coffee");
        Product apple = new Product();
        apple.setTitle("apple");
        apple.setCost(33);

        List<Product> products1 = new ArrayList<>();
        products1.add(eggs);
        products1.add(milk);
        products1.add(coffee);
        products1.add(apple);

        Shop shop = Shop.createShop(products1);
        Shop shop2 = new Shop();

        //1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
        // (правильное количество продуктов, верное содержимое корзины).
        // Проверка базового функционала с использованием утверждений AssertJ:
        assertThat(shop.getProducts().size()).isEqualTo(4);
        assertThat(shop.getProducts().get(0)).isEqualTo(eggs);
        assertThat(shop.getProducts().get(1)).isEqualTo(milk);
        assertThat(shop.getProducts().get(2)).isEqualTo(coffee);
        assertThat(shop.getProducts().get(3)).isEqualTo(apple);
        assertThat(shop2.getProducts()).isEqualTo(null);


        //2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        // Проверка базового функционала с использованием утверждений AssertJ:
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(coffee);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() -> shop2.getMostExpensiveProduct()).isInstanceOf(NullPointerException.class);


        //3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
        // Проверка базового функционала с использованием утверждений AssertJ:
        assertThat(shop.sortProductsByPrice().size()).isEqualTo(4);
        assertThat(shop.sortProductsByPrice().get(0)).isEqualTo(apple);
        assertThat(shop.sortProductsByPrice().get(1)).isEqualTo(milk);
        assertThat(shop.sortProductsByPrice().get(2)).isEqualTo(eggs);
        assertThat(shop.sortProductsByPrice().get(3)).isEqualTo(coffee);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() -> shop2.sortProductsByPrice()).isInstanceOf(NullPointerException.class);


        //System.out.println(shop.getProducts());


    }


}