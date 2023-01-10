package com.pattern.proxy.cglib_proxy;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 17:29
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyObject = (TrainStation)factory.getProxyObject();
        // 调用代理对象
        // proxyObject.sell();
    }
}
