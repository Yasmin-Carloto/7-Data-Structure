package org.maisprati.singlyLinkedList.taskManager;

public class Task {
    private String title;
    private Boolean concluded;

    public Task(String title){
        this.title = title;
        this.concluded = false;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getConcluded() {
        return concluded;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setConcluded(Boolean concluded) {
        this.concluded = concluded;
    }
}
