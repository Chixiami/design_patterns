package com.pattern.factory.factory_method;

/***
 * <p>Description: 美式咖啡工厂对象，专门用来生产美式咖啡</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 17:03
 * @version 1.0.0
 *
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
