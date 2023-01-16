package com.pattern.observer;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 8:58
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建公众号对象
        Subject subscriptionSubject = new SubscriptionSubject();
        // 2.订阅公众号
        subscriptionSubject.attach(new WeiXinUser("孙悟空"));
        subscriptionSubject.attach(new WeiXinUser("猪悟能"));
        subscriptionSubject.attach(new WeiXinUser("沙悟净"));
        // 3.公众号更新，发出消息给观察者对象
        subscriptionSubject.notify("专栏更新了！");
    }
}
