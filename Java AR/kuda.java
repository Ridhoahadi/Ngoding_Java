import java.util.*;

class kuda {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

        String nama, jabatan;
        int jamKerja;
        long Gaji;
        
        System.out.print("Masukan Nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan Jabatan Anda:");
        jabatan = input.nextLine();
        System.out.print("Masukkan Jam Kerja Anda: ");
        jamKerja = input.nextInt();

        switch (jabatan){
            case "SF":
                Gaji = jamKerja * 30500;
                System.out.println(nama);
                System.out.println(" Gaji dari"+jabatan+" adalah Rp"+Gaji);
                break;
            case "MG":
                Gaji = jamKerja * 30500;
				System.out.println(nama);
                System.out.println("Gaji dari "+jabatan+" adalah Rp"+Gaji);
                break;
            default:
                System.out.println("Gaji = 0");
        }
    }
}