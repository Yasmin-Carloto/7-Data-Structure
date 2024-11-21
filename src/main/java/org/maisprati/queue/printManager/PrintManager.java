package org.maisprati.queue.printManager;

import org.maisprati.queue.Node;
import org.maisprati.queue.Queue;
import org.maisprati.queue.customerServiceSimulator.Customer;


public class PrintManager {
    Queue<Print> printQueue;
    Node<Print> processingPrint;

    public PrintManager(){
        this.printQueue = new Queue<Print>();
        this.processingPrint = null;
    }

    public void add(String paperToPrint){
        int currentIndex = 0;

        if(this.printQueue.getLast() != null){
            currentIndex = this.printQueue.getLast().getData().getPosition();
        }

        Print newPrint = new Print(paperToPrint, currentIndex + 1);
        this.printQueue.enqueue(newPrint);
    }

    public void processPrint(){
        processingPrint = this.printQueue.dequeue();

        if(this.printQueue.getFirst() == null){
            System.out.println("Não há nenhuma impressão na fila.");
            return;
        }

        System.out.println("Processando... " + processingPrint.getData().getPaperToPrint());
    }

    public void systemOutPrint(){
        System.out.println("- FILA DE IMPRESSÕES -");

        if(this.printQueue.getSize() == 0){
            System.out.println("Você não possui impressões na fila.");
        }

        for(int currentIndex = 0; currentIndex < this.printQueue.getSize(); currentIndex++){
            Node<Print> currentPrint = this.printQueue.getById(currentIndex);

            if(currentPrint == null){
                return;
            }

            System.out.println("Na posição " + currentPrint.getData().getPosition() + ": papel " + currentPrint.getData().getPaperToPrint());
        }
    }
}
