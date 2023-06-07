package com.cui.Day01;

/*给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0开头。
*/
public class Question_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      /*  ListNode head = null;
        ListNode tail = new ListNode();
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1!=null?l1.val:0;
            int n2 = l2!=null?l2.val:0;
            int sum = n1 + n2 + carry;
            if (head==null) {
                head  = new ListNode(sum%10);
                tail = head;
            }else {
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            carry = (sum)/10;
            if(l1!=null){  l1 = l1.next;}
            if(l2!=null){l2=l2.next;}
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return head;
*/

       return add( l1,  l2,0);
    }
    public ListNode add(ListNode l1, ListNode l2,int carry){
        if(l1==null && l2==null && carry==0){
            return null;
        }
        int val = 0;
        int val1 =0;
        if(l1!=null){
            val = l1.val;
            l1= l1.next;
        }
        if(l2!=null){
            val1 = l2.val;
            l2=l2.next;
        }
        ListNode listNode = new ListNode(val + val1 + carry % 10);
        listNode.next = add(l1,l2, val+val1+carry/10);
        return listNode;

    }

}

class ListNode {
    int val;
    ListNode next;


    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }
}

