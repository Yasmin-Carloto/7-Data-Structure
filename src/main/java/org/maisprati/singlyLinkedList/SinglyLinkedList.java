package org.maisprati.singlyLinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public SinglyLinkedList(){
        this.head = null;
    }

    public int getSize(){
        return this.size;
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(this.head == null){
            this.head = newNode;
        } else {
            Node<T> lastNode = getLastNode();
            lastNode.setNext(newNode);
        }
        this.size++;
    }

    public T getById(int index) throws IndexOutOfBoundsException{
        if(index > size - 1 || index < 0) throw new IndexOutOfBoundsException("Index out of bounds");

        Node<T> current = this.head;
        int count = 0;

        while (current != null){
            if(count == index){
                return current.getData();
            }
            count++;
            current = current.getNext();
        }

        return null;
    }

    public void removeById(int index){
        if(index > size - 1 || index < 0) throw new IndexOutOfBoundsException("Index out of bounds");
        Node<T> current = this.head;

        if(this.head == null) throw new IndexOutOfBoundsException("Index out of bounds");

        if(index == 0) {
            this.head = this.head.getNext();
            this.size--;
        }

        int count = 0;
        Node<T> previous = null;

        while (count < index){
            previous = current;
            current = current.getNext();
            count++;
        }

        previous.setNext(current.getNext());
        this.size--;
    }

//Testar funcionalidade
    public void removeLast() {
        if(this.head == null) throw new IndexOutOfBoundsException("Index out of bounds");

        if(this.head.getNext() == null){
            this.head = null;
            this.size--;
            return;
        }

        Node<T> lastNode = getLastNode();
        Node<T> current = this.head;

        while (current.getNext() != lastNode){
            current = current.getNext();
        }

        current.setNext(null);
        this.size--;
    }

    private Node<T> getLastNode (){
        Node<T> current = this.head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }
}
