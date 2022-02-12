public class X extends AbstractA implements A,B,C,Cloneable{
	public void foo(){
		System.out.println("X: foo");
		System.out.println("VAL: "+A.VAL);
		System.out.println("VAL: "+B.VAL);
	}
	public void fooBar(){
		System.out.println("X: fooBar");
	}
	
	public C clone(){
		try{
			return (C) super.clone();
		}catch(CloneNotSupportedException e ){
			e.printStackTrace();
		}
		return null;
	}
}