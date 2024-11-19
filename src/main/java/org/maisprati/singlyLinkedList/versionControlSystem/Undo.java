package org.maisprati.singlyLinkedList.versionControlSystem;

public class Undo {
    private String text;

    public Undo(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
