package com.pattern.observer.listener;

/**
 * <p>Description: 事件监听器接口</p>
 *
 * @author chenhan
 * @date 2023/1/16 9:49
 * @version 1.0.0
 */
public interface EventListener extends java.util.EventListener {
    void handleEvent(EventObject eventObject);
}
