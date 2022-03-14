import java.util.Scanner;

public class  str_compare{
	public static void main(String[] args){
		String str1,str2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		str1 = sc.nextLine();
		
		System.out.print("Enter second string: ");
		str2 = sc.nextLine();
		
		if((str1).compareTo(str2)>0){
			System.out.println("First string is larger than second string");
		}
		else if((str1).compareTo(str2)<0){
			System.out.println("Second string is larger than first string");
		}
		else
		System.out.println("Both strings are equal");
	}
}