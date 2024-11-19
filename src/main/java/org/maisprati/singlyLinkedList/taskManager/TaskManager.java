package org.maisprati.singlyLinkedList.taskManager;

import org.maisprati.singlyLinkedList.SinglyLinkedList;

public class TaskManager {
    private SinglyLinkedList<Task> taskManager;

    public TaskManager(){
        this.taskManager = new SinglyLinkedList<Task>();
    }

    public void addTaskToList(String title){
        Task newTask = new Task(title);
        this.taskManager.add(newTask);
    }

    public void removeTaskFromList(int taskIndex){
        if(taskIndex > this.taskManager.getSize() - 1){
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        this.taskManager.removeById(taskIndex);
    }

    public void setTaskComplete(int taskIndex){
        if(taskIndex > this.taskManager.getSize() -1 || taskIndex < 0) throw new IndexOutOfBoundsException("Index out of bounds.");

        Task taskToSetConcluded = this.taskManager.getById(taskIndex);
        taskToSetConcluded.setConcluded(true);
    }

    public void systemOutPrint(){
        System.out.println("- SUA LISTA DE TAREFAS -");

        if(this.taskManager.getSize() == 0){
            System.out.println("QUE PENA! Sua lista está vazia.");
            return;
        }

        for(int task = 0; task < taskManager.getSize(); task++){
            System.out.println("TAREFA: " + this.taskManager.getById(task).getTitle());
            String isConcluded = this.taskManager.getById(task).getConcluded() ? "Concluído" : "Não concluído";
            System.out.println("ESTADO DE CONCLUSÃO: " + isConcluded);
        }

        System.out.println("------------------------------------------------------------------");
    }

    // Criar utilização da lista no Main.java
}
