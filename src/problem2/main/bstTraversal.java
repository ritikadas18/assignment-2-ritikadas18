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


}
