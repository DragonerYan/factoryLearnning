package com.company.algorithm.DataStructure;

public class Tree {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public Tree() {}
    public Tree(int val) { this.val = val; }
    public Tree(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
