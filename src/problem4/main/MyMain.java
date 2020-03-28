package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        TreeNode root;
        root = new TreeNode(10);
        obj.insert(root,5);
        obj.insert(root,10);
        obj.insert(root,7);
        obj.insert(root,26);
        obj.insert(root,13);
        obj.insert(root,19);
        obj.insert(root,7);

    }
}