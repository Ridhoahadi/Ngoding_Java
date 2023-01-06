import java.util.*;

class Belanja {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int sabun = 5000;
        int shampo = 7000;
        int sikat = 13000;


        System.out.print("Nama kasir        : ");
        String nama = input.nextLine();
        System.out.print("Jumlah sabun      : ");
        int jum_sab = input.nextInt();
        System.out.print("Jumlah shampo     : ");
        int jum_sham = input.nextInt();
        System.out.print("Jumlah sikat gigi : ");
        int jum_sg = input.nextInt();
		

        sabun  = jum_sab * sabun;
        shampo = jum_sham * shampo;
        sikat = jum_sg * sikat;
		
        int total = sabun + shampo + sikat;
		System.out.println("-------------------------------");
		
        System.out.println("Nama Kasir        : " +nama);

        System.out.println("Jumlah sabun      : "+jum_sab);

        System.out.println("Jumlah shampo     : "+jum_sham);

        System.out.println("Jumlah sikat      : "+jum_sg);

        System.out.println("Total belanja     : Rp."+total);
		System.out.println("-------------------------------");
		

    }
}