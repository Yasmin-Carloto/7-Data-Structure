package org.maisprati.queue.processQueue;

import org.maisprati.queue.Node;
import org.maisprati.queue.Queue;

public class ProcessQueue {
    Queue<Process> processQueue;

    public ProcessQueue(){
        this.processQueue = new Queue<Process>();
    }

    public void add(String processTitle, int priority){
        int currentIndex = 0;

        if(this.processQueue.getLast() != null){
            currentIndex = this.processQueue.getLast().getData().getPosition();
        }

        if(priority < 1 || priority > 3){
            throw new IllegalStateException("Priority can be only in the range from 0 to 3");
        }

        Process newProcess = new Process(currentIndex + 1, processTitle, priority);
        this.processQueue.enqueue(newProcess);
    }

    public void executeProcess(){
        this.processQueue.dequeue();

        if(this.processQueue.getFirst() == null){
            System.out.println("Fila está vazia!");
        }

        System.out.println("Próximo processo:");
        System.out.println(this.processQueue.getFirst().getData().getTitle() + " na posição " + this.processQueue.getFirst().getData().getPosition() + " com prioridade " + this.processQueue.getFirst().getData().getPriority());
    }

    public void systemOutPrint(){
        System.out.println("- FILA DE PROCESSOS -");

        if(this.processQueue.getSize() == 0 || this.processQueue.getFirst() == null){
            System.out.println("Fila está vazia!");
        }

        for(int processIndex = 0; processIndex < this.processQueue.getSize(); processIndex++){
            Node<Process> currentProcess = this.processQueue.getById(processIndex);

            if(currentProcess == null){
                return;
            }

            System.out.println(currentProcess.getData().getTitle()+ " na posição " + currentProcess.getData().getPosition() + " com prioridade " + currentProcess.getData().getPriority());
        }
    }
}
