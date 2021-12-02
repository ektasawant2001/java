public class array{
	public static void main(String[] args){
		int[] iArray ={0,1,2,3,4,5,6,7,8,9};
		int i=0, j=0;
		for(i = 1 , j = 1; i < iArray.length && j < iArray.length;i++,j++){
		System.out.println(iArray[i]+" "+iArray[j]);
		}
	}
}