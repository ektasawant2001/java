import java.util.Scanner;

public class  str_length{
	public static void main(String[] args){
		String str;
		int len;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		str = sc.nextLine();
		len = str.length();
		
		System.out.println("Given String length is: "+len);
	}
}