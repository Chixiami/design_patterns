package com.pattern.prototype.demo;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 10:51
 * @version 1.0.0
 *
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public Realizetype clone() {
        try {

            System.out.println("具体原型复制成功！");

            return (Realizetype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
