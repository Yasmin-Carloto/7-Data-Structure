package org.maisprati.queue.customerServiceSimulator;

import org.maisprati.queue.Node;
import org.maisprati.queue.Queue;

public class CustomerServiceSimulator {
    Queue<Customer> customerQueue;

    public CustomerServiceSimulator(){
        this.customerQueue = new Queue<Customer>();
    }

    public void add(String name){
        int currentIndex = 0;

        if(this.customerQueue.getLast() != null){
            currentIndex = this.customerQueue.getLast().getData().getPosition();
        }

        Customer newCustomer = new Customer(name, currentIndex + 1);
        customerQueue.enqueue(newCustomer);
    }

    public void serveCustomer(){
        customerQueue.dequeue();

        if(this.customerQueue.getFirst() == null){
            System.out.println("Fila está vazia!");
            return;
        }

        System.out.println("Próximo:");
        System.out.println(this.customerQueue.getFirst().getData().getName() + " na posição " + this.customerQueue.getFirst().getData().getPosition());
    }

    public void systemOuPrint(){
        System.out.println("- FILA DE ATENDIMENTO -");

        if(this.customerQueue.getSize() == 0 || this.customerQueue.getFirst() == null){
            System.out.println("Fila está vazia!");
        }

        for(int customerIndex = 0; customerIndex <= this.customerQueue.getSize() - 1; customerIndex++){
            Node<Customer> currentCustomer = this.customerQueue.getById(customerIndex);
            if(currentCustomer == null){
                return;
            }
            System.out.println("Na posição " + currentCustomer.getData().getPosition() + " " + currentCustomer.getData().getName());
        }
    }
}
