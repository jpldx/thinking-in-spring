package com.jpldx.spring.aop.overview;

/**
 * 类加载示例
 *
 * @author chen.xudong
 * @version 1.0
 * @since 2021/1/8
 */
public class ClassLoadingDemo {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
