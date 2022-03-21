import java.util.*;

public class concat_String{
	public static void main(String args[]){
		String s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String: ");
		s1 = sc.nextLine();
		
		System.out.println("Enter second String: ");
		s2 = sc.nextLine();
		
		System.out.println("Concating 2 nd string into 1st");
		
		s3 = s1.concat(s2);
		
		System.out.println("String 1 after concatination: "+s3);
		
	}
}
		