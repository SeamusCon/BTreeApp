/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btreeapp;

/**
 *
 * @author munaw
 */
public class BTNode {
    private int element;
    private BTNode leftChild;
    private BTNode rightChild;
    
    
    public BTNode(int theValue) {
       element = theValue;
       leftChild = null;
       rightChild = null;
    }
  
    public boolean isLeaf() {
      return ((leftChild == null) && (rightChild == null));    
    }
    
    public int getElement() {
      return element;
    }
    
    public void setLeft(BTNode theNode) {    
      leftChild = theNode;
    }
    
    public void setRight(BTNode theNode) {
      rightChild = theNode;
    }
    
    public BTNode getLeft() {
      return leftChild;
    }
    
    public BTNode getRight() {
      return rightChild;
    }
    
    public boolean isInternal () {
       if ((leftChild != null) || (rightChild != null))
          return true;
       else
          return false;          
    }
      
    public boolean isExternal() {
      if ((leftChild == null) && (rightChild == null))
          return true;
      else
          return false;
    }
    
}
