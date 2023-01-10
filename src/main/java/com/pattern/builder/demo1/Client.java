package com.pattern.builder.demo1;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:37
 * @version 1.0.0
 *
 */
public class Client {

    public static void main(String[] args) {
        // 创建指挥者对象
        Director director = new Director(new OfoBuilder());
        // 让指挥者指挥组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
