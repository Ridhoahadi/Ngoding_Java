public class MemasakAir {
    public static void main(String[] args) {
        Air x = Air.getMentah();
        while( x.suhu < 100 ) {
            Air.panaskan(x);
        }
        System.out.println(x);
    }
}