package com.pattern.builder.demo1;

/***
 * <p>Description: 指挥者类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:33
 * @version 1.0.0
 *
 */
public class Director {

    //声明Builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildframe();
        builder.buildSeat();
        return builder.creatBike();
    }
}
