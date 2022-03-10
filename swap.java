import java.util.Scanner;
public class swap{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		
		System.out.println("Enter the value of a: ");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("value of a : "+ a + "\nvalue of b : "+b);
	}
}
		
		
		