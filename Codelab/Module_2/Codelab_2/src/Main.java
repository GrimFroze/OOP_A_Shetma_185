public class Main { // declares a public class named Main
    public static void main(String[] args) throws Exception { // This is the main method which serves as the entry point
                                                              // for the program. The throws Exception part indicates
                                                              // that this method might throw an exception.
        double amount; // declares a variable of type double named amount.

        BankAccount BankAccount1 = new BankAccount(); // creates instances of the BankAccount class named BankAccount1.
        BankAccount BankAccount2 = new BankAccount(); // creates instances of the BankAccount class named BankAccount2.

        BankAccount1.accountNumber = "2024110370110185"; // sets the accountNumber property of BankAccount1 to
                                                         // "2024110370110185".
        BankAccount1.Name = "Shetma Ikmal Zakka"; // sets the Name property of BankAccount1 to "Shetma Ikmal Zakka".
        BankAccount1.balance = 500000; // sets the balance property of BankAccount1 to 500000.

        BankAccount2.accountNumber = "202410370110337"; // sets the accountNumber property of BankAccount2 to
                                                        // "202410370110337".
        BankAccount2.Name = "Budi Anantha Trikurnia Irawan"; // sets the Name property of BankAccount2 to "Budi Anantha
                                                             // Trikurnia Irawan".
        BankAccount2.balance = 1000000; // sets the balance property of BankAccount2 to 1000000.

        BankAccount1.displayInfo(); // Calls the displayInfo method on BankAccount1 to display its information.
        BankAccount2.displayInfo(); // Calls the displayInfo method on BankAccount2 to display its information.

        BankAccount1.depositMoney(amount = 200000); // Calls the depositMoney method on BankAccount1 with the amount
                                                    // parameter set to 200000.
        BankAccount2.depositMoney(amount = 500000); // Calls the depositMoney method on BankAccount2 with the amount
                                                    // parameter set to 500000.

        BankAccount1.withdrawMoney(amount = 800000); // Calls the withdrawMoney method on BankAccount1 with the amount
                                                     // parameter set to 800000.
        BankAccount2.withdrawMoney(amount = 300000); // Calls the withdrawMoney method on BankAccount2 with the amount
                                                     // parameter set to 300000.

        BankAccount1.displayInfo(); // Calls the displayInfo method on BankAccount1 to display its information.
        BankAccount2.displayInfo(); // Calls the displayInfo method on BankAccount2 to display its information.
    }
}
