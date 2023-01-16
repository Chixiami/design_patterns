package com.pattern.observer.listener;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 10:34
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.addListener(new EventListener() {
            @Override
            public void handleEvent(EventObject eventObject) {
                eventObject.doEvent();
                if("closeWindows".equals(eventObject.getSource())) {
                    System.out.println("doClose");
                }
            }
        });

        eventSource.addListener(new EventListener() {
            @Override
            public void handleEvent(EventObject eventObject) {
                eventObject.doEvent();
                System.out.println("gogo");
            }
        });

        eventSource.notifyListenerEvents(new EventObject("closeWindows"));
    }
}
