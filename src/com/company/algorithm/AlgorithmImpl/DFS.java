package com.company.algorithm.AlgorithmImpl;

import com.company.algorithm.DataStructure.TreeNode;
import com.company.algorithm.DataStructure.BinTree;

public class DFS {
    public static void main(String[] args) {
        Object[] object ={1,2,3,4,5};
        BinTree binTree=new BinTree();
        binTree.created(object);
        binTree.preOrder(binTree.getRoot());
    }
    int lx=0;
    int ly=0;
    TreeNode xp;
    TreeNode yp;
    int y;
    int x;
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x=x;
        this.y=y;

        return true;
    }
    public void dfs(TreeNode root,TreeNode p,int l){
        if(root.left==null && root.right==null){
            return;
        }
        if(root.val==x){
            lx=l;
            xp=p;
        }
        if(root.val==y){
            ly=l;
            yp=p;
        }
        if(root.left!=null){
            dfs(root.left,root,l+1);
        }
        if(root.right!=null) {
            dfs(root.right,root,l+1);
        }
    }
}
