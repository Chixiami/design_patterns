package com.pattern.factory.abstract_factory;

import javafx.scene.shape.TriangleMesh;

/***
 * <p>Description: 意大利风味甜品工厂，生产拿铁咖啡和提拉米苏甜品</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 18:35
 * @version 1.0.0
 *
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
