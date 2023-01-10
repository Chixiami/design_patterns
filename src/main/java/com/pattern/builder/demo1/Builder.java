package com.pattern.builder.demo1;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:25
 * @version 1.0.0
 *
 */
public abstract class Builder {

    // 声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildframe();

    public abstract void buildSeat();

    // 构建自行车的方法
    public abstract Bike creatBike();

}
