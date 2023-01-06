import java.util.Scanner;
public class UtsRidho2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // deklarasi variable
        int x;
        int y;
        int t;

        System.out.println("nilai x: ");
        x = s.nextInt();
        System.out.println("nilai y; ");
        y = s.nextInt();

        //deklarasi proses
        t = x;
        if(y  > x){
            t = y;
        }

        System.out.println("Nilai terbesar: " + t);
    }
}