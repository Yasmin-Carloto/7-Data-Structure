package org.maisprati.singlyLinkedList.versionControlSystem;

import org.maisprati.singlyLinkedList.SinglyLinkedList;

import java.util.Objects;

public class UndoManager {
    SinglyLinkedList<Undo> undoManager;

    public UndoManager() {
        this.undoManager = new SinglyLinkedList<Undo>();
    }

    public void addText(String text){
        Undo newText = new Undo(text);
        undoManager.add(newText);
    }

    public void undoLastModification(){
        undoManager.removeLast();
    }

    public void systemOutPrint(){
        System.out.println("- SEU TEXTO É ESSE -");

        if(undoManager.getSize() == 0){
            System.out.println("Você não escreveu nada ainda.");
        }

        for(int text = 0; text < undoManager.getSize(); text++){
            if(Objects.equals(undoManager.getById(text).getText(), " ")){
                System.out.println();
            }else{
                System.out.print(undoManager.getById(text).getText() + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
    }

    public void breakLine() throws Exception {
        if(undoManager.getSize() == 0){
            throw new Exception("Must have a text added");
        }

        Undo breakLineUndo = new Undo(" ");
        undoManager.add(breakLineUndo);
    }
}
