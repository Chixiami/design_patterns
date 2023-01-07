package com.pattern.singleton.demo4;

/***
 * <p>Description: 双重检查锁方式</p>
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 15:00
 * @version 1.0.0
 *
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {

    }

    // 声明 Singleton 类型的变量
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        // 第一次判断,如果instance的值不为null，不需要抢占锁，直接返回对象
        if(instance == null) {
            synchronized (Singleton.class){
                // 第二次判断
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
