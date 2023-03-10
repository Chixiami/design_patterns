package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/***
 * <p>Description: 具体主题角色类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 8:51
 * @version 1.0.0
 *
 */
public class SubscriptionSubject implements Subject{

    // 定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<Observer>();


    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // 遍历集合
        for (Observer observer : weiXinUserList) {
            // 调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
