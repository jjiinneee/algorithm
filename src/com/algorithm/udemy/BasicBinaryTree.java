package com.algorithm.udemy;

public class BasicBinaryTree {
  public Node root;
  
  private class Node {
    private Node left;
    private Node right;
    private int value;
  
    public void setLeft(Node left) {
      this.left = left;
    }
  
    public void setRight(Node right) {
      this.right = right;
    }
  
   
  
    public Node getLeft() {
      return left;
    }
  
    public Node getRight() {
      return right;
    }
  
    public int getValue() {
      return value;
    }
  
    public Node(int value){
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  private boolean find(int value){
    Node currentNode = root;
    while(currentNode !=null){
      if(currentNode.getValue() == value){
        return true;
      }else if(currentNode.getValue() > value){
        currentNode = currentNode.getLeft();
      }else{
        currentNode = currentNode.getRight();
      }
    }
    return false;
  }
  
  private boolean insert(int value){
    Node newNode = new Node(value);
    if(find(value)){
      return false;
    }
    if(root == null){
      root = newNode;
      return true;
    }
    Node currentNode = root;
    Node parent;
    while(true){
      parent = currentNode;
      if(value < currentNode.getValue()){
        currentNode = currentNode.getLeft();
        if(currentNode == null){
          parent.setLeft(newNode);
          return true;
        }
      }else{
        currentNode = currentNode.getRight();
        if(currentNode == null){
          parent.setRight(newNode);
          return true;
        }
      }
    }
  }
}
