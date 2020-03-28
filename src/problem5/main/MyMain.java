/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCircularQueue cq = new MyCircularQueue();
        System.out.println("Enter number of records you wants to enter");
        int nOR = scan.nextInt();
        while (nOR != 0) {
            Student student = new Student();
            Node node = new Node();

            System.out.println("Enter name");
            student.setName(scan.next().trim());
            System.out.println("Enter roll number");
            student.setRollNumber(scan.nextInt());
            System.out.println("Enter backlogs");

    }

}
}
