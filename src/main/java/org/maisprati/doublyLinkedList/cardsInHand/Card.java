package org.maisprati.doublyLinkedList.cardsInHand;

public class Card {
    private int number;

    private String color;

    public Card(int number, String color){
        this.number = number;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
