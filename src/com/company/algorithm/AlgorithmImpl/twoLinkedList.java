package com.company.algorithm.AlgorithmImpl;

import com.company.algorithm.DataStructure.ListNode;

public class twoLinkedList {
    /**
     * 链表的头插和尾插
     */
    static ListNode listNodeEnd=new ListNode();
    static ListNode listNodeHead=new ListNode();

    //头插法进行链表的创建
    static void createLinkListEnd(int[] link){
        ListNode tempListNode=listNodeEnd;
        for (int value : link) {
            ListNode newNode=new ListNode();
            newNode.val = value;
            tempListNode.next=newNode;
            tempListNode=newNode;
        }
    }
    //尾插法进行链表的创建
    static ListNode createLinkListHead(int[] link){
        ListNode tempListNode1=listNodeHead;
        for(int value:link){
            ListNode newNode=new ListNode();
            newNode.val=value;
            newNode.next=tempListNode1;
            tempListNode1=newNode;
        }
        return tempListNode1;
    }

    //链表的反转
    static ListNode reverse(){
        ListNode p=listNodeEnd;
        ListNode fakeNode=new ListNode();
        fakeNode.next=listNodeEnd;
        ListNode pnext=p.next;
        while(pnext!=null){
            p.next=pnext.next;
            pnext.next=fakeNode.next;
            fakeNode.next=pnext;
            pnext=p.next;
        }
        return fakeNode.next;
    }

    public static void main(String[] args){
        int[] link={1,2,3,4,5};
        createLinkListEnd(link);
        ListNode show=listNodeEnd;
        while(show!=null){
            System.out.print(show.val+" ");
            show=show.next;
        }
        System.out.println();
        ListNode fake=reverse();
        while(fake!=null){
            System.out.print(fake.val+" ");
            fake=fake.next;
        }
    }
}
