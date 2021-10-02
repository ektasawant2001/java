import java.util.Scanner;
public class swapping {
    public static void main(String args[]) {
        int a,b,t;
        Scanner s=new Scanner(System.in);
      System.out.println("Enter two Numbers");
      a=s.nextInt();
      b=s.nextInt();
      System.out.println("The value of a="+a+" and b="+b+" before swapping");
      t=a;
      a=b;
      b=t;
      System.out.println("The value of a="+a+" and b="+b+" aFter swapping");
    }
}
