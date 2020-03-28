/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {

        bstTraversal tree = new bstTraversal();
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root = new TreeNode(10);
        mst.insert(root, 5);
        mst.insert(root, 1);
        mst.insert(root, 15);
        mst.insert(root, 9);
        mst.insert(root, 7);
        mst.insert(root, 12);
        mst.insert(root, 30);
        mst.insert(root, 25);
        mst.insert(root, 40);
        mst.insert(root, 45);
        mst.insert(root, 6);
        mst.insert(root, 3);
        tree.preOrderTraversal(root);//print as pre order
        System.out.println();
        tree.postOrderTraversal(root);//print as post order
        System.out.println();
        tree.inOrderTraversal(root);//print as in order
        System.out.println();
    }
}