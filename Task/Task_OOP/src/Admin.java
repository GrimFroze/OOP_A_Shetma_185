public class Admin {
    String AdminName, AdminPass;

    String InputUserAdmin, InputPassAdmin;

    void AdminLogin(String InputUserAdmin, String InputPassAdmin) {
        if (InputUserAdmin.equals(AdminName) && InputPassAdmin.equals(AdminPass)) {
            System.out.println("====================");
            System.out.println(LoginSystem.ANSI_GREEN + "Login Admin Berhasil!" + LoginSystem.ANSI_RESET);
            System.out.println("====================");
            System.exit(0);
        } else {
            System.out.println("====================");
            System.out.println(
                    LoginSystem.ANSI_RED + "Login gagal! Username atau password salah." + LoginSystem.ANSI_RESET);
            System.out.println("====================");
            System.out.println("");
        }
    }
}
