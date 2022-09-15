package com.algorithm.udemy;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements List<E> {
  
  private Node<E> head;  //노드의 첫 부분
  private Node<E> tail;   //노드의 마지막
  private int length;       //노드 길이
  
  //생성자
  public SinglyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  
  //특정 위치의 노드를 반환하는 메소드
  public Node<E> search(int index){
      if(index < 0 || index >= length){
        throw new IndexOutOfBoundsException();
      }
      
      Node<E> x = head;   //  head가 가리키는 노드부터 시작
  
    for (int i = 0; i < index; i++) {
      x = x.next;    //x의 다음노드를 x에 저장
    }
    return x;
  }
  
  
  //1.가장 압부분에 추가
  public void addFirst(E value){
    Node<E> newNode = new Node<E>(value);
    newNode.next = head;
    head = newNode;
    length++;
    
    //데이터가 한개일경우 새 노드는 시작노드이자 마지막 노드
    if(head.next == null){
      tail = head;
    }
  }
  
  //2.가장 마지막에 추가
  @Override
  public boolean add(E value) {
    addLast(value);
    return true;
  }
  
  public void addLast(E value){
    Node<E> newNode = new Node<E>(value);   //새 노드
    
    if(length == 0){
      addFirst(value);    //처음 넣는 노드일 경우 addFirst로 이동
      return;
    }
    
    
    //마지막 노듸 다음 노드인(tail.next)가 새로운 노드를 가리키도록 하고
    //tail이 가리키는 노드를 새 노드로 바꿔준다.
    tail.next = newNode;
    tail = newNode;
    length++;
  }
  
  //3.특정 위치에 추가
  @Override
  public void add(int index, E value) {
    if(index < 0 || index >  length){
      throw new IndexOutOfBoundsException();
    }
    
    if(index == 0){
      addFirst(value);
      return;
    }
    
    if(index == length){
      addLast(value);
      return;
    }
    
    //추가하려는 위치의 이전 노드
    Node<E> pre_node = search(index - 1);
    //추가하려는 위치의 노드
    Node<E> next_node = pre_node.next;
    // 추가하려는 노드
    Node<E> newNode = new Node<E>(value);
    
    pre_node.next = null;
    pre_node.next= newNode;
    newNode.next = next_node;
    length++;
  }
  
  public E remove(){
    Node<E> headNode = head;
    
    if(headNode == null){
      throw new NoSuchElementException();
    }
    
    //삭제된 노드를 봔환하기 위한 임시 변수
    E element = headNode.data;
    
    //헤더의 다음노드
    Node<E> nextNode = head.next;
    
    //헤드 노드 데이터 모두 삭제
    head.data = null;
    head.next = null;
    
    //헤드가 다음 노드를 가리키도록, 길이도 하나 줄어듬
    head = nextNode;
    length--;
    
    if(length == 0){
      tail = null;
    }
    return element;
  }
  
  @Override
  public E remove(int index) {
    
    //삭제하려는 노드가 첫 번쨰 원소일 경우
    if(index == 0){
      return remove();
    }
    
    if(index < 0  || index >= length){
      throw new IndexOutOfBoundsException();
    }
    
    Node<E> preNode = search(index - 1);   //삭제할 노드의 이전 노드
    Node<E> removeNode = preNode.next;  // 삭제할 노드
    Node<E> nextNode = removeNode.next;   //삭제할 노드의 다음 노드
    
    E element = removeNode.data;    //삭제되는 노드의 데이터르르 반환하기 위한 임시 변수
    
    //이전노드가 가리키드는 노드를 삭제하려는 노드의 다음노드로 변경
    preNode.next = nextNode;
    
    //만약 삭제했던 노드가 마지막 노드라면 tail을 preNode로 갱신
    if(removeNode.next == null){
      tail = preNode;
    }
    
    //데이터 삭제
    removeNode.next = null;
    removeNode.data = null;
    length--;
    
    return element;
  }
  
  @Override
  public boolean remove(Object value) {
    Node<E> preNode = head;
    boolean hasValue = false;
    Node<E> removeNode = head;
  
    
    //value와 일치하는 노드를 찾는다
    for (; removeNode != null; removeNode = removeNode.next){
      if(value.equals(removeNode.data)){
        hasValue = true;
        break;
      }
      preNode = removeNode;
    }
    
    if(removeNode == null){
      return false;
    }
    
    //만약 삭제하려는 노드가 head라면 기존 remove()사용
    if(removeNode.equals(head)){
      remove();
      return true;
    }else{
      //이전 노드의 링크를 삭제하려는 노드의 다음 노드로 연결
      preNode.next = removeNode.next;
      
      //만약 삭제했던 노드가 마지막 노드라면 tail을 preNode로 갱신
      if(preNode.next == null){
        tail = preNode;
      }
      removeNode.data = null;
      removeNode.next = null;
      length--;
      return true;
    }
  }
  
  
  //get/set 둘다 잘못된 인덱스를 참조하고 있는지 아닌지 확인해야함
  //search메소드 안에서 인덱스 검사를 해주기 때문에 이부분은 따로 구현 하지 않아도됨
  
  //search 노드를 반환 / get 노드의 데이터 반환
  @Override
  public E get(int index) {
    return search(index).data;
  }
  
  //index에 위치한 데이터를 새로운 데이터로 교체
  //add는 추가 set은 교체
  //index에 위치한 데이터를 교체하는 것이기 때문에 마찬가지로
  //search메소드를 사용하여 노드를 찾고 , 노드의 데이터만 새로운 데이터로 변경해주면 된다.
  @Override
  public void set(int index, E value) {
    Node<E> replaceNode = search(index);
    replaceNode.data = null;
    replaceNode.data = value;
  }
  
  
  //사용자가 찾고자 하는 요소 value가 존재하는지 않하는지
  @Override
  public boolean contains(Object value) {
    return indexOf(value) >=0;
  }
  
  
  //사용자가 찾고자 하는 요소 value의 위치 반환
  //찾고자 하는 요소가 중복된다면??? >> 가장 먼저 마주치는 요소의 인덱스를 반환
  //찾고자 하는 요소가 없다? -1 반환
  @Override
  public int indexOf(Object value) {
    int index = 0;
    for (Node<E> x = head; x != null; x = x.next){
      if(value.equals(x.data)){
        return index;
      }
      index++;
    }
    
    //찾고자 하는 요소를 찾지 못했을 경우 -1
    return -1;
  }
  
  @Override
  public int length() {
    return length;
  }
  
  @Override
  public boolean isEmpty() {
    return length == 0;
  }
  
  
  //초기화
  //객체자체를 null해주기 보다는 모든 노드를 하나하나 null해주는 것이
  //자바의 가비지 컬렉터가 명시적으로 해당 메모리를 안쓴다고 인지하기 때문에
  //메모리 관리 효율 측면에서 조금이나마 더 좋다.
  @Override
  public void clear() {
    for (Node<E> x= head; x!= null;) {
      Node<E> nextNode = x.next;
      x.data = null;
      x.next = null;
      x  = nextNode;
    }
    head = tail = null;
    length = 0;
  }
}
