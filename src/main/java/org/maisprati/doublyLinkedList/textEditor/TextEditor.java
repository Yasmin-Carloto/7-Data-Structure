package org.maisprati.doublyLinkedList.textEditor;

import org.maisprati.doublyLinkedList.DoublyLinkedList;
import org.maisprati.doublyLinkedList.Node;
import org.maisprati.singlyLinkedList.versionControlSystem.Undo;

import java.util.Objects;

public class TextEditor {
    DoublyLinkedList<Text> textEditor;
    private Node<Text> currentUndo;

    public TextEditor() {
        this.textEditor = new DoublyLinkedList<Text>();
        this.currentUndo = null;
    }

    public void addText(String text){
        Text newText = new Text(text);
        textEditor.add(newText);
    }

    public void undoLastModification(){
        this.currentUndo = textEditor.getLastNode();
        textEditor.removeLast();
    }

    public void redoLastModification(){
        if(currentUndo != null){
            textEditor.add(currentUndo.getData());
            currentUndo = null;
        }else{
            System.out.println("Nenhuma modificação foi feita neste arquivo.");
        }
    }

    public void breakLine() throws Exception {
        if(textEditor.getSize() == 0){
            throw new Exception("Must have a text added");
        }

        Text breakLine = new Text(" ");
        textEditor.add(breakLine);
    }

    public void systemOutPrint(){
        System.out.println("- SEU TEXTO É ESSE -");

        if(textEditor.getSize() == 0){
            System.out.println("Você não escreveu nada ainda.");
        }

        for(int text = 0; text < textEditor.getSize(); text++){
            Node<Text> currentNode = textEditor.getById(text);
            if(currentNode == null || currentNode.getData() == null){
                continue;
            }

            if(Objects.equals(currentNode.getData().getText(), " ")){
                System.out.println();
            }else{
                System.out.print(currentNode.getData().getText() + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
    }
}
