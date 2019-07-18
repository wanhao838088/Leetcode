package com.leetcode.tenToEleven.printInOrder;

import java.util.concurrent.CountDownLatch;

/**
 * Created by LiuLiHao on 2019/7/18 0018 下午 03:56
 *
 * @author : LiuLiHao
 * 描述：
 */
public class Foo {

    CountDownLatch b = new CountDownLatch(1);
    CountDownLatch c = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        b.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        b.await();
        //当变成0的时候往下执行
        printSecond.run();
        c.countDown();

    }

    public void third(Runnable printThird) throws InterruptedException {
        c.await();
        //当变成0的时候往下执行
        printThird.run();
    }
}
