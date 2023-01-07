package com.pattern.singleton.demo2;

/***
 * <p>Description: 单例模式 饿汉式：静态代码块</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/6 20:58
 * @version 1.0.0
 *
 */
public class Singleton  {

    // 1, 私有构造方法
    private Singleton() {

    }

    // 2, 声明Singleton类型的变量
    private static Singleton instance; // null

    // 在静态代码块中进行赋值

    static {
        instance = new Singleton();
    }

    // 3, 提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance() {
        return instance;
    }


}
