package com.module_4.com.main;

import com.module_4.com.users.admin;
import com.module_4.com.users.mahasiswa;
import com.module_4.com.users.user;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        user admin = new admin("Shetma Ikmal Zakka", "202410370110185", "", "", "Admin185", "Password185");
        user student = new mahasiswa("Shetma Ikmal Zakka", "202410370110185", "", "");

        Scanner input = new Scanner(System.in);

        int choice;
        char Choose;

        System.out.println("============================");
        System.out.println("=======" + user.FRT_ITALICString + " Login System " + user.FRT_RESET + "=======");
        System.out.println("============================");
        System.out.println("1.||" + user.ANSI_YELLOW + " Admin" + user.ANSI_RESET);
        System.out.println("2.||" + user.ANSI_YELLOW + " Mahasiswa" + user.ANSI_RESET);
        System.out.println("============================");
        System.out.print("Choose (1/2): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                do {
                    System.out.println("=====================");
                    System.out.println("=======" + user.FRT_ITALICString + " ADMIN " + user.FRT_RESET + "=======");
                    System.out.println("=====================");
                    System.out.print("Masukkan Username: ");
                    admin.setInputUsername(input.next());
                    System.out.print("Masukkan Password: ");
                    admin.setInputPass(input.next());

                    admin.login();

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                    System.out.println("");
                } while (Choose == 'y' || Choose == 'Y');

                break;

            case 2:
                do {
                    System.out.println("=====================");
                    System.out.println("=====" + user.FRT_ITALICString + " MAHASISWA " + user.FRT_RESET + "====");
                    System.out.println("=====================");
                    System.out.print("Masukkan Nama: ");
                    student.setInputUsername(input.next() + input.nextLine());
                    System.out.print("Masukkan NIM: ");
                    student.setInputPass(input.next());

                    student.login();

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                    System.out.println("");
                } while (Choose == 'y' || Choose == 'Y');

                break;

            default:
                System.out.println(user.ANSI_RED + "Pilihan tidak valid!" + user.ANSI_RESET);
                break;
        }
    }
}
