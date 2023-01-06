public class UtsRidho7 {
    public static void main(String[] args) {
        int tahun;
        
       tahun = (2020-1800)/4;
        System.out.println("Banyak tahun kabisat dari tahun 1800-2020 adalah " +tahun);
        
        for (int i = 1800; i < 2020; i++) {
            if (i % 4 == 0)
               System.out.print(i+" ");
        }   
    }    
}