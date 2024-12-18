package org.maisprati.singlyLinkedList;

public class Node<T> {
    private T data;
    private Node<T> next;
    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}