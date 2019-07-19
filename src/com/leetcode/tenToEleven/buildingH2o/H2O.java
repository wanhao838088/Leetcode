package com.leetcode.tenToEleven.buildingH2o;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LiuLiHao on 2019/7/19 0019 上午 10:55
 * @author : LiuLiHao
 * 描述：
 * 现在有两种线程，氢 oxygen 和氧 hydrogen，你的目标是组织这两种线程来产生水分子。
 *
 * 存在一个屏障（barrier）使得每个线程必须等候直到一个完整水分子能够被产生出来。
 *
 * 氢和氧线程会被分别给予 releaseHydrogen 和 releaseOxygen 方法来允许它们突破屏障。
 *
 * 这些线程应该三三成组突破屏障并能立即组合产生一个水分子。
 *
 * 你必须保证产生一个水分子所需线程的结合必须发生在下一个水分子产生之前。
 *
 * 换句话说:
 *
 * 如果一个氧线程到达屏障时没有氢线程到达，它必须等候直到两个氢线程到达。
 * 如果一个氢线程到达屏障时没有其它线程到达，它必须等候直到一个氧线程和另一个氢线程到达。
 * 书写满足这些限制条件的氢、氧线程同步代码。
 *
 */
public class H2O {

    private ReentrantLock lock = new ReentrantLock();
    private Condition hCondition = lock.newCondition();
    private Condition oCondition = lock.newCondition();
    private volatile int count = 2;

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        lock.lock();
        try {
            while (count == 2){
                hCondition.await();
            }
            count++;
            releaseHydrogen.run();
            if (count == 2) {
                //唤醒O
                oCondition.signal();
            } else {
                //继续h
                hCondition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        lock.lock();
        try {
            while (count != 2) {
                oCondition.await();
            }
            count = 0;
            releaseOxygen.run();
            //唤醒h
            hCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
