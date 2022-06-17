package com.algorithm.grammar.LinkedList;


import java.util.List;

class ListNode {
  private String data;  //데이터 저장 변수
  public ListNode link;  //다른 노드를 참조할 링크 노드
  
  public ListNode(){
    this.data = null;
    this.link = null;
  }
  
  public ListNode(String data) {
    this.data = data;
    this.link = null;
  }
  
  public ListNode(String data, ListNode link) {
    this.data = data;
    this.link = link;
  }
  
  public String getData() {
    return data;
  }
}
public class LinkedList {
  private ListNode head;
  
  public LinkedList() {
    this.head = null;
  }

  
  //노드 중간 삽입
  public void insertMiddleNode(ListNode pre, String data){
    //새로운 노드 생성
    ListNode newNode = new ListNode(data);
    
    newNode.link = pre.link;
    pre.link = newNode;
  }
  
  //  노드 마지막에 삽입
  public void insertLastNode(String data){
    ListNode newNode = new ListNode(data);
    if(head == null){
      this.head = newNode;
    }
    ListNode tempNode = head;
    while(tempNode.link !=null){
      tempNode = tempNode.link;
    }
    tempNode.link = newNode;
  }
  
  //중간 노드 삭제
  public void deleteMiddleNode(String data){
    ListNode preNode = head;
    
    ListNode tempNode = head.link;
    
    if(data.equals(preNode.getData())){
      head = preNode.link;
      preNode.link = null;
    }else{
      while(tempNode !=null){
        if(data.equals(tempNode.getData())){
          if(tempNode.link == null){
            preNode.link = null;
          }else{
            preNode.link = tempNode.link;
            tempNode.link = null;
          }
          break;
        }else{
          preNode = tempNode;
          tempNode = tempNode.link;
        }
      }
    }
  }
  
  
  // 마지막 노드 삭제
  public void deleteLastNode(){
    ListNode preNode;
    ListNode tempNode;
    
    if(head == null){
      return;
    }
    
    
    if(head.link == null){
      head = null;
    }else{
      preNode = head;
      tempNode= head.link;
  
  
      while(tempNode.link != null){
        preNode = tempNode;
        tempNode = tempNode.link;
      }
      preNode.link = null;
      
    }
  }
  
  //탐색
  public ListNode searchNode(String data){
    ListNode tempNode = this.head;
    
    while(tempNode !=null){
      if(data.equals(tempNode.getData())){
        return tempNode;
      }else{
        tempNode = tempNode.link;
      }
    }
    
    return tempNode;
  }
  
  public void reverseList(){
    ListNode nextNode = head;
    ListNode currentNode = null;
    ListNode preNode = null;
    
    if(nextNode != null){
      preNode = currentNode;
      currentNode = nextNode;
      nextNode = nextNode.link;
      currentNode.link = preNode;
    }
    head = currentNode;
  }
}

// https://freestrokes.tistory.com/84
// https://st-lab.tistory.com/167
// https://www.neya.kr/123