package com.library;

public class Anggota implements Peminjaman {
    private String name;
    private String memberId;

    public Anggota(String name, String memberId) {
        this.setName(name);
        this.setMemberId(memberId);
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void displayInfo() {
        System.out.println("Member Name : " + ANSI_CYAN + FRT_ITALICString + getName() + FRT_RESET + ANSI_RESET);
        System.out.println("Member ID : " + ANSI_RED + FRT_ITALICString + getMemberId() + FRT_RESET + ANSI_RESET);
    }

    @Override
    public void peminjaman(String Judul) {
        System.out.println(
                FRT_ITALICString + ANSI_CYAN + getName() + ANSI_RESET + " with ID " + FRT_ITALICString + ANSI_RED
                        + getMemberId() + ANSI_RESET + " has borrowed the book : " + ANSI_GREEN + FRT_ITALICString
                        + Judul + FRT_RESET);
    }

    public void peminjaman(String Judul, int durasi) {
        System.out.println(
                FRT_ITALICString + ANSI_CYAN + getName() + ANSI_RESET + " with ID " + FRT_ITALICString + ANSI_RED
                        + getMemberId() + ANSI_RESET + " has borrowed the book : " + ANSI_GREEN + FRT_ITALICString
                        + Judul + FRT_ITALICString + ANSI_RESET
                        + durasi + " days.");
    }

    @Override
    public void pengembalian(String Judul) {
        System.out.println(
                FRT_ITALICString + ANSI_CYAN + getName() + ANSI_RESET + " with ID " + FRT_ITALICString + ANSI_RED
                        + getMemberId() + ANSI_RESET + " has returned the book : " + ANSI_GREEN + FRT_ITALICString
                        + Judul + FRT_ITALICString + ANSI_RESET);
    }
}
