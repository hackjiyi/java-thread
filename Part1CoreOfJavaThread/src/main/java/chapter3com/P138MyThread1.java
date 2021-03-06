/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2018/4/7 上午12:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter3com;

public class P138MyThread1 extends Thread {
    private Object lock;

    public P138MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始        wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束        wait time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
