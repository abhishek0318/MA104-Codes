/**
 *  Abhishek Sharma
 *  Assignment 5 - MA104
 *  16123002
 *  Mathematics and Computing
 */

public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("In this example of abstract class, abstract class List is" +
                " extended by Singly Linked List and Doubly Linked List classes respectively.");
    }
}

abstract class List<T> {
    abstract public boolean isEmpty();
    abstract public void insertAtBeginning(T object);
    abstract public void insertAtEnd(T object);
    abstract public boolean search(T object);
    abstract public void deleteFromBeginning();
    abstract public void deleteFromEnd();
}

class SinglyLinkedList<T> extends List<T> {
    private class Node<T> {
        T object;
        Node<T> next;

        Node(T object) {
            this.object = object;
            next = null;
        }

        @Override
        public String toString() {
            return object.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return object.equals(obj);
        }
    }

    private Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(T object) {
        Node<T> oldHead = head;
        head = new Node<T>(object);
        head.next = oldHead;
    }

    public void insertAtEnd(T object) {
        if (head == null) {
            insertAtBeginning(object);
            return;
        }
        Node<T> trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = new Node<T> (object);;
    }

    public boolean search(T object) {
        if (head == null) return false;
        Node<T> trav = head;
        while (trav.next != null) {
            if (trav.equals(object)) return true;
            trav = trav.next;
        }
        return false;
    }

    public void deleteFromBeginning() {
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> trav = head;
        while (trav.next.next != null) {
            trav = trav.next;
        }
        trav.next = null;
    }

    @Override
    public String toString() {
        String string = "";
        if (head == null) return string;
        Node<T> trav = head;
        while (trav != null) {
            string += (trav.toString() + " ");
            trav = trav.next;
        }
        return string;
    }
}

class DoublyLinkedList<T> extends List<T> {
    private class Node<T> {
        T object;
        Node<T> next;
        Node<T> prev;

        Node(T object) {
            this.object = object;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return object.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return object.equals(obj);
        }
    }

    private Node<T> head;

    public DoublyLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(T object) {
        Node<T> oldHead = head;
        head = new Node<T>(object);
        head.next = oldHead;
        oldHead.prev = head;
    }

    public void insertAtEnd(T object) {
        if (head == null) {
            insertAtBeginning(object);
            return;
        }
        Node<T> trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = new Node<T> (object);
        trav.next.prev = trav;
    }

    public boolean search(T object) {
        if (head == null) return false;
        Node<T> trav = head;
        while (trav.next != null) {
            if (trav.equals(object)) return true;
            trav = trav.next;
        }
        return false;
    }

    public void deleteFromBeginning() {
        head = head.next;
        head.prev = null;
    }

    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> trav = head;
        while (trav.next.next != null) {
            trav = trav.next;
        }
        trav.next = null;
    }

    @Override
    public String toString() {
        String string = "";
        if (head == null) return string;
        Node<T> trav = head;
        while (trav != null) {
            string += (trav.toString() + " ");
            trav = trav.next;
        }
        return string;
    }
}
