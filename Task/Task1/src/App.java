import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice;

        String AdminUser = "Admin185", Adminpass = "Password185";
        String InputUserAdmin, InputPassAdmin;

        String name = "Shetma Ikmal Zakka", NIM = "202410370110185";
        String InputName, InputNIM;

        char Choose;

        System.out.println("=====================");
        System.out.println("======= Login =======");
        System.out.println("=====================");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("=====================");
        System.out.print("Pilih (1/2): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                do {
                    System.out.println("======= ADMIN =======");
                    System.out.print("Masukkan Username: ");
                    InputUserAdmin = input.next();
                    System.out.print("Masukkan Password: ");
                    InputPassAdmin = input.next();
                    System.out.println("=====================");

                    if (InputUserAdmin.equals(AdminUser) && InputPassAdmin.equals(Adminpass)) {
                        System.out.println("Login Admin Berhasil!");
                        break;
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                } while (Choose == 'y' || Choose == 'Y');

                break;
            case 2:
                do {
                    System.out.println("===== MAHASISWA ====");
                    System.out.print("Masukkan Nama: ");
                    InputName = input.next();
                    System.out.print("Masukkan NIM: ");
                    InputNIM = input.next();
                    System.out.println("=====================");

                    if (InputName.equals(name) && InputNIM.equals(NIM)) {
                        System.out.println("Login Mahasiswa berhasil!");
                        System.out.println("===== WELLCOME =====");
                        System.err.println("Nama : " + name);
                        System.err.println("NIM : " + NIM);
                        System.out.println("====================");
                        break;
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }

                    System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                    Choose = input.next().charAt(0);
                } while (Choose == 'y' || Choose == 'Y');
                ;

                break;

            default:
                System.out.println("Pilihan Tidak Valid!");
        }
    }
}
