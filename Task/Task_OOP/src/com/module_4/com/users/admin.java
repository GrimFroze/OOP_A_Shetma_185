package com.module_4.com.users;

import com.module_4.com.actions.AdminAction;
import java.util.Scanner;

public class admin extends user implements AdminAction {

    private String Username, Password;

    public admin(String name, String NIM, String inputUsername, String inputPassword, String Username,
            String Password) {
        super(name, NIM, inputUsername, inputPassword);
        this.setUsername(Username);
        this.setPassword(Password);
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public void manageItems() {
        System.err.println("");
        System.out.println(
                FRT_ITALICString + ANSI_RED + ">> Fitur Kelola Barang Belum Tersedia <<" + ANSI_RESET + FRT_RESET);
        System.out.println("");
    }

    @Override
    public void manageUsers() {
        System.out.println("");
        System.out.println(
                FRT_ITALICString + ANSI_RED + ">> Fitur Kelola Mahasiswa Belum Tersedia <<" + ANSI_RESET + FRT_RESET);
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
            System.out.println("1. " + ANSI_YELLOW + "Manage Items" + ANSI_RESET);
            System.out.println("2. " + ANSI_YELLOW + "Manage Users" + ANSI_RESET);
            System.out.println("3. " + ANSI_YELLOW + "Logout" + ANSI_RESET);
            System.out.println("=====================");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
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
        if (getInputUsername().equals(getUsername()) && getInputPass().equals(getPassword())) {
            System.out.println(displayInfo());
            System.out.println("Welcome " + getName() + "!");
            System.out.println("You are logged in as " + getUsername() + ".");
            System.out.println("");
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
