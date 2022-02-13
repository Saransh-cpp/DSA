package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode144 {
    public List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        func(root);
        return this.list;
    }

    public void func(TreeNode root) {
        if (root == null) return;
        this.list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

}
