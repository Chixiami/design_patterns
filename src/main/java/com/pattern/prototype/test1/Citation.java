package com.pattern.prototype.test1;

import java.io.Serializable;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 13:23
 * @version 1.0.0
 *
 */
public class Citation implements Cloneable, Serializable{

    // 三号学生上的姓名
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学：被评为三好学生!");
    }


    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
