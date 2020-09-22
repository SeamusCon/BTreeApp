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
public class BinaryTree {
    public BTNode theRoot;
    
    public BinaryTree() {
      theRoot = null;
    }
    
    public BTNode root() {
       return theRoot;
    }
    
    public boolean isEmpty() {
       if (theRoot == null)
           return true;
       else
           return false;    
    }
    
    public void insertNode(BTNode startNode, BTNode theNewNode){
       if (theRoot == null)
           theRoot = theNewNode;
       else {
              if (theNewNode.getElement() > startNode.getElement())
              {
                 if (startNode.getRight() == null)
                     startNode.setRight(theNewNode);
                 else
                     insertNode(startNode.getRight(), theNewNode);              
              }
              else if (theNewNode.getElement() < startNode.getElement()){
                 if (startNode.getLeft() == null)
                     startNode.setLeft(theNewNode);
                 else
                     insertNode(startNode.getLeft(), theNewNode);                 
              }
              else if (theNewNode.getElement() == startNode.getElement()) {
                  System.out.println("The node " + startNode.getElement() +
                                     " was already present");
           }                                    
       }    
    }
    
    public void inOrderTraversal(BTNode theStart){
        if (theStart == null)
            return;
        else {
            inOrderTraversal(theStart.getLeft());
            System.out.println("InOrder traversal Node: " + theStart.getElement());
            inOrderTraversal(theStart.getRight());
        }
    }
   
    public void preOrderTraversal(BTNode theStart) {
        if (theStart == null)
            return;
        else {
               System.out.println("PreOrder traversal Node: " + theStart.getElement());
               preOrderTraversal(theStart.getLeft());
               preOrderTraversal(theStart.getRight());
            }
    }
    
    public void postOrderTraversal(BTNode theStart) {
        if (theStart == null)
            return;
        else {
               postOrderTraversal(theStart.getLeft());
               postOrderTraversal(theStart.getRight());
               System.out.println("Post Order traversal Node: " + theStart.getElement());
           }
    }
    
}
