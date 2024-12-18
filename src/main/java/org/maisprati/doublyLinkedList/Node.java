package org.maisprati.doublyLinkedList;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> previous;

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
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
