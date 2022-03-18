import java.util.Scanner;
public class grp_marks{
	public static void main(String[] args){
		int p,c,m,total;
		float per;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of physics, chemistry and maths(out of 100): ");
		p = sc.nextInt();
		c = sc.nextInt();
		m = sc.nextInt();
		
		total = p + c + m;
		
		per = (total / 3.0f); // per = (total/3.0f);
		
		System.out.println("The total marks obtained(out of 300): "+total+"\nThe Group percentage is: "+per);
		
		
	}
}