package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode145 {
    public List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        func(root);
        return this.list;
    }

    public void func(TreeNode root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        this.list.add(root.val);
    }

}
