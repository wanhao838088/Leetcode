package com.leetcode.oneTwoHundred.lruCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by LiuLiHao on 2019/7/20 0020 上午 10:42
 * @author : LiuLiHao
 * 描述：
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 */
public class LRUCache {

    private int capacity;
    private List<Integer> list;
    private Map<Integer,Integer> map;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
        map = new HashMap<>();

    }

    public int get(int key) {
        Integer val = map.get(key);
        if (val==null){
            return -1;
        }
        //提到前面
        list.remove((Integer) key);
        list.add(key);
        return val;
    }

    public void put(int key, int value) {
        Integer val = map.get(key);
        if (val!=null){
            //直接放
            map.put(key,value);
            list.add(key);
        }else {
            if (capacity!=map.size()){
                map.put(key,value);
                //删除
                list.remove((Integer) key);
                list.add(key);
            }else {
                //先删除再放
                Integer rmKey = list.get(0);
                list.remove(rmKey);
                map.remove(rmKey);

                map.put(key,value);
                list.add(key);
            }

        }
    }
}
