package com.pattern.factory.abstract_factory;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 18:36
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        // 创建的是意大利风味甜品工厂对象
        //ItalyDessertFactory factory = new ItalyDessertFactory();
        DessertFactory factory = new ItalyDessertFactory();
        // 获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
