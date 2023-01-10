package com.pattern.prototype.test1;

import java.io.Serializable;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 13:32
 * @version 1.0.0
 *
 */
public class Student implements Serializable{

    // 学生的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
