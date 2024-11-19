package org.maisprati;

import org.maisprati.singlyLinkedList.taskManager.TaskManager;
public class Main {
    public static void main(String[] args) {
        singlyLinkedList();

    }

    public static void singlyLinkedList(){
        TaskManager dailyTaskList = new TaskManager();
        dailyTaskList.addTaskToList("Estudar para prova de Matemática V");
        dailyTaskList.addTaskToList("Finalizar atividade de Java da +PraTi.");
        dailyTaskList.addTaskToList("Arrumar minha cama");
        dailyTaskList.addTaskToList("Estudar pra prova de Matemática III");

        dailyTaskList.setTaskComplete(0);
        dailyTaskList.systemOutPrint();

        dailyTaskList.removeTaskFromList(2);
        dailyTaskList.systemOutPrint();
    }

    public static void dublyLinkedList(){

    }
}