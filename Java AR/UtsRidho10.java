import java.util.*;

class UtsRidho10 {
    public static void main(String args[]) {
		Scanner x = new Scanner(System.in);

        String nama,jurusan;
        
        System.out.print("Masukan Nama Anda: ");
        nama = x.nextLine();
        System.out.print("Masukkan jurusan Anda:");
        jurusan = x.nextLine();

        switch (jurusan){
            case "TIF":
                jurusan =("Teknik Informatika");
                System.out.println(nama + "adalah" + jurusan);
                break;
				
            case "SI":
				jurusan = ("Sistem informasi");
                System.out.println(nama + "adalah" + jurusan);
                break;
				
			case "TE":
                jurusan = ("Teknik Elektro");
                System.out.println(nama + "adalah" + jurusan);
                break;
        }
    }
}