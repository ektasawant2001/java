class stringConcat{
	public static void main(String[] args){
		String s="hello"+"world!";
		System.out.println("s: "+s);
		
		//StringBuffer sb= new StringBuffer(s);
		StringBuilder sb=new StringBuilder(s);
		sb.append(" good").append(" morning:)");
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
		sb.delete(1,5);
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
		sb.insert(1,"ey");
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
	
	
	}
}