package com.pattern.singleton.demo8;

import java.io.Serializable;

/***
 * <p>Description:静态内部类方式</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 15:09
 * @version 1.0.0
 *
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    // 私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            // 判断 flag 的值是否是 true,如果是true,说明非第一次访问，直接抛一个异常，如果是false的话，说明第一次访问
            if(flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            // 将flag的值设置为true
            flag = true;
        }
    }

    // 定义一个静态内部类
    private static class SingletonHolder{
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
