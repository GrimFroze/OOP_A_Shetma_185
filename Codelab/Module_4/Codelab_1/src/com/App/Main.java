package com.App;

import com.library.Anggota;
import com.library.Buku;
import com.library.Fiksi;
import com.library.NonFiksi;

public class Main {
    public static void main(String[] args) throws Exception {
        Buku fiksiBook = new Fiksi("J.K. Rowling", "Harry Potter");
        Buku nonFiksiBook = new NonFiksi("Stephen Hawking", "A Brief History of Time");
        Anggota member = new Anggota("Shetma Ikmal Zakka", "A185");
        Anggota member2 = new Anggota("Budi Anantha Trikurnia Irawan", "A337");

        String ANSI_RESET = "\u001B[0m", ANSI_YELLOW = "\u001B[33m", ANSI_RED = "\u001B[31m",
                ANSI_GREEN = "\u001B[32m", ANSI_CYAN = "\u001B[36m";

        String FRT_ITALICString = "\033[3m", FRT_RESET = "\033[0m";

        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "List of Books:" + ANSI_RESET);
        System.out.println("=============================");
        fiksiBook.displayInfo();
        nonFiksiBook.displayInfo();

        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "List of Members:" + ANSI_RESET);
        System.out.println("============================");
        member.displayInfo();
        member2.displayInfo();
        System.out.println("");

        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "Borrowing Books Log:" + ANSI_RESET);
        System.out.println("=============================");
        member.peminjaman(fiksiBook.title);
        member.peminjaman(fiksiBook.title, 7);
        member2.peminjaman(nonFiksiBook.title);
        member2.peminjaman(nonFiksiBook.title, 14);
        System.out.println("");

        System.out.println("=============================");
        System.out.println(ANSI_YELLOW + "Returning Books Log:" + ANSI_RESET);
        System.out.println("=============================");
        member.pengembalian(fiksiBook.title);
        member2.pengembalian(nonFiksiBook.title);
    }
}