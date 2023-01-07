package com.pattern.factory.factory_method;


/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 17:08
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 创建对象
        //CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        // 点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
