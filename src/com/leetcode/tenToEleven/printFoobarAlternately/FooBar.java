package com.leetcode.tenToEleven.printFoobarAlternately;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LiuLiHao on 2019/7/18 0018 下午 04:21
 * @author : LiuLiHao
 * 描述：
 */
public class FooBar {
    /**
     * 执行中的标记
     */
    private int flag = 1;
    private int n;
    private Lock lock =  new ReentrantLock();
    private  Condition condition1 = lock.newCondition();
    private  Condition condition2 = lock.newCondition();


    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        lock.lock();

        try {
            for (int i = 0; i < n; i++) {
                if (flag!=1){
                    condition1.await();
                }
                printFoo.run();
                //唤醒第二个
                flag = 2;
                condition2.signal();
            }

        }finally {
            lock.unlock();
        }

    }

    public void bar(Runnable printBar) throws InterruptedException {
        lock.lock();

        try {
            for (int i = 0; i < n; i++) {
                if (flag!=2){
                    condition2.await();
                }
                printBar.run();
                //唤醒第一个
                flag=1;
                condition1.signal();
            }

        }finally {
            lock.unlock();
        }

    }
}
