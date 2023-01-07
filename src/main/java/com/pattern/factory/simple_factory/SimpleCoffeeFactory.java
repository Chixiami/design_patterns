package com.pattern.factory.simple_factory;


/***
 * <p>Description: 简单咖啡工厂类， 用来生产咖啡</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 16:41
 * @version 1.0.0
 *
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {

        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，你所点的咖啡没有");
        }

        return coffee;

    }
}
