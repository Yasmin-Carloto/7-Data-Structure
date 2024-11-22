package org.maisprati.queue.printManager;

public class Print {
    private int position;
    private String paperToPrint;

    public Print(String paperToPrint, int position){
        this.paperToPrint = paperToPrint;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPaperToPrint() {
        return paperToPrint;
    }

    public void setPaperToPrint(String paperToPrint) {
        this.paperToPrint = paperToPrint;
    }
}
