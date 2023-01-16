package com.pattern.observer;

import java.util.Queue;

/***
 * <p>Description: 具体的观察者角色类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/16 8:56
 * @version 1.0.0
 *
 */
public class WeiXinUser implements Observer{

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
