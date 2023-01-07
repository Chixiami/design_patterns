package com.pattern.singleton.demo1;

/***
 * <p>Description: 单例模式 饿汉式：静态成员变量</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/6 20:47
 * @version 1.0.0
 *
 */
public class Singleton {
    // 1, 私有构造方法
    private Singleton() {

    }

    // 2, 在本类中创建本类对象
    private static Singleton instance = new Singleton();

    // 3, 提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance() {
        return instance;
    }
}
