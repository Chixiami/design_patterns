package com.pattern.observer;

/**
 * <p>Description: 抽象主题角色类</p>
 *
 * @author chenhan
 * @date 2023/1/16 8:47
 * @version 1.0.0
 */
public interface Subject {
    // 添加订阅者（添加观察者对象）
    void attach(Observer observer);

    // 删除订阅者
    void detach(Observer observer);

    // 通知观察者更新消息
    void notify(String message);
}
