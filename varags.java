public class varags{
	
	static void varagsOverload(boolean b,int i,int j,int k){
		System.out.println("\nInside varagsOverload without varags.....");
	}
	
	static void varagsOverload(boolean b,int... list){
		System.out.println("\nInside varagsOverload with varags.....");
		System.out.println("\nList.length: "+list.length);
	}
	public static void main(String[] args){
		varagsOverload(true,1,2,3);
		varagsOverload(true,1,2,3,4,5,6,7,8);
		varagsOverload(true);
	}
}
	