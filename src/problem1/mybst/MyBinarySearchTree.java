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
    public TreeNode insert(TreeNode root, int x) {
        if (root == null) {
            return new TreeNode(x);
        }
        //if x is greater ...add element to right
        else if (x > root.getData()) {
            root.setRight(insert(root.getRight(), x));
        }
        //else insert to left
        else {
            root.setLeft(insert(root.getLeft(), x));
        }
        return root;

    }

    //pre-order traversal of BST
    public void preOrderTraverse(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrderTraverse(root.getLeft());
            preOrderTraverse(root.getRight());
        }
    }

    public void countNodeWithoutLeftChild(TreeNode root) {
        if (root == null) {
            return;
            //level order traversal beginning with root
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);

            int count = 0;
            while (queue != null) {
                TreeNode temp = queue.poll();
                if (temp == null) {
                    break;
                }
                if (temp.getLeft() == null) { //if  left child not  found inrement valuen of count by 1
                    count++;
                }
                //enqueue left child
                if (temp.getLeft() != null) {
                    queue.add(temp.getLeft());
                }
                //enqueue right child
                if (temp.getRight() != null) {
                    queue.add(temp.getRight());
                }
            }
            System.out.println("number of nodes without left child = " + count);

        }

    }

    public void printLeftTree(TreeNode root) {
        if (root == null)
            return;
        que.add(root);//add root to queue
        que.add(null);

        while (que.size() > 0) {
            TreeNode temp = que.peek();

            if (temp != null) {

                // Prints first node
                System.out.print(temp.getData() + " ");

            }
            // add children of all nodes at current level
            while (que.peek() != null) {

                // If left child is present then add into queue
                if (temp.getLeft() != null)
                    que.add(temp.getLeft());

                // If right child is present then add into queue
                if (temp.getRight() != null)
                    que.add(temp.getRight());

                // remove the current node
                que.remove();

                temp = que.peek();
            }
            que.add(null);
        }
        que.remove();
    }
}


