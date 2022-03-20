import java.util.Scanner;

public class copy_String{
	public static void main(String[] args){
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		s = sc.nextLine();
		 
		 StringBuffer strCopy = new StringBuffer(s);
		 
		System.out.println("copied string is: "+strCopy);
	}
}