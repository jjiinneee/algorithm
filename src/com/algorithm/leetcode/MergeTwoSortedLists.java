package com.algorithm.leetcode;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLists {
  
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode();
  
    ListNode curr_node = result;
  
    while(list1 != null && list2 != null) {
      if(list1.val < list2.val ) {
        curr_node.next = list1;
        list1 = list1.next;
      } else {
        curr_node.next = list2;
        list2 = list2.next;
      } // if ~ else end
    
      // 노드가 위의 과정을 끝낸 현재와 같도록
      curr_node = curr_node.next;
    } // while end
  
    // 둘 중 하나가 null이 되어도 다른 하나가 끝날 때 까지 실행
    // l1이 null이면 l2를 저장
    if(list1 == null) {
      curr_node.next = list2;
    }
    // l2가 null이면 l1을 저장
    if(list2 == null) {
      curr_node.next = list1;
    }
  
    return result.next;
  }
  
}
