package com.pattern.prototype.test;

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

    public static void main(String[] args) {
        // 1.创建原型对象
        Citation citation = new Citation();
        // 创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);
        // 2.克隆奖状对象
        Citation citation1 = citation.clone();
        citation.show();
        citation1.show();


        citation1.getStu().setName("李四");

        // 3.调用show方法展示
        citation.show();
        citation1.show();
    }
}
