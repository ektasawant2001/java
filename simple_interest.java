import java.util.Scanner;
public class simple_interest{
	public static void main(String[] args){
		float p,r,si,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the principal amount, rate of interest and number of years : ");
		p = sc.nextFloat();
		r = sc.nextFloat();
		n = sc.nextFloat();
		
		si =(p * r * n ) * 0.01f;
	
		System.out.println("The simple interest is : "+si);	
	}
}