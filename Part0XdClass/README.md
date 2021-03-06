# [多线程视频教程并发编程教程互联网架构视频Java面试知识](https://edu.51cto.com/course/15466.html)

> 互联网时代，并发编程无处不在。同时，并发编程也是许多程序猿的难点、痛点所在。本课程由浅去深，层层递进。逐步解剖难点。涉及并发编程的多个方面。从基础到源码分析，逐步带你走进并发编程的大门。课程所涉及的知识点，均是日常开发中必知必会，更是面试中经常涉及的内容。

+ 代码 
  + [1~10章讲地基础](笔记课件/concurrent)
  + [11章实战](笔记课件/sync)
+ 基础知识：
  + 线程基础知识
  + 并发安全性
  + JDK锁相关知识
  + 线程间的通讯机制
  + JDK提供的原子类
  + 并发容器
  + 线程池相关知识点

+ 高级篇幅：
  + ReentrantLock源码分析，通过剖析源码，学会如何阅读源码、更加深入理解锁机制
  + ReentrantReadWriteLock源码分析，对比两者源码，更加深入理解读写锁
  + java内存模型、先行发生原则、指令重排序
  + 企业实际场景，从需求分析到代码落

## 目录

+ 第1章课程介绍与并发简介50分钟6节
  + 1-1、并发编程入门到实战课程简介[免费试看]05:11
  + 1-2、什么是并发编程10:06
  + 1-3、并发编程的挑战之频繁的上下文切换09:42
  + 1-4、并发编程的挑战之死锁10:02
  + 1-5、并发编程的挑战之线程安全10:46
  + 1-6、并发编程的挑战之资源限制05:09

+ 第2章线程基础1小时48分钟8节
  + 2-1、进程与线程的区别09:43
  + 2-2、线程的状态及其相互转换14:53
  + 2-3、创建线程的方式（上）09:55
  + 2-4、创建线程的方式（下）06:47
  + 2-5、线程的挂起及其恢复26:33
  + 2-6、线程的中断操作19:50
  + 2-7、线程的优先级13:27
  + 2-8、守护线程07:38

+ 第3章线程安全性1小时14分钟7节
  + 3-1、什么是线程安全性03:59
  + 3-2、从字节码角度剖析线程不安全操作14:49
  + 3-3、原子性操作07:49
  + 3-4、深入理解synchronized关键字14:13
  + 3-5、volatile关键字及其使用场景06:26
  + 3-6、单例与线程安全16:48
  + 3-7、如何避免线程安全性问题10:43

+ 第4章锁3小时24分钟13节
  + 4-1、锁的分类08:52
  + 4-2、深入理解lock接口11:37
  + 4-3、实现属于自己的锁21:01
  + 4-4、AbstractQueuedSynchronizer浅析09:46
  + 4-5、深入剖析ReentrantLock源码之非公平锁的实现31:07
  + 4-6、深入剖析ReentrantLock源码之公平锁的实现12:36
  + 4-7、掌控线程执行顺序之多线程Debug16:11
  + 4-8、读写锁特性及ReentrantReadWriteLock的使16:35
  + 4-9、源码探秘之AQS如何用单一int值表示读写两种状态12:28
  + 4-10、深入剖析ReentrantReadWriteLock之读锁源27:29
  + 4-11、深入剖析ReentrantReadWriteLock之写锁源08:16
  + 4-12、锁降级详解15:28
  + 4-13、StampedLock原理及使用13:23

+ 第5章线程建的通信1小时10分钟6节
  + 5-1、wait notify notifyAll12:12
  + 5-2、等待通知经典模型之生产者消费者18:57
  + 5-3、使用管道流进行通信11:10
  + 5-4、Thread.join通信及其源码浅析09:34
  + 5-5、ThreadLocal的使用10:18
  + 5-6、Condition的使用08:40

+ 第6章原子类44分钟5节
  + 6-1、什么是原子类03:31
  + 6-2、原子更新基本类型12:30
  + 6-3、原子更新数组类型09:00
  + 6-4、原子更新属性13:34
  + 6-5、原子更新引用类型06:14

+ 第7章容器52分钟4节
  + 7-1、同步容器与并发容器08:13
  + 7-2、同步容器11:36
  + 7-3、并发容器09:40
  + 7-4、LinkedBlockingQueue的使用及其源码探秘23:16

+ 第8章并发工具类40分钟4节
  + 8-1、CountDownLatch的使用及其源码探秘12:33
  + 8-2、CyclicBarrier的使用及其源码探秘11:18
  + 8-3、Semaphore的使用及其源码探秘10:03
  + 8-4、Exchanger的使用06:49

+ 第9章线程池及Executor框架1小时22分钟7节
  + 9-1、为什么要使用线程池06:09
  + 9-2、线程池的创建及其使用06:40
  + 9-3、Callable、Future、FutureTask简介10:15
  + 9-4、线程池的核心组成部分及其运行机制14:44
  + 9-5、线程池拒绝策略09:25
  + 9-6、使用Executor框架创建线程池的n种方法14:20
  + 9-7、线程池的使用建议20:43

+ 第10章jvm与并发44分钟3节
  + 10-1、java内存模型15:10
  + 10-2、先行发生原则happens-before13:03
  + 10-3、指令重排序16:02

+ 第11章实战1小时51分钟5节
  + 11-1、需求分析15:45
  + 11-2、中间表设计07:36
  + 11-3、基础环境搭建18:50
  + 11-4、生产者编码实现35:07
  + 11-5、消费者编码实现34:29

+ 第12章课程总结11分钟1节
