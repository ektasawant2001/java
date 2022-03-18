import java.util.Scanner;
public class interchange{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before interchange A = "+a+" B = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After interchange A = "+a+" B = "+b);
	}
}