package com.algorithm.udemy;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> implements List<E>{
  
  private DoubleNode<E> head;
  private DoubleNode<E> tail;
  private int length;
  
  public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  
  
  //특정 위치의 노드를 반환하는 메소드
  public DoubleNode<E> search(int index){
    if(index < 0 ||  index >= length){
      throw new IndexOutOfBoundsException();
    }
    
    //뒤에서부터 검색
    if(index > length/2){
      DoubleNode<E> x = tail;
      for (int i = length-1; i > index ; i--) {
        x = x.prev;
      }
      return x;
    }else{
      //앞에서부터 검색
      DoubleNode<E> x = head;
      for (int i = 0; i < index; i++) {
        x = x.next;
      }
      return x;
    }
  }
  
  public void addFirst(E value){
    DoubleNode<E> newNode = new DoubleNode<E>(value);   //새 노드 생성
    newNode.next = head;
    
    /*
      head가 null이 아닐 경우에만 기존 head노드의 prev 변수가 새 노드를 가리키도록 함
      이유는 기존 head노드가 없는 경우(null)는 데이터가 아무것도 없던 상태였으므로
      head.prev하면 잘못된 참조가 된다.
     */
    if(head != null){
      head.prev = newNode;
    }
    head = newNode;
    length++;
    
    if(head.next ==null){
      tail = head;
    }
  }
  
  public void addLast(E value){
    DoubleNode<E> newNode = new DoubleNode<E>(value);
    
    //길이가0 = 노드에 데이터가 없으면 처음으로 데이터 추가
    if(length == 0){
      addFirst(value);
      return;
    }
    
    //마지마 노드 tail의 다음 노드(next)가 새 노드를 가리키도록 하고
    //tail이 가리키는 노드를 새 노드로 바꿔준다.
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    length++;
    
    
  }
  @Override
  public boolean add(E value) {
    addLast(value);
    return true;
  }
  
  @Override
  public void add(int index, E value) {
    //잘못된 인덱스를 참졸할 경우 예외 발생
    if(index > 0 || index > length){
      throw new IndexOutOfBoundsException();
    }
    
    
    //추가하려는 index가 가장 앞에 추가하려는 경우 addFirst
    if(index == 0){
      addFirst(value);
      return;
    }
    
    //추가하려는 위치의 이전 노드
    DoubleNode<E> prev_Node = search(index -1);
    
    //추가하려는 위치의 노드
    DoubleNode<E> next_Node = prev_Node.next;
    
    //추가하려는 노드
    DoubleNode<E> newNode = new DoubleNode<E>(value);
    
    //링크 끊기
      prev_Node.next = null;
      next_Node.prev = null;
      
    //링크 연결
    prev_Node.next = newNode;
    newNode.prev = prev_Node;
    next_Node.next = next_Node;
    next_Node.prev = newNode;
    length++;
  }
  
  public E remove(){
    DoubleNode<E> headNode = head;
    
    if(headNode == null) {
      throw new NoSuchElementException();
    }
      //삭제된 노드를 반환하기 위한 임시 변수
      E elemnet = head.data;
      
      //head의 다음 노드
      DoubleNode<E> nextNode = head.next;
      
      //head 노드의 데이터들을 모두 삭제
      head.data = null;
      head.next = null;
      
      /*
        head의 다음노드(next_node)가 null이 아닐 경우에만 prev 변수를 null로 업데이트 해주어야 한다.
        이유는 nextNode가 null일 경우 데이터가 없는 상태니까 nextNode.prev를 하면 잘못된 참조
       */
      if(nextNode !=null){
        nextNode.prev = null;
      }
      head = nextNode;
      length--;
      
      /*
        삭제된 요소가 리트스의 유일한 요소일 경우 그 요소는 head 이면서 tail 이므로
        삭제되면서 tail을 가리킬 요소가 없기 때문에
        length == 0이면 tail=null
       */
      if(length == 0){
        tail = null;
      }
      return elemnet;
  }
  
  @Override
  public E remove(int index) {
    
    if(index >= length || index < 0){
      throw new IndexOutOfBoundsException();
    }
    
    //삭제하려는 노드가 첫 번째 노드일 경우
    if(index == 0){
      E element = head.data;
      remove();
      return element;
    }
    
    DoubleNode<E> prevNode = search(index - 1);  //삭제할 노드의 이전 노드
    DoubleNode<E> removeNode = prevNode.next;         // 삭제할 노드
    DoubleNode<E> nextNode = removeNode.next;         //삭제할 노드의 다음 노드
    
    //삭제할 노드의 데이터를 반환하기 위한 임시 변수
    E element = removeNode.data;
    
    /*
    index == 0 일 때의 조건에서 이미 head노드의 삭제에 대한 분기가 있음  >  prevNode 항상존재
    
    근디 nextNode는 null일 수 있기 때문에(= 마지막 노드를 삭제하려는 경우)
    반드시 검사 해주고 nextNode.prev에 접근해야 함
     */
    
    prevNode.next = null;
    removeNode.next = null;
    removeNode.prev = null;
    removeNode.data = null;
    
    if(nextNode != null){
      nextNode.prev = null;
      
      nextNode.prev =prevNode;
      prevNode.next = nextNode;
    }else{
      tail = prevNode;
    }
    
    length--;
    return element;
  }
  
  @Override
  public boolean remove(Object value) {
    DoubleNode<E> prevNode = head;
    DoubleNode<E> x = head;     // removeNode
    
    //value와 일치하는 노드
    for (; x !=null; x = x.next){
      if(value.equals(x.data)){
        break;
      }
      prevNode = x;
    }
    
    //일치하는 요소가 없을 경우 false반환
    if(x == null){
      return false;
    }
    
    //삭제하려는 노드가 head일 경우 remove로 삭제
    if(x.equals(head)){
      remove();
      return true;
    }
    
    //remove(int index)와 같은
    else{
      DoubleNode<E> nextNode = x.next;
      prevNode.next = null;
      x.data = null;
      x.next = null;
      x.prev = null;
      
      if(nextNode != null){
        nextNode.prev = null;
        
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        
      }else{
        tail = prevNode;
      }
      length--;
      return true;
    }
  }
  
  
  //노드의 데이터를 반환하는것
  @Override
  public E get(int index) {
    return search(index).data;
  }
  
  
  //데이터 교체!!! index에 위치한 데이터를 교체
  @Override
  public void set(int index, E value) {
    DoubleNode<E> replaceNode = search(index);
    replaceNode.data = null;
    replaceNode.data = value;
  }
  
  @Override
  public boolean contains(Object value) {
    return indexOf(value) >= 0;
  }
  
  
  //사용자가 찾고자 하는 요소의 위치 반환!
  //head부터 검색 >  indexOf  / tail 부터 역방향 검색 >  lastIndexOf
  @Override
  public int indexOf(Object value) {
    int index = 0;
    for (DoubleNode<E> x = head; x != null; x = x.next){
      if(value.equals(x.data)){
        return index;
      }
      index++;
    }
    return -1;
  }
  
  public int lastIndexOf(Object value){
    int index = length;
    for (DoubleNode<E> x = tail; x != null; x = x.prev){
      index--;
      if(value.equals(x.data)){
        return index;
      }
    }
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
  
  @Override
  public void clear() {
    for (DoubleNode<E> x = head; x !=null;){
      DoubleNode<E> nextNode = x.next;
      x.data = null;
      x.prev = null;
      x.next = null;
      x = nextNode;
    }
    head = tail = null;
    length = 0;
  }
}
