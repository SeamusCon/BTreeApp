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
public class BTreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BTNode theNode1 = new BTNode(1);
        BTNode theNode2 = new BTNode(2);
        BTNode theNode3 = new BTNode(3);
        BTNode theNode4 = new BTNode(4);
        BTNode theNode5 = new BTNode(5);
        BTNode theNode6 = new BTNode(6); 
        BTNode theNode7 = new BTNode(7);
        BTNode theNode8 = new BTNode(8);
        BTNode theNode9 = new BTNode(9);
        BTNode theNode10 = new BTNode(10); 
        BTNode theNode11 = new BTNode(11);
        BTNode theNode12 = new BTNode(12);
        BTNode theNode13 = new BTNode(13); 
        BTNode theNode14 = new BTNode(14);
        BTNode theNode15 = new BTNode(15);
        BTNode theNode16 = new BTNode(15);
        BTNode theNode17 = new BTNode(15);
        BTNode theNode18 = new BTNode(15);
        
        BinaryTree bst = new BinaryTree();
        bst.insertNode(bst.theRoot, theNode1);
        bst.insertNode(bst.theRoot, theNode2);
        bst.insertNode(bst.theRoot, theNode3);
        bst.insertNode(bst.theRoot, theNode4);
        bst.insertNode(bst.theRoot, theNode5);
        bst.insertNode(bst.theRoot, theNode6);
        bst.insertNode(bst.theRoot, theNode7);
        bst.insertNode(bst.theRoot, theNode8);
         bst.insertNode(bst.theRoot, theNode9);
        bst.insertNode(bst.theRoot, theNode10);
        bst.insertNode(bst.theRoot, theNode11);
        bst.insertNode(bst.theRoot, theNode12);
        bst.insertNode(bst.theRoot, theNode13);
        bst.insertNode(bst.theRoot, theNode14);
        bst.insertNode(bst.theRoot, theNode15);
         bst.insertNode(bst.theRoot, theNode16);
        bst.insertNode(bst.theRoot, theNode17);
        bst.insertNode(bst.theRoot, theNode18);
        
        System.out.println("In-order Traversal - The listing of nodes is ");
        bst.inOrderTraversal(bst.theRoot);
        
        System.out.println("Pre-order Traversal - The listing of nodes is ");
        bst.preOrderTraversal(bst.theRoot);
        
        System.out.println("Post-order Traversal - The listing of nodes is ");
        bst.postOrderTraversal(bst.theRoot);
        
    }
    
}
