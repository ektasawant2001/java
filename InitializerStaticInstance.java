public class InitializerStaticInstance{
	public InitializerStaticInstance(){
		System.out.println("Inside no-arg constructor......");
	}
	
	public InitializerStaticInstance(int id){
		System.out.println("Inside constructor with a parameter ......");
	}
	
	{
		System.out.println("Inside Instance Initializer ......");
	}
	
	public static void main(String[] args){
		//InitializerStaticInstance bd = new InitializerStaticInstance();
		InitializerStaticInstance bd = new InitializerStaticInstance(1);
	}

}