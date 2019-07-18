package com.leetcode.tenToEleven.printInOrder;

/**
 * Created by LiuLiHao on 2019/7/18 0018 下午 03:55
 * @author : LiuLiHao
 * 描述：
 * 我们提供了一个类：
 *
 * public class Foo {
 *   public void one() { print("one"); }
 *   public void two() { print("two"); }
 *   public void three() { print("three"); }
 * }
 * 三个不同的线程将会共用一个 Foo 实例。
 *
 * 线程 A 将会调用 one() 方法
 * 线程 B 将会调用 two() 方法
 * 线程 C 将会调用 three() 方法
 * 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 *
 */
public class TestPrintInOrder {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("a");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("b");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("c");
            }
        });

        Foo foo = new Foo();
        try {
            foo.first(t1);
            foo.second(t3);
            foo.third(t2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
