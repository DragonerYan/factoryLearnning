package com.company.algorithm.DataStructure;

import java.util.ArrayList;
import java.util.List;
public class BinTree {
    private Object data;
    private BinTree lChild;
    private BinTree rChild;
    private BinTree root;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public BinTree getlChild() {
        return lChild;
    }
    public void setlChild(BinTree lChild) {
        this.lChild = lChild;
    }
    public BinTree getrChild() {
        return rChild;
    }
    public void setrChild(BinTree rChild) {
        this.rChild = rChild;
    }
    public BinTree getRoot() {
        return root;
    }
    public void setRoot(BinTree root) {
        this.root = root;
    }

    public BinTree(Object data){
        this.data=data;
    }
    public BinTree(){

    }

    public void created(Object[] data){
        List <BinTree>list=new ArrayList<BinTree>();
        for (Object tempdata :data) {
            list.add(new BinTree(tempdata));
        }
        root=list.get(0);
        for(int i=0;i<list.size()/2;i++){
            if((i*2+1)<list.size()){
                list.get(i).setlChild(list.get(i*2+1));
            }
            if((i*2+2)<list.size()){

                list.get(i).setrChild(list.get(i*2+2));
            }
        }
    }

    public void preOrder(BinTree root){//利用递归实现前序遍历，输出打印结果
        if(root!=null){
            System.out.print(" "+root.getData());
            preOrder(root.getlChild());
            preOrder(root.getrChild());
        }
    }
}


