package com.library;

public abstract class Buku {
    String author;
    public String title;

    String ANSI_RESET = "\u001B[0m", ANSI_YELLOW = "\u001B[33m", ANSI_RED = "\u001B[31m",
            ANSI_GREEN = "\u001B[32m", ANSI_CYAN = "\u001B[36m";

    String FRT_ITALICString = "\033[3m", FRT_RESET = "\033[0m";

    public Buku(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public abstract void displayInfo();
}
