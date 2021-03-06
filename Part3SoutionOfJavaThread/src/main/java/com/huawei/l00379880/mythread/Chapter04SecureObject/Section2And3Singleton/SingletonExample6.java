/***********************************************************
 * @Description : 第一种安全发布对象的单例模式：饿汉模式(第一次使用的时候创建),线程安全
 *                 但是私有构造函数中处理过多的时候可能会引起性能问题
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2018/7/18 00:36
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package com.huawei.l00379880.mythread.Chapter04SecureObject.Section2And3Singleton;

import com.huawei.l00379880.mythread.annotations.ThreadSafe;

@ThreadSafe
public class SingletonExample6 {
    /**
     * 私有构造函数
     */
    private SingletonExample6() {
    }

    /**
     * 单例对象
     */
    private static SingletonExample6 instance = null;

    /**
     * 通过静态块初始化
     */
    static {
        instance = new SingletonExample6();
    }


    /**
     * 静态工厂方法
     */
    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
