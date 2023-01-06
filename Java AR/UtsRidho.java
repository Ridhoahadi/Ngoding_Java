public class UtsRidho {
	public static void main(String[] args) {

	int i = 2;
	boolean x = false;

	if(i > 3 || i-- < 4){
		System.out.print("A" + i);
	}else{
		System.out.print("A" + i);
	}
	if (!x && ++i > 4){
		System.out.print("B" + i);
	}else{
		System.out.print("B" + i);
	}
	System.out.print("C"+ i);
	}
}