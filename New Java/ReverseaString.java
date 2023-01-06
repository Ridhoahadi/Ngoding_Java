import java.util.Scanner;

public class ReverseaString
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		String rev = "ridho ahadi ganteng banget";
			for(char i: arr)
			rev = i + rev;
			System.out.println("Siapa tau aja gak error lagi");	
	}
}