package com.module_3;

public class Student extends User {

    public Student(String name, String NIM, String InputUsername, String InputPass) {
        super(name, NIM, InputUsername, InputPass);
    }

    @Override
    public void login() {
        if (getInputUsername().equals(getName()) && getInputPass().equals(getNIM())) {
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
                + "====================\n" + FRT_ITALICString + "Show Data : \n" + FRT_RESET
                + "====================\n" + super.displayInfo();
    }
}
