import java.util.Scanner;
public class discount_item{
	public static void main(String[] args){
		int a,b,c,d,total;
		float TBill, dis;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter price of 4 items): ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		total = a+b+c+d;
		
		dis = total*0.12f;
		
		TBill = total - dis;
		System.out.println("The total bill before discount is : "+total+"\nThe discount is : "+dis+"\nThe total bill after discount is :"+TBill);	
	}
}