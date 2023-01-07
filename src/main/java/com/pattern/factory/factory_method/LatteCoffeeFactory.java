package com.pattern.factory.factory_method;

/***
 * <p>Description: 拿铁咖啡工厂对象，专门用来生产拿铁咖啡</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 17:04
 * @version 1.0.0
 *
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
