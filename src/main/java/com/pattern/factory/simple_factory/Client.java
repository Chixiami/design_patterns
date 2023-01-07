package com.pattern.factory.simple_factory;


/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 16:34
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        //1, 创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());

    }
}
