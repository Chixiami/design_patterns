package com.pattern.observer.listener;

/***
 * <p>Description: 事件对象</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 9:49
 * @version 1.0.0
 *
 */
public class EventObject extends java.util.EventObject {
    private static final long serialVersionUID = 1L;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObject(Object source) {
        super(source);
    }

    public void doEvent() {
        System.out.println("通知一个事件源" + this.getSource());
    }



}
