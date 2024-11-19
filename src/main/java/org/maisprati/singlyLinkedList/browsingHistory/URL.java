package org.maisprati.singlyLinkedList.browsingHistory;

import java.net.MalformedURLException;

public class URL {
    private String webLocation;

    public URL(String url) {
        this.webLocation = url;
    }

    public String getWebLocation() {
        return webLocation;
    }

    public void setWebLocation(String webLocation) {
        this.webLocation = webLocation;
    }
}

