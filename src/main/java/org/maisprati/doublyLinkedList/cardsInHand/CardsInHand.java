package org.maisprati.doublyLinkedList.cardsInHand;

import org.maisprati.doublyLinkedList.DoublyLinkedList;

import java.util.Objects;

public class CardsInHand {
    DoublyLinkedList<Card> cardsInHand;

    public CardsInHand(){
        this.cardsInHand = new DoublyLinkedList<Card>();
    }

    public void addCardToHand(int cardNumber, String cardColor){
        Card newCard = new Card(cardNumber, cardColor);
        this.cardsInHand.add(newCard);
    }

    public void removeCard(int index) throws Exception {
        if(index >= cardsInHand.getSize() || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        this.cardsInHand.removeById(index);
    }

    public void reorganizeCards(int currentCardPosition, int cardPositionToBe) throws Exception {
        if(currentCardPosition >= cardsInHand.getSize() || currentCardPosition < 0 || cardPositionToBe >= cardsInHand.getSize() || cardPositionToBe < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        this.cardsInHand.changingIdPosition(currentCardPosition, cardPositionToBe);
    }

    public void systemOutPrint(){
        System.out.println("- Suas cartas são -");

        if(cardsInHand.getSize() == 0){
            System.out.println("Você não tem cartas em sua mão");
        }

        for(int card = 0; card < cardsInHand.getSize(); card++){
            Card cardData = cardsInHand.getById(card).getData();
            if(cardData != null){
                System.out.println(cardData.getColor() + ": " + cardData.getNumber());
            } else {
                System.out.println(card + " Não encontrado!");
            }
        }
    }
}
