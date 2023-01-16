package com.pattern.observer.listener;

import java.util.Vector;

/***
 * <p>Description: 事件源</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 9:45
 * @version 1.0.0
 *
 */
public class EventSource {

    // 监听器列表，监听器的注册加入此里列表
    private Vector<EventListener> ListenerList = new Vector<>();

    // 注册监听器
    public void addListener(EventListener eventListener) {
        ListenerList.add(eventListener);
    }

    // 撤销注册
    public void removeListener(EventListener eventListener) {
        ListenerList.remove(eventListener);
    }

    // 接受外部事件
    public void notifyListenerEvents(EventObject event) {
        for (EventListener eventListener : ListenerList) {
            eventListener.handleEvent(event);
        }
    }
}
