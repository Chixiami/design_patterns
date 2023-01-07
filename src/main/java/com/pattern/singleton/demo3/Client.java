package com.pattern.singleton.demo3;


/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/6 21:09
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        // 判断两次获取到的Singleton对象是否是同一个对象

        System.out.println(instance1 == instance2);

    }
}
