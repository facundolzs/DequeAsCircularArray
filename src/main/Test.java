package main;

import doubleEndendQueue.Deque;

public class Test {

    public static void main(String[] args) {

        Deque myDeque = new Deque(6);

        System.out.println("Deque is empty? " + myDeque.isEmpty());

        System.out.println("\nDeque is full? " + myDeque.isFull());

        System.out.println("\n<<After adding four elements>>");
        myDeque.insertAtFront(13);
        myDeque.insertAtRear(42);
        myDeque.insertAtFront(25);
        myDeque.insertAtRear(31);

        System.out.println();

        myDeque.print();

        System.out.println("\n<<After deleting two elements>>");
        myDeque.deleteAtFront();
        myDeque.deleteAtRear();

        System.out.println();

        myDeque.print();

        System.out.println("\nDeque is empty? " + myDeque.isEmpty());

        System.out.println("\nDeque is full? " + myDeque.isFull());

        System.out.println("\n<<After adding four elements>>");
        myDeque.insertAtRear(50);
        myDeque.insertAtFront(71);
        myDeque.insertAtRear(36);
        myDeque.insertAtFront(11);

        System.out.println();

        myDeque.print();

        System.out.println("\nDeque is empty? " + myDeque.isEmpty());

        System.out.println("\nDeque is full? " + myDeque.isFull());

        System.out.println("\n<<After adding one element>>");
        myDeque.insertAtRear(15);

        System.out.println("\n<<After deleting three elements>>");
        myDeque.deleteAtFront();
        myDeque.deleteAtFront();
        myDeque.deleteAtRear();

        System.out.println();

        myDeque.print();

        System.out.println("\n<<After deleting three elements>>");
        myDeque.deleteAtFront();
        myDeque.deleteAtRear();
        myDeque.deleteAtRear();

        System.out.println();

        myDeque.print();

        System.out.println("\n<<After deleting one element>>");
        myDeque.deleteAtRear();

        System.out.println("\nDeque is empty? " + myDeque.isEmpty());

        System.out.println("\nDeque is full? " + myDeque.isFull());

    }

}
