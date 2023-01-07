package com.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/15 16:15
 * @version 1.0.0
 *
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        // 调用 Runtime exec的方法 参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        // 调用Process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        // 读取数据
        int len = is.read(arr); // 返回读到的字节的个数
        // 将字节数组转换为字符串，输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
