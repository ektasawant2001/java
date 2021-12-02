public class ternary{
	public static int min(int x,int y){
		return (x<y) ? x: y;
	}
	
	public static void main(String[] args){
		int min = min(78,9);
		System.out.println("Min: "+min);
		}
}