package com.module_4.com.users;

import com.module_4.com.actions.MahasiswaAction;
import java.util.Scanner;

public class mahasiswa extends user implements MahasiswaAction {

    public mahasiswa(String name, String NIM, String InputUsername, String InputPass) {
        super(name, NIM, InputUsername, InputPass);
    }

    @Override
    public void reportIitems() {
        Scanner input = new Scanner(System.in);
        String Name, Desc, LastSeen;

        System.out.println("===================================");
        System.out.println("=========== " + FRT_ITALICString + "Report Items " + FRT_RESET + "===========");
        System.out.println("===================================");
        System.out.print("Please enter the name of the item: ");
        Name = input.nextLine();
        System.out.print("Please enter the description of the item: ");
        Desc = input.nextLine();
        System.out.print("Please enter the last seen location of the item: ");
        LastSeen = input.nextLine();
        System.out.println("===================================");
        System.out.println(ANSI_GREEN + "Thank you for your report!" + ANSI_RESET);
        System.out.println("===================================");
        System.out.println("");
    }

    @Override
    public void viewedReportItems() {
        System.out.println("");
        System.out.println(
                FRT_ITALICString + ANSI_RED + ">> Fitur Lihat Laporan Belum Tersedia <<" + ANSI_RESET + FRT_RESET);
        System.out.println("");
    }

    @Override
    void DisplayMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        char confirm;

        do {
            System.out.println("=====================");
            System.out.println("========" + FRT_ITALICString + " Menu " + FRT_RESET + "=======");
            System.out.println("=====================");
            System.out.println("1. " + ANSI_YELLOW + "Report Item" + ANSI_RESET);
            System.out.println("2. " + ANSI_YELLOW + "View Report Items" + ANSI_RESET);
            System.out.println("3. " + ANSI_YELLOW + "Logout" + ANSI_RESET);
            System.out.println("=====================");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    reportIitems();
                    break;
                case 2:
                    viewedReportItems();
                    break;
                case 3:
                    System.out.println("Are you sure you want to logout? (y/n)");
                    confirm = input.next().charAt(0);
                    if (confirm == 'y' || confirm == 'Y') {
                        System.out.println(FRT_ITALICString + ANSI_RED + "Logging out..." + ANSI_RESET + FRT_RESET);
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid choice. Please try again." + ANSI_RESET);
                    break;
            }
        } while (true);
    }

    @Override
    public void login() {
        if (getInputUsername().equals(getName()) && getInputPass().equals(getNIM())) {
            System.out.println(displayInfo());
            System.out.println("Welcome " + getName() + "!");
            DisplayMenu();
        } else {
            System.out.println(displayError());
        }
    }

    @Override
    public String displayInfo() {
        return "====================\n"
                + ANSI_GREEN + FRT_ITALICString + "Login Berhasil!\n" + FRT_RESET + ANSI_RESET
                + "====================\n" + FRT_ITALICString + "Show Data : \n" + FRT_RESET
                + "====================\n" + "Nama: " + getName() + "\n" + "NIM: " + getNIM() + "\n";
    }

    @Override
    public String displayError() {
        return "====================\n"
                + ANSI_RED + FRT_ITALICString + "Login Gagal!\n" + FRT_RESET + ANSI_RESET
                + "====================\n" + "Username atau Password Salah!\n"
                + "====================\n";
    }

}
