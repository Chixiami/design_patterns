package com.pattern.factory.before;

/***
 * <p>Description: 咖啡类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 16:26
 * @version 1.0.0
 *
 */
public abstract class Coffee {

    public abstract String getName();

    // 加糖
    public void addsuger() {
        System.out.println("加糖");
    }

    // 加奶
    public void addmilk() {
        System.out.println("加奶");
    }
}
