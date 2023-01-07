package com.pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/***
 * <p>Description: 测试使用序列化破坏单例模式</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 15:28
 * @version 1.0.0
 *
 */
public class Client {
    public static void main(String[] args) throws Exception{
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();

    }
    // 从文件读取数据（对象）
    public static void readObjectFromFile() throws Exception{
        // 1, 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\6-code\\a.txt"));
        // 2, 读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 3, 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception{
        // 1, 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2, 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\6-code\\a.txt"));
        // 3, 写对象
        oos.writeObject(instance);
        // 4, 释放资源
        oos.close();
    }

}
