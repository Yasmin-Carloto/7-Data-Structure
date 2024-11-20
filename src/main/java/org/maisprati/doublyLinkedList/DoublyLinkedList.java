package org.maisprati.doublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public DoublyLinkedList(){
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(this.head == null){
            this.head = newNode;
        }else{
            Node<T> current = getLastNode();
            current.setNext(newNode);
            newNode.setPrevious(current);
        }

        size++;
    }

    public Node<T> getById(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        int count = 0;
        while (current != null){
            if(count == index){
                return current;
            }

            count++;
            current = current.getNext();
        }

        return null;
    }

    public void removeById(int index) throws Exception {
        if(index > size - 1 || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> nodeToRemove = getById(index);

        if(nodeToRemove == null){
            throw new Exception("Node is null");
        }

        if(nodeToRemove == head){
            this.head.setNext(this.head.getNext());
        }else{
            Node<T> current = this.head;
            int count = 0;

            while (current != null){
                if(count == index){
                    current.getNext().setPrevious(current.getPrevious());
                    current.getPrevious().setNext(current.getNext());
                }
                current = current.getNext();
                count++;
            }

            size--;
        }
    }

    public void removeLast(){
        Node<T> lastNode = getLastNode();
        lastNode.getPrevious().setNext(null);
    }

    public Node<T> getLastNode(){
        Node<T> current = this.head;

        while(current != null){
            if(current.getNext() != null){
                current = current.getNext();
            }
            return current;
        }

        return current;
    }

}
