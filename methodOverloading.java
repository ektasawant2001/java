public class methodOverloading{
	static void go(int[] array){
		System.out.println("Array[0]: "+array[0]);
		System.out.println("Array[1]: "+array[1]);
		array[1]=22;
	}
	static void go(int i){
		System.out.println("\ngo(int i)");
	}
	static void go(short s){
		System.out.println("\ngo(short s)");
	}
	
	public static void main(String[] args){
		int[] array={1,2};
		go(array);
		System.out.println("Array[1]: "+array[1]);
		
		go(1000);
		
		byte b=22;
		go(b);
	}
}
	