package org.maisprati.singlyLinkedList.browsingHistory;

import org.maisprati.singlyLinkedList.SinglyLinkedList;

import java.net.MalformedURLException;

public class BrowsingHistory {
    private SinglyLinkedList<URL> browsingHistory;

    public BrowsingHistory() {
        this.browsingHistory = new SinglyLinkedList<URL>();
    }

    public void addURLToBrowsingHistory(String url) throws MalformedURLException {
        URL newURL = new URL(url);
        if(browsingHistory.getSize() >= 10){
            browsingHistory.removeById(0);
        }

        this.browsingHistory.add(newURL);
    }

    public void removeFromBrowsingHistory(int index){
        if(index > this.browsingHistory.getSize() - 1 || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        this.browsingHistory.removeById(index);
    }

    public void systemOutPrint() {
        System.out.println("- SEU HISTÓRICO DE NAVEGAÇÃO -");

        if(this.browsingHistory.getSize() == 0){
            System.out.println("Você ainda não possui um histórico de navegação.");
        }

        for(int url = 0; url < this.browsingHistory.getSize(); url++){
            System.out.print("Site " + (url + 1) + ": ");
            System.out.println(this.browsingHistory.getById(url).getWebLocation());
        }

        System.out.println("-----------------------------------------------------------------");
    }
}
