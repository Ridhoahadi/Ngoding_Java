import java.util.Scanner;
class UtsRidho3 {
        public static void main(String[] args){
            Scanner data= new Scanner(System.in);
            int a,b,c;

            System.out.println("Masukkan berapa nilai a");
            a= data.nextInt();
            System.out.println("Masukkan berapa nilai b");
            b= data.nextInt();
            System.out.println("Masukkan berapa nilai c");
            c= data.nextInt();

            if (c > 65){
                if(a > b){
                    System.out.println("satu");
                }
                else {
                    System.out.println("dua");
                }

            if (c < 65){
                if (a < b){
                    System.out.println("tiga");
                }else {
                    System.out.println("empat");
                }
            }
        }
    }
}