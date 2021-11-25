public class operators{
	 
	 static void preAndpost(){
		 System.out.println("\n----------------------------------------");
		 System.out.println("Inside PrePost");
		 int x=5;
		/* x--;
		 //--x;
		 System.out.println("X: "+x);
		 
		 int y=x++;      //--x,++x
		 System.out.println("Y: "+y+" ,X: "+x);*/
		 
		 int index= 0 ;
		 int[] array=new int[3];
		 array[index++]=10;//++index
		 array[index++]=20;//++index
		 array[index++]=30;//++index
		 System.out.println(index);
		 System.out.println("\n----------------------------------------");
	 }
	 static void compoundArithmeticAssignment(){
		 int x=100;
		 System.out.println("\n----------------------------------------");
		 System.out.println("X+=5: "+(x+=5));
		 System.out.println("X-=5: "+(x-=5));
		 System.out.println("X*=5: "+(x*=5));
		 System.out.println("X/=5: "+(x/=5));
		 System.out.println("X%=5: "+(x%=5));
		 System.out.println("\n----------------------------------------");
	 }
		
	
	public static void main(String[] args){
		preAndpost();
		compoundArithmeticAssignment();
	}
}