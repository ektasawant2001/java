import java.util.*; 
 public class ReverseNum{
	public static void main(String[] args){
		int x,y=0,r;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number: ");
		x=sc.nextInt();
		while(x!=0){
			r=x%10;
			y=y*10+r;
			x=x/10;
		}
		System.out.println("reverse number is : "+y);
	}
 }
		