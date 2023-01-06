import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        long nim; 
        /*
         * Karena tipe data int tidak bisa membaca nim dengan jumlah 11 maka kita ubah saja ke dalam tipe data long
         */

        int bilangan;

        System.out.print("Masukkan nama = ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM = ");
        nim = input.nextLong();

        System.out.print("Masukkan bilangan = ");
        bilangan = input.nextInt();

        /* 
         * code program  dibuat hanya untuk memenuhi syarat bilangan positif dan negatif
         * apabila sebuah bilangan selain bilangan bulat dimasukkan maka program tidak akan berjalan
         */

        if ( bilangan > 0 ) {
            System.out.println("Bilangan "+bilangan+ " adalah bilangan Positif");

        } else if (bilangan == 0){
            System.out.println("Bilangan "+bilangan+" adalah bilangan Netral");

        } else {
            System.out.println("Bilangan " +bilangan + " adalah bilangan Negatif");
        }
    }
}