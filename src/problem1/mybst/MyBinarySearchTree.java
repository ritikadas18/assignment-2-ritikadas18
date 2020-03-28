/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> que;
    //insert method
    public TreeNode insert(TreeNode root,int x) {
        if(root==null)
        {
            return new TreeNode(x);
        }
        //if x is greater ...add element to right
        else if(x>root.getData()){
            root.setRight(insert(root.getRight(),x));
        }
        //else insert to left
        else{
            root.setLeft(insert(root.getLeft(),x));
        }
        return root;

    }
    //pre-order traversal of BST
    public void preOrderTraverse(TreeNode root) {
        if(root!=null) {
            System.out.println(root.getData());
            preOrderTraverse(root.getLeft());
            preOrderTraverse(root.getRight());
        }
    }
    public void countNodeWithoutLeftChild(TreeNode root) {

    }
}
