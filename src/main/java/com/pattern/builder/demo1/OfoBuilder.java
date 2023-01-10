package com.pattern.builder.demo1;

/***
 * <p>Description: Ofo单车构建者，用来构建Ofo单车</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:32
 * @version 1.0.0
 *
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildframe() {
        bike.setFrame("铝合金车架");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");

    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
