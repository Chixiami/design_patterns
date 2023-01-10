package com.pattern.prototype.demo;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 10:54
 * @version 1.0.0
 *
 */
public class client {

    public static void main(String[] args) {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        // 调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆对象是否是同一个对象" + (realizetype == clone));



    }
}
