package com.algorithm.leetcode;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLists {
  
//  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    ListNode result = new ListNode();
//
//    ListNode curr_node = result;
//
//    if(list1 == null) {
//      curr_node.next = list2;
//    }
//
//    if(list2 == null) {
//      curr_node.next = list1;
//    }
//
//    while(true){
//      if(list1.val < list2.val){
//        curr_node.next = list1;
//        list1 = list1.next;
//      }
//    }
//
//
//    return result.next;
//  }
  
}
