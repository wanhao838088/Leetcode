package com.leetcode.fiveSixHundred;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/12/18 0018 下午 03:30
 * @author : LiuLiHao
 * 描述：
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 *
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class NAryTreePreorderTraversal589 {

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

    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root==null){
            return list;
        }
        preTravel(root,list);
        return list;
    }

    public void preTravel(Node root, List<Integer> list){
        list.add(root.val);

        List<Node> children = root.children;
        if (children!=null && children.size()>0){
            for (Node child : children) {
                preTravel(child,list);
            }
        }
    }
}
