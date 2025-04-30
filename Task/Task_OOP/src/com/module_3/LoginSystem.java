package com.module_3;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) throws Exception {

        Admin admin = new Admin("Shetma Ikmal Zakka", "202410370110185", "", "", "Admin185", "Password185");
        Student student = new Student("Shetma Ikmal Zakka", "202410370110185", "", "");

        Scanner input = new Scanner(System.in);

        int choice;
        char Choose;

        System.out.println("============================");
        System.out.println("=======" + User.FRT_ITALICString + " Login System " + User.FRT_RESET + "=======");
        System.out.println("============================");
        System.out.println("1.||" + User.ANSI_YELLOW + " Admin" + User.ANSI_RESET);
        System.out.println("2.||" + User.ANSI_YELLOW + " Mahasiswa" + User.ANSI_RESET);
        System.out.println("============================");
        System.out.print("Choose (1/2): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                do {
                    System.out.println("=====================");
                    System.out.println("=======" + User.FRT_ITALICString + " ADMIN " + User.FRT_RESET + "=======");
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
                    System.out.println("=====" + User.FRT_ITALICString + " MAHASISWA " + User.FRT_RESET + "====");
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
                System.out.println(User.ANSI_RED + "Pilihan tidak valid!" + User.ANSI_RESET);
                break;
        }
    }
}