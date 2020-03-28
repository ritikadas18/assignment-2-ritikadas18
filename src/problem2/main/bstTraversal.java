package problem2.main;

import problem1.node.TreeNode;

public class bstTraversal {
    //printing my binary saerch tree as pre order
    void preOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getData() + " ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }
    //printing my binary search tree as post order
    void postOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.print(node.getData() + " ");
    }
    //printing my binary search tree as in order
    void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        inOrderTraversal(node.getLeft());
        System.out.print(node.getData() + " ");
        inOrderTraversal(node.getRight());
    }



}
