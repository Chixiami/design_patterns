package com.pattern.builder.demo1;

/***
 * <p>Description: 具体的构建者，用来构建摩拜单车对象</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:30
 * @version 1.0.0
 *
 */
public class MobileBuilder extends Builder{


    @Override
    public void buildframe() {
        bike.setFrame("碳纤维车架");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
