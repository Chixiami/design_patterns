package com.pattern.factory.abstract_factory;

/***
 * <p>Description: 美式风味的甜品工厂</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 18:32
 * @version 1.0.0
 *
 */
public class AmericanDessertFactory implements DessertFactory{


    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
