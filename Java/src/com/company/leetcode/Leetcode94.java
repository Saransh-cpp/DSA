package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leetcode94 {
    public List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        func(root);
        return this.list;
    }

    public void func(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        this.list.add(root.val);
        inorderTraversal(root.right);
    }

}
