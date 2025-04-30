package com.module_2;

import java.util.Scanner;

public class LoginSystem {

    public static String ANSI_GREEN = "\u001B[32m", ANSI_RED = "\u001B[31m", ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin();
        Student student = new Student();

        admin.AdminName = "Admin185";
        admin.AdminPass = "Password185";

        student.Username = "Shetma Ikmal Zakka";
        student.NIM = "202410370110185";

        int choice;
        char Choose;

        System.out.println("=====================");
        System.out.println("======= Login =======");
        System.out.println("=====================");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("=====================");
        System.out.print("Pilih (1/2): ");
        choice = input.nextInt();
        System.out.println("");

        switch (choice) {
            case 1:
                do {
                    System.out.println("=====================");
                    System.out.println("======= ADMIN =======");
                    System.out.println("=====================");
                    System.out.print("Masukkan Username: ");
                    admin.InputUserAdmin = input.next();
                    System.out.print("Masukkan Password: ");
                    admin.InputPassAdmin = input.next();
                    System.out.println("");

                    admin.AdminLogin(admin.InputUserAdmin, admin.InputPassAdmin);

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                    System.out.println("");
                } while (Choose == 'y' || Choose == 'Y');

                break;
            case 2:
                do {
                    System.out.println("=====================");
                    System.out.println("===== MAHASISWA ====");
                    System.out.println("=====================");
                    System.out.print("Masukkan Nama: ");
                    student.InputUserName = input.next() + input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    student.InputNIM = input.next();
                    System.out.println("");

                    student.StudentLogin(student.InputUserName, student.InputNIM);

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                    System.out.println("");
                } while (Choose == 'y' || Choose == 'Y');

                break;
            default:
                System.out.println(ANSI_RED + "Pilihan tidak valid!" + ANSI_RESET);
                break;
        }
    }
}
