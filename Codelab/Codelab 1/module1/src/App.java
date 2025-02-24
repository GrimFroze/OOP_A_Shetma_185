import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String name;
        char gender;
        int year;

        System.out.println("Masukkan nama :");
        name = input.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        gender = input.next().charAt(0);
        System.out.println("Masukkan umur :");
        year = input.nextInt();

        System.out.println("Nama : " + name);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Tahun Kelahiran : " + year);

    }
}
