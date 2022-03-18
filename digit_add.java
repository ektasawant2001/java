import java.util.Scanner;
public class digit_add{
	public static void main(String[] args){
		int n,rem,total=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		n = sc.nextInt();
		
		while(n != 0){
			rem = n % 10;
			total = total + rem;
			n = n/10;
		}
	
		System.out.println("The addition of digit is : "+total);	
	}
}