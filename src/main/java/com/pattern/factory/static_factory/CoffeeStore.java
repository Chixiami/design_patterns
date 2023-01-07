package com.pattern.factory.static_factory;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 16:31
 * @version 1.0.0
 *
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 调用生产咖啡的方法
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addmilk();
        coffee.addsuger();
        return coffee;
    }
}
