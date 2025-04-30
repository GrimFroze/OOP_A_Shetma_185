package com.library;

public interface Peminjaman {
    String ANSI_RESET = "\u001B[0m", ANSI_YELLOW = "\u001B[33m", ANSI_RED = "\u001B[31m",
            ANSI_GREEN = "\u001B[32m", ANSI_CYAN = "\u001B[36m";

    String FRT_ITALICString = "\033[3m", FRT_RESET = "\033[0m";

    public void peminjaman(String judul);

    public void pengembalian(String judul);
}
