/**
 *  Abhishek Sharma
 *  Assignment 5 - MA104
 *  16123002
 *  Mathematics and Computing
 */

public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.insertAtBeginning("Delhi");
        stringLinkedList.insertAtEnd("Mumbai");
        stringLinkedList.insertAtEnd("Bangalore");
        stringLinkedList.insertAtEnd("Varanasi");
        stringLinkedList.insertAtEnd("Chennai");
        System.out.println(stringLinkedList.search("Delhi"));
        System.out.println(stringLinkedList);
        stringLinkedList.deleteFromBeginning();
        System.out.println(stringLinkedList);
        stringLinkedList.insertAtBeginning("Kolkata");
        System.out.println(stringLinkedList);
        stringLinkedList.deleteFromEnd();
        System.out.println(stringLinkedList);
    }
}

class LinkedList<T> {
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

    public LinkedList() {
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

