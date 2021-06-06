package com.company.algorithm.AlgorithmImpl;

import com.company.algorithm.DataStructure.ListNode;

public class twoLinkedList {
    /**
     * 链表的头插和尾插
     */
    static ListNode listNodeEnd=new ListNode();
    static ListNode listNodeHead=new ListNode();

    public static void main(String[] args){
        int[] link={1,2,3,4,5};
        ListNode tempListNode=listNodeEnd;
        //尾插
        for (int value : link) {
            ListNode newNode=new ListNode();
            newNode.val = value;
            tempListNode.next=newNode;
            tempListNode=newNode;
        }
        //头插
        ListNode tempListNode1=listNodeHead;
        for(int value:link){
            ListNode newNode=new ListNode();
            newNode.val=value;
            newNode.next=tempListNode1;
            tempListNode1=newNode;
        }
        ListNode show=tempListNode1;
        while(show!=null){
            System.out.println(show.val);
            show=show.next;
        }
    }
}
