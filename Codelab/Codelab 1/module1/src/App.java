import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String name;
        String gender;
        int year;

        System.out.println("Masukkan nama :");
        name = input.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        gender = input.next().toLowerCase();

        switch (gender) {
            case "l":

                gender = "Laki - Laki";

                break;
            case "p":

                gender = "Perempuan";

                break;
            default:
                throw new AssertionError();
        }

        System.out.println("Masukkan tahun lahir :");
        year = input.nextInt();

        year = LocalDate.now().getYear() - year;

        System.out.println("Nama : " + name);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Umur : " + year);

    }
}
