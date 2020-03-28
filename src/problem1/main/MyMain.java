/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        TreeNode root;
        root = new TreeNode(10);
        bst.insert(root, 7);
        bst.insert(root, 3);
        bst.insert(root, 12);
        bst.insert(root, 10);
        bst.insert(root, 6);
        bst.insert(root, 17);
        bst.insert(root, 26);
        bst.insert(root, 19);
        bst.insert(root, 36);
        bst.insert(root, 52);
        bst.insert(root, 1);
        bst.preOrderTraverse(root);
        bst.countNodeWithoutLeftChild(root);
        bst.viewLeft(root);
    }
}
