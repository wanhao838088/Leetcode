package com.leetcode.oneTwoHundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/11/28 0028 下午 03:51
 * @author : LiuLiHao
 * 描述：
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 */
public class MinStack155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }


    static class MinStack {
        List<Integer> list;

        /** initialize your data structure here. */
        public MinStack() {
            list = new ArrayList<>();
        }

        public void push(int x) {
            list.add(x);
        }

        public void pop() {
            if (list.size()>0){
                 list.remove(list.size()-1);
            }
        }

        public int top() {
            if (list.size()>0){
                return list.get(list.size()-1);
            }
            return 0;
        }

        public int getMin() {
            Integer min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                Integer temp = list.get(i);
                if (min >= temp){
                    min = temp;
                }
            }
            return min;
        }
    }

}
