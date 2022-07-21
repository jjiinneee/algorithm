package com.algorithm.leetcode;

public class MiddleOfTheLinkedList {
  public ListNode middleNode(ListNode head) {
    
    ListNode[] arr = new ListNode[10];
    int i =0;
    
    while(head != null){
      arr[i++] = head;
      head = head.next;
    }
    
    return arr[i / 2];
  }
}