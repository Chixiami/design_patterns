package com.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/***
 * <p>Description: 测试使用反射破坏单例模式</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 15:41
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) throws Exception{

        // 1, 获取Singleton的字节码对象
        Class  clazz = Singleton.class;
        // 2, 获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3, 取消访问检查
        cons.setAccessible(true);
        // 4, 创建Singleton对象
        Singleton s1 = (Singleton)cons.newInstance();
        Singleton s2 = (Singleton)cons.newInstance();
        System.out.println(s1 == s2);
    }
}
