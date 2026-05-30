package org.example;

public class MergeTwoSortedLists {
    public static void main(String args[]){
        int[] arr1 = new int[]{1,2,4};
        int[] arr2 = new int[]{1,3,4};
//        ListNode list1 = new ListNode();
        for(int i = 0;i<arr1.length;i++){

        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        ListNode tail = new ListNode();
        if(list1.val<=list2.val) {
            head = list1;
            tail = list1;
            list1 = list1.next;
        }
        else if(list1.val>=list2.val) {
            head = list2;
            tail = list2;
            list2 = list2.next;
        }

        while(list1 != null && list2!=null){

            if(list1.val<=list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;

            }
            else if(list1.val>=list2.val){
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;

            }
        }
        if(list1!= null) tail.next=list1;
        else if(list2!=null) tail.next = list2;
        return head;
    }
}

