package com.pattern.factory.factory_method;

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

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addmilk();
        coffee.addsuger();
        return coffee ;
    }
}
