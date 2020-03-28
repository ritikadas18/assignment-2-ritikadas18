package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.node.TreeNode;
import problem3.node.Node;

public class MyQueue {

    private Node front;
    private Node rear;
    public Node getFront() {
        return front;
    }
    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }
    public void setRear(Node rear) {
        this.rear = rear;
    }
    public void enQueue(Node newNode) {
        if (front == null && rear == null) {
            setFront(newNode);
            setRear(newNode);
        } else {
            getRear().setNextNode(newNode);
            setRear(getRear().getNextNode());
        }
    }
    public Node deQueue() {
        Node temp;

        return temp;
    }


}