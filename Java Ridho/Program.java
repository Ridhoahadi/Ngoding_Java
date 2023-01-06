public class Program{
	public static void main(String[] args){
		
		int result = 0;
		for(int i = 0;i<5;i++){
			if(i == 5){
				result += 10;
			}else{
				result += i;
			}
		}
		
		System.out.println(result);
	}
}