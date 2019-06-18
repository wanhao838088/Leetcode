package com.leetcode.twoThreeHundred.implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LiuLiHao on 2019/6/18 0018 上午 11:26
 * @author : LiuLiHao
 * 描述：
 *
 */
public class TestImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push(1);
        System.out.println(myStack.empty());
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
    }


}


class MyStack {

    private Queue<Integer> in;
    private Queue<Integer> out;



    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    public void push(int x) {
        //in把最后一个元素加进去
        in.offer(x);
        while (!out.isEmpty()){
            //然后加入前面的元素
            in.offer(out.poll());
        }
        //交换
        Queue temp = in;
        in = out;
        out = temp;
    }

    public int pop() {
        return out.poll();
    }

    public int top() {
        return out.peek();
    }

    public boolean empty() {
        return out.isEmpty();
    }

}
