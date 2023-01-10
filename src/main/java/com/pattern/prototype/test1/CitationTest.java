package com.pattern.prototype.test1;

import sun.util.resources.cldr.it.CalendarData_it_IT;

import java.io.*;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 13:26
 * @version 1.0.0
 *
 */
public class CitationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1.创建原型对象
        Citation citation = new Citation();
        // 创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);
        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/6-code/design_patterns/a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/6-code/design_patterns/a.txt"));
        // 读取对象
        Citation citation1 = (Citation)ois.readObject();
        // 释放资源
        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();


    }
}
