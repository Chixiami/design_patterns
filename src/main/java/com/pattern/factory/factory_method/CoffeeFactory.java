package com.pattern.factory.factory_method;

/**
 * <p>Description: 抽象工厂</p>
 *
 * @author chenhan
 * @date 2022/12/15 17:02
 * @version 1.0.0
 */
public interface CoffeeFactory {

    // 创建咖啡对象的方法
    Coffee createCoffee();
}
