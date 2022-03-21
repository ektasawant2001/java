import java.util.*;

public class swap_String{
	public static void main(String args[]){
		String s1,s2,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String: ");
		s1 = sc.nextLine();
		
		System.out.println("Enter second String: ");
		s2 = sc.nextLine();
		
		System.out.println("\nBrfore swapping strings\ns1 = "+s1+"\ns2 = "+s2);
		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("\nAfter swapping strings\ns1 = "+s1+"\ns2 = "+s2);
		
	}
}