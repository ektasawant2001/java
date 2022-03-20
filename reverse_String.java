import java.util.Scanner;

public class reverse_String{
	public static void main(String[] args){
		String s,reverse ="";
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		s = sc.nextLine();
		 
		 int l = s.length();
		 
		for(i=(l-1);i>=0;i--){
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse string is: "+reverse);
	}
}