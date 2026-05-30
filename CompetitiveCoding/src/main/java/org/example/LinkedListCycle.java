package org.example;

public class LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        ListNode tail = head;
        if(tail==null || tail.next == null)return false;
        while(tail!=null){

            tail = tail.next;
            head = head.next;
            if(tail==null) return false;
            tail = tail.next;
            if(head==tail)return true;
        }
        return false;

    }
}
