import java.util.Scanner;
public class UtsRidho5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan bilangan genap/ganjil : ");

        int bilangan = s.nextInt();
        if(bilangan %2 == 1){
            System.out.println("bilangan ganjil");
        } else {
            System.out.println("bilangan genap");
        }
    }
}