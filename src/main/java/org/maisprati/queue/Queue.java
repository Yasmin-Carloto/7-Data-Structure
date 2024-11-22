package org.maisprati.queue;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Queue(){
        this.first = null;
        this.last = null;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);

        if(this.last == null){
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }

        size++;
    }

    public Node<T> dequeue(){
        if(this.first == null){
            throw  new IllegalStateException("Fila vaiza!");
        }

        Node<T> current = this.first;
        this.first = this.first.getNext();

        if(this.first == null){
            this.last = null;
        }

        size--;
        return current;
    }

    public Node<T> getById(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = this.first;
        int count = 0;

        while(current != null){
            if(count == index){
                return  current;
            }
            current = current.getNext();
            count++;
        }

        return null;
    }
}
