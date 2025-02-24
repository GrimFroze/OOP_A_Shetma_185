import java.time.LocalDate; //This is For Imports the LocalDate class for date-related operations
import java.util.Scanner; //This is for Imports the Scanner class for user input

public class App { // Defines a public class named App
    public static void main(String[] args) throws Exception { // The main method where the program execution begins

        Scanner input = new Scanner(System.in); // Creates a Scanner object to read user input
        String name; // Declare String Variable To store Name
        String gender; // Declare String Variable To store Gender
        int year; // Declare String Variable To store birth year

        System.out.println("Masukkan nama :"); // Prompts the user to enter their name
        name = input.next(); // to Reads the user's name input on string
        System.out.println("Masukkan Jenis Kelamin : "); // Prompts the user to enter their Gender
        gender = input.next().toLowerCase(); // to Reads the user's gender input on string and converts it in to
                                             // lowercase

        switch (gender) { // Starts a switch statement based on the gender input
            case "l": // if the input is "l", sets gender to "Laki - Laki" (Male)

                gender = "Laki - Laki"; // rewrite the gender variable value to "Laki - Laki" (Male)

                break; // This will stop the execution of more code and case testing inside the block
            case "p": // If the input is "p", sets gender to "Perempuan" (Female)

                gender = "Perempuan"; // rewrite the gender variable value to "Perempuan" (Female)

                break;// This will stop the execution of more code and case testing inside the block
            default:
                throw new AssertionError("Sorry Your Gender Is Not Valid"); // Throws an error message if the input is
                                                                            // neither "l" nor "p".
        }

        System.out.println("Masukkan tahun lahir :");// Prompts the user to enter Birth Year
        year = input.nextInt(); // to Reads the user's birth year input on integer

        year = LocalDate.now().getYear() - year;// To Calculates the user's age by subtracting the birth year from the
                                                // current year

        System.out.println("Nama : " + name); // Prints the user's name
        System.out.println("Jenis Kelamin : " + gender); // Prints the user's gender that has been rewrited
        System.out.println("Umur : " + year); // Prints the user's age

    }
}
