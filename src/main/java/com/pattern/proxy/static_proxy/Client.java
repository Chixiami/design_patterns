package com.pattern.proxy.static_proxy;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 16:47
 * @version 1.0.0
 *
 */
public class Client {

    public static void main(String[] args) {
        // 创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用方法进行买票
        proxyPoint.sell();

    }
}
