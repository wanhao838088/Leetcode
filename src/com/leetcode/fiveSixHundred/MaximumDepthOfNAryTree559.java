package com.leetcode.fiveSixHundred;

import java.util.List;

/**
 * Created by LiuLiHao on 2019/12/4 0004 下午 03:15
 * @author : LiuLiHao
 * 描述：
 */
public class MaximumDepthOfNAryTree559 {

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


    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int result = 0 ;
        for (Node node : root.children) {
            result = Math.max(result,maxDepth(node));
        }

        return result+1;
    }
}
