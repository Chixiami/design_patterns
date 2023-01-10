package com.pattern.proxy.static_proxy;

/***
 * <p>Description: 代售点类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 16:43
 * @version 1.0.0
 *
 */
public class ProxyPoint implements SellTickets{

    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
