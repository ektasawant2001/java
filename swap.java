//Write a Java program to Swap two numbers using third variable
import java.util.Scanner;
public class swap{
public static void main(String[] args){
 int a,b,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two Numbers: ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("The values of a and b berfore swapping: a="+a+" b="+b);
t=a;
a=b;
b=a;
System.out.println("The values of a and b after swapping: a="+a+" b="+b);
}
}

