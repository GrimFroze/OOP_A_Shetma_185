package com.library;

public class NonFiksi extends Buku {

    public NonFiksi(String author, String title) {
        super(author, title);
    }

    @Override
    public void displayInfo() {
        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "Non-Fiction Book:" + ANSI_RESET);
        System.out.println("=============================");
        System.out.println("Author : " + ANSI_GREEN + FRT_ITALICString + author + FRT_RESET + ANSI_RESET);
        System.out.println("Title : " + ANSI_GREEN + FRT_ITALICString + title + FRT_RESET + ANSI_RESET);
        System.out.println("");
    }

}
