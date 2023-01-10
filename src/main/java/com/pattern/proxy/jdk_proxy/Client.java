package com.pattern.proxy.jdk_proxy;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 16:59
 * @version 1.0.0
 *
 */
public class Client {

    public static void main(String[] args) {
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用工厂对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3.调用卖电脑的方法
        proxyObject.sell();
        System.out.println(proxyObject.getClass());

        // 让程序一直执行
        while (true){

        }
    }
}
