package com.leetcode.tenToEleven.printZeroEvenOdd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * Created by LiuLiHao on 2019/7/18 0018 下午 04:54
 * @author : LiuLiHao
 * 描述：
 */
public class ZeroEvenOdd {

    private int flag = 1;

    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {

            for (int i = 0; i < n; i++) {
                if (flag!=1){
                    condition1.await();
                }
                printNumber.accept(0);
                flag=2;
                condition2.signal();
            }
        }finally {
            lock.unlock();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {

            for (int i = 1; i <= n; i++) {
                if (flag!=2){
                    condition2.await();
                }
                if (i%2==0){
                    printNumber.accept(i);
                }
                flag=3;
                condition3.signal();
            }
        }finally {
            lock.unlock();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {

            for (int i = 1; i <= n; i++) {
                if (flag!=3){
                    condition3.await();
                }
                if (i%2!=0){
                    printNumber.accept(i);
                }
                flag=1;
                condition1.signal();
            }
        }finally {
            lock.unlock();
        }
    }
}
