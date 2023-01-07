package com.pattern.singleton.demo1;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/6 20:54
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        // 创建Singleton类的对象
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        // 判断获取到的两个是否是一个对象

        System.out.println(instance1 == instance2);

    }


}
