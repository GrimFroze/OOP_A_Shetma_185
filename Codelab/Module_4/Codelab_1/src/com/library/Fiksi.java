package com.library;

public class Fiksi extends Buku {

    public Fiksi(String author, String title) {
        super(author, title);
    }

    @Override
    public void displayInfo() {
        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "Fiction Book:" + ANSI_RESET);
        System.out.println("=============================");
        System.out.println("Author : " + ANSI_GREEN + FRT_ITALICString + author + FRT_RESET + ANSI_RESET);
        System.out.println("Title : " + ANSI_GREEN + FRT_ITALICString + title + FRT_RESET + ANSI_RESET);
        System.out.println("");
    }

}
