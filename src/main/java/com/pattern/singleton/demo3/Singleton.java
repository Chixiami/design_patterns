package com.pattern.singleton.demo3;

/***
 * <p>Description: 单例模式 懒汉式：</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/6 21:07
 * @version 1.0.0
 *
 */
public class Singleton {

    // 1, 私有构造方法
    private Singleton() {

    }

    // 2, 声明Singleton类型的变量
    private static Singleton instance; // null

    // 3, 提供一个公共的访问方式，让外界获取该对象
    public static synchronized Singleton getInstance() {
        // 判断instance是否为null,如何为null,说明还没有创建Singleton类的对象
        // 如果没有，创建一个并返回，如果有，直接返回
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
