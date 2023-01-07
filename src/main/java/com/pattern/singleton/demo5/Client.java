package com.pattern.singleton.demo5;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 15:14
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) {
        Singleton instacne = Singleton.getInstance();
        Singleton instacne2 = Singleton.getInstance();
        System.out.println(instacne == instacne2);

    }
}
