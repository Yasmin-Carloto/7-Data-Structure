package org.maisprati.doublyLinkedList;

public class Node<T> {
    private T data;
    private Node next;
    private Node previous;

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
