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
        }

        size--;
    }

    public void removeLast(){
        Node<T> lastNode = getLastNode();
        if(lastNode == this.head){
            this.head = null;
        }else{
            lastNode.getPrevious().setNext(null);
        }
        size--;
    }

    public Node<T> getLastNode(){
        Node<T> current = this.head;

        while(current != null && current.getNext() != null){
            if(current.getNext() != null){
                current = current.getNext();
            }
        }

        return current;
    }

    public void changingIdPosition(int oldPosition, int positionToBe) throws Exception{
        if(oldPosition > size - 1 || oldPosition < 0 || positionToBe > size - 1 || positionToBe < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> nodeInPositionToBe = this.getById(positionToBe);
        Node<T> nodeInOldPosition = this.getById(oldPosition);

        if(nodeInPositionToBe == nodeInOldPosition){
            return;
        }

        if (nodeInOldPosition.getPrevious() != null) {
            nodeInOldPosition.getPrevious().setNext(nodeInOldPosition.getNext());
        }

        if (nodeInOldPosition.getNext() != null) {
            nodeInOldPosition.getNext().setPrevious(nodeInOldPosition.getPrevious());
        }

        if (nodeInOldPosition == this.head) {
            this.head = nodeInOldPosition.getNext();
            if (this.head != null) {
                this.head.setPrevious(null);
            }
        }

        if (positionToBe == 0) {
            nodeInOldPosition.setNext(this.head);
            if (this.head != null) {
                this.head.setPrevious(nodeInOldPosition);
            }
            this.head = nodeInOldPosition;
        } else {
            Node<T> prevNode = this.getById(positionToBe - 1);
            Node<T> nextNode = prevNode.getNext();

            prevNode.setNext(nodeInOldPosition);
            nodeInOldPosition.setPrevious(prevNode);
            nodeInOldPosition.setNext(nextNode);

            if (nextNode != null) {
                nextNode.setPrevious(nodeInOldPosition);
            }
        }
    }
}
