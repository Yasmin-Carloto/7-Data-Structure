package org.maisprati;

import org.maisprati.singlyLinkedList.browsingHistory.BrowsingHistory;
import org.maisprati.singlyLinkedList.taskManager.TaskManager;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        singlyLinkedListTaskManager();
        singlyLinkedListBrowsingHistory();
    }

    public static void singlyLinkedListTaskManager(){
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

    public static void singlyLinkedListBrowsingHistory() throws MalformedURLException {
        BrowsingHistory myBrowsingHistory = new BrowsingHistory();
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Frontend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Educational-Chatbot");

        myBrowsingHistory.systemOutPrint();
        myBrowsingHistory.removeFromBrowsingHistory(3);

        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Frontend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Educational-Chatbot");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");

        myBrowsingHistory.systemOutPrint();
    }

    public static void dublyLinkedList(){

    }
}