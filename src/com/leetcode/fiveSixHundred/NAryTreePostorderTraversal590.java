package com.leetcode.fiveSixHundred;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/12/18 0018 下午 03:22
 * @author : LiuLiHao
 * 描述：
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 *
 *
 * 返回其后序遍历: [5,6,3,2,4,1].
 */
public class NAryTreePostorderTraversal590 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root==null){
            return list;
        }
        postTravel(root,list);
        return list;
    }

    public void postTravel(Node root,List<Integer> list){
        List<Node> children = root.children;
        if (children!=null && children.size()>0){
            for (Node child : children) {
                postTravel(child,list);
            }
        }
        list.add(root.val);
    }
}
