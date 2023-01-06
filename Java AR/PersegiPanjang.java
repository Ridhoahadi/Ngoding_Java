import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        double panjang;
        double lebar;
        double luas;

        System.out.println("Luas persegi panjang");

        System.out.println("Masukkan panjang	: ");
        panjang = baca.nextDouble();

        System.out.println("Masukkan lebar		: ");
        lebar = baca.nextDouble();

        luas = panjang*lebar;

        System.out.println("Luas: "+luas);
    }
}