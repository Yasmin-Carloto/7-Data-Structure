package org.maisprati.queue.processQueue;

public class Process {
    private int position;
    private String title;
    private int priority;

    public Process(int position, String title, int priority){
        this.position = position;
        this.title = title;
        this.priority = priority;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
