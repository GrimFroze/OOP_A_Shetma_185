package com.module_3;

public class Admin extends User {

    private String Username, Password;

    public Admin(String name, String NIM, String inputUsername, String inputPassword, String Username,
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
    public void login() {
        if (getInputUsername().equals(getUsername()) && getInputPass().equals(getPassword())) {
            System.out.println(displayInfo());
            System.exit(0);
        } else {
            System.out.println(super.displayError());
        }
    }

    @Override
    public String displayInfo() {
        return "====================\n"
                + ANSI_GREEN + FRT_ITALICString + "Login Berhasil!\n" + FRT_RESET + ANSI_RESET
                + "====================\n" + "Wellcome " + ANSI_YELLOW + FRT_ITALICString + getInputUsername() + "!\n"
                + FRT_RESET + ANSI_RESET + "====================\n" + super.displayInfo();
    }
}
