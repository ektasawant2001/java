//Write a Java Program to find Addition of two numbers by input value from keyboard
import java.util.Scanner;
public class add{
public static void main(String[] args){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
}
}
