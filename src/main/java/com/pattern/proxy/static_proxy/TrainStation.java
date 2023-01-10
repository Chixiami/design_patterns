package com.pattern.proxy.static_proxy;

/***
 * <p>Description: 火车站类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 16:43
 * @version 1.0.0
 *
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
