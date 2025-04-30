package com.module_3;

public class User {
    private String name, NIM;

    private String InputUsername, InputPass;

    public static String ANSI_RESET = "\u001B[0m", ANSI_YELLOW = "\u001B[33m", ANSI_RED = "\u001B[31m",
            ANSI_GREEN = "\u001B[32m";
    public static String FRT_ITALICString = "\033[3m", FRT_RESET = "\033[0m";

    public User(String name, String NIM, String InputUsername, String InputPass) {
        this.setName(name);
        this.setNIM(NIM);
        this.setInputUsername(InputUsername);
        this.setInputPass(InputPass);
    }

    public String getName() {
        return name;
    }

    public String getNIM() {
        return NIM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setInputUsername(String InputUsername) {
        this.InputUsername = InputUsername;
    }

    public void setInputPass(String InputPass) {
        this.InputPass = InputPass;
    }

    public String getInputUsername() {
        return InputUsername;
    }

    public String getInputPass() {
        return InputPass;
    }

    public void login() {
    }

    public String displayInfo() {
        return "Nama: " + getName() + "\n" + "NIM: " + getNIM() + "\n";
    }

    public String displayError() {
        return "====================\n"
                + ANSI_RED + FRT_ITALICString + "Login Gagal! Username atau password salah\n" + FRT_RESET + ANSI_RESET
                + "====================";
    }
}
