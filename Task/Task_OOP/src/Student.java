
public class Student {
    String Username, NIM;

    String InputUserName, InputNIM;

    void StudentLogin(String InputUserName, String InputNIM) {
        if (InputUserName.equals(Username) && InputNIM.equals(NIM)) {
            System.out.println("====================");
            System.out.println(LoginSystem.ANSI_GREEN + "Login Mahasiswa berhasil!" + LoginSystem.ANSI_RESET);
            System.out.println("====================");
            System.out.println("");
            displayInfo();
            System.exit(0);
        } else {
            System.out.println("====================");
            System.out.println(LoginSystem.ANSI_RED + "Login gagal! Nama atau NIM salah." + LoginSystem.ANSI_RESET);
            System.out.println("====================");
            System.out.println("");
        }
    }

    void displayInfo() {
        System.out.println("====================");
        System.out.println("===== WELLCOME =====");
        System.out.println("====================");
        System.out.println("Nama : " + Username);
        System.out.println("NIM : " + NIM);
        System.out.println("====================");
    }
}
