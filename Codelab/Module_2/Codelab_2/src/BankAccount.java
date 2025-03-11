public class BankAccount { // declares a public class named BankAccount.

    String accountNumber, Name; // declares two instance variables (fields) of type String named accountNumber
                                // and Name.
    double balance; // declares an instance variable of type double named balance to store the
                    // account balance.

    String ANSI_GREEN = "\u001B[32m"; // declare instance variables for ANSI color (Green) codes to format console
                                      // output.
    String ANSI_RED = "\u001B[31m"; // declare instance variables for ANSI color (Red) codes to format console
                                    // output.
    String ANSI_RESET = "\u001B[0m"; // declare instance variables for ANSI color (Reset) codes to format console
                                     // output.

    void displayInfo() { // This method prints the account information to the console.
        System.out.println("Account Infomation :"); // Prints the string "Account Information :"
        System.out.println("Name :" + Name); // Prints the string "Name :" followed by the value of the Name field.
        System.out.println("Account Number : " + accountNumber); // Prints the string "Account Number :" followed by the
                                                                 // value of the accountNumber field.
        System.out.println("Balance : Rp." + balance); // Prints the string "Balance : Rp." followed by the value of the
                                                       // balance field.
        System.out.println(""); // Prints an empty line.
    }

    double depositMoney(double amount) { // This method takes a double parameter amount and adds it to the balance.
        balance += amount; // Adds the value of the amount parameter to the balance field.

        System.out.println(Name + " Deposited amount of Rp." + amount + " in the account."); // Prints the string "Name
                                                                                             // Deposited amount of Rp."
                                                                                             // followed by the value of
                                                                                             // the amount parameter
                                                                                             // followed by the string
                                                                                             // "in the account."
        System.out.println("Your current balance is : Rp." + balance); // Prints the string "Your current balance is :
                                                                       // Rp." followed by the value of the balance
                                                                       // field.
        System.out.println(""); // Prints an empty line.
        return balance; // Returns the value of the balance field.
    }

    double withdrawMoney(double amount) { // This method takes a double parameter amount and attempts to subtract it
                                          // from the balance.
        System.out.println(Name + " Withdrawing amount of Rp." + amount + " from The account."); // Prints the string
                                                                                                 // "Name Withdrawing
                                                                                                 // amount of Rp."
                                                                                                 // followed by the
                                                                                                 // value of the amount
                                                                                                 // parameter followed
                                                                                                 // by the string "from
                                                                                                 // The account."

        if (amount > balance) { // Checks if the value of the amount parameter is greater than the value of the
                                // balance field.
            System.out.println(ANSI_RED + " (Failed, insufficient balance in your account.)" + ANSI_RESET); // Prints
                                                                                                            // the
                                                                                                            // string "
                                                                                                            // (Failed,
                                                                                                            // insufficient
                                                                                                            // balance
                                                                                                            // in your
                                                                                                            // account.)"
                                                                                                            // in red.
        } else { // If the condition is false, the following block of code is executed
            balance -= amount; // Subtracts the value of the amount parameter from the balance field.
            System.out.println(ANSI_GREEN + " (Success!)" + ANSI_RESET); // Prints the string " (Success!)" in green.
        }

        System.out.println("Your current balance is : Rp." + balance); // Prints the string "Your current balance is :
                                                                       // Rp." followed by the value of the balance
                                                                       // field.
        System.out.println(""); // Prints an empty line.

        return balance;
    }
}
