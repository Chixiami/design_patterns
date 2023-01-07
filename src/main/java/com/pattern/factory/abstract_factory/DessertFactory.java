package com.pattern.factory.abstract_factory;

public interface DessertFactory {
    // 生茶咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();

}
