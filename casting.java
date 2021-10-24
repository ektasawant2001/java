public class casting{
static void typeCasting(){
	System.out.println("\nInside TypeCasting.....");
	//Explicit casting
	long y=42;
	//int x=y;
	int x=(int)y;

	//information loss due to out-of-range asssignment
	byte narrowdByte=(byte)123456;
	System.out.println("narrowdByte: "+narrowdByte);

	//trunction
	int iTruncated=(int)0.99;
	System.out.println("iTruncated: "+iTruncated);

	//implicit cast(int to long)
 	y=x;

	//implicit cast(char to int)
	char cChar='A';
	int iInt=cChar;
	System.out.println("iInt: "+iInt);

	//byte to char using an explicit cast
	byte bByte=65;
	cChar=(char)bByte;//special conversion (widening from byte--->int followed by narrowing from int--->char)
	System.out.println("cChar: "+cChar);
	}
	public static void main(String[] args){
	typeCasting();
	}
}